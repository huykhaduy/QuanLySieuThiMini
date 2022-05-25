package BUS.BusAccessor;

import DAL.DataAcessObject.NhanVienDAO;
import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataModels.ChiTietHoaDon;
import DAL.DataModels.NhanVien;
import DAL.DataModels.SanPham;
import java.util.ArrayList;
import java.util.List;

public  class SanPhamBUS implements IBussAccess<SanPham, Integer>{
    private final SanPhamDAO sanPhamDAO =new  SanPhamDAO();
    private final LoaiSanPhamBUS loaiSPBus = new LoaiSanPhamBUS();
    private final CTHoaDonBUS ctHoaoDonBus = new CTHoaDonBUS();
    
    @Override
    public SanPham get(Integer maSanPham) {
        return sanPhamDAO.select(maSanPham);
    }
    
    public SanPham getHide(Integer maSanPham) {
        return sanPhamDAO.selectHide(maSanPham);
    }

    @Override
    public List<SanPham> getAll() {
       return sanPhamDAO.selectAll();
    }

    @Override
    public boolean add(SanPham sanpham) {
        return  sanPhamDAO.insert(sanpham);
    }

    @Override
    public boolean edit(Integer maSanPham, SanPham sanpham) {
       return sanPhamDAO.update(maSanPham, sanpham);
    }

    @Override
    public boolean remove(Integer maSanPham ) {
      return sanPhamDAO.delete(maSanPham);
    }
    
    @Override
    public SanPham getNewest() {
       return sanPhamDAO.selectNewest();
    }
    
    // Lay san pham theo ma loai
    public List<SanPham> getProductByType(int maLoai){
        return sanPhamDAO.selectByLoaiSP(maLoai);
    }
    
    public List<SanPham> getProductByName(String name){
        return sanPhamDAO.selectByTenSP(name);
    }
    
    public List<SanPham> getProductByNamORMoTa(String finkey){
        return sanPhamDAO.selectTenHayMoTa(finkey);
    }
    
    public List<SanPham> getProductByTypeAndName(int maLoai, String name){
        if (maLoai == 0){
            return this.getProductByName(name);
        }
        return sanPhamDAO.selectByTenSPAndLoaiSP(maLoai, name);
    }
    
    public List<SanPham> getProductByNCC(String nccInfo){
        return sanPhamDAO.selectByNhaCungCap(nccInfo);
    }
    
    public List<SanPham> getProductByPrice(String minPrice, String maxPrice){
        return sanPhamDAO.selectByMoney(minPrice, maxPrice);
    }
    
    public void thayDoiSoLuong(Integer maSP, int soLuongThayDoi){
        SanPham sp = this.get(maSP);
        sp.setSoLuong(sp.getSoLuong()+soLuongThayDoi);
        this.edit(maSP, sp);
    }
    
    public String getTenLoai(int maSP){
        return loaiSPBus.get(this.get(maSP).getMaLoai()).getTenLoai();
    }
    
    public int getSoLuongDaBan(int maSP){
        List<ChiTietHoaDon> list = ctHoaoDonBus.getByKey2(maSP);
        int tong = 0;
        if (list != null && !list.isEmpty()){
            for (ChiTietHoaDon ct : list){
                tong += ct.getSoLuong();
            }
        }
        return tong;
    }
    
    public long getTongTienThu(int maSP){
        List<ChiTietHoaDon> list = ctHoaoDonBus.getByKey2(maSP);
        long tong = 0;
        if (list != null && !list.isEmpty()){
            for (ChiTietHoaDon ct : list){
                tong += ct.getGiaTien();
            }
        }
        return tong;
    }
    
    public List<SanPham> layPhanGiaoNhauGiua2List(List<SanPham> list1, List<SanPham> list2){
        List<SanPham> result = new ArrayList<>();
        if (list1.isEmpty() || list2.isEmpty()) return result;
        for (int i= list1.size()-1;i>=0;i--){
            for (int j = list2.size()-1;j>=0;j--){
                SanPham sp1 = list1.get(i);
                SanPham sp2 = list2.get(j);
                if (sp1.getMaSP() == sp2.getMaSP()){
                    result.add(sp1);
                    list1.remove(sp1);
                    list2.remove(sp2);
                    i--;
                    j--;
                }
            }
        }
        return result;
    }
    
    public List<SanPham> advancedFilter(String tenHoacMoTa, String minPrice, String maxPrice, int maLoai, String maNCC){
        List<SanPham> result = null;
        if (!tenHoacMoTa.isEmpty() && !tenHoacMoTa.isBlank()){
            result = this.getProductByNamORMoTa(tenHoacMoTa);
            if (result.isEmpty()) return result;
        }
        if (maLoai > 0){
            List<SanPham> tempList = this.getProductByType(maLoai);
            if (result != null){
                result = this.layPhanGiaoNhauGiua2List(tempList, result);
            } else result = tempList;
            if (result.isEmpty()) return result;
        }
        if (!maNCC.isBlank() && !maNCC.isEmpty()){
            List<SanPham> tempList = this.getProductByNCC(maNCC);
            if (result != null){
                result = this.layPhanGiaoNhauGiua2List(tempList, result);
            } else result = tempList;
            if (result.isEmpty()) return result;
        }
        List<SanPham> tempList = this.getProductByPrice(minPrice, maxPrice);
        if (result != null){
            result = this.layPhanGiaoNhauGiua2List(tempList, result);
        } else result = tempList;
        return result;
    }
}

   