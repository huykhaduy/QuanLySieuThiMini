package DAL.DataAcessObject;

import DAL.DataModels.SanPham;

import java.util.List;

public class SanPhamDAO extends AbtractAccessDatabase<SanPham> implements ISimpleAccess<SanPham, Integer> {

    {
        setClazz(SanPham.class);
    }

    @Override
    public boolean insert(SanPham sanPham) {
        return executeUpdate("INSERT INTO SanPham(TENSP, MOTA, SOLUONG, HINHANH, GIATIEN, MALOAI, MANCC, IS_DELETED) VALUES(?,?,?,?,?,?,?,?)",
                sanPham.getTenSP(), sanPham.getMoTa(), sanPham.getSoLuong(), sanPham.getHinhAnh(), sanPham.getGiaTien(), sanPham.getMaLoai(), sanPham.getMaNCC(), sanPham.isDeleted());

    }

    @Override
    public boolean delete(Integer maSanPham) {
        return executeUpdate("UPDATE SanPham SET IS_DELETED = 1 WHERE MASP = ?", maSanPham);
    }

    @Override
    public boolean update(Integer maSanPham, SanPham sanPham) {
        return executeUpdate("UPDATE SanPham SET TENSP = ?, MOTA = ?, SOLUONG = ?, HINHANH = ?, GIATIEN = ?, MALOAI = ?, MANCC = ?, IS_DELETED = ? WHERE MASP = ?",
                sanPham.getTenSP(), sanPham.getMoTa(), sanPham.getSoLuong(), sanPham.getHinhAnh(), sanPham.getGiaTien(), sanPham.getMaLoai(), sanPham.getMaNCC(), sanPham.isDeleted(), maSanPham);
    }

    @Override
    public SanPham select(Integer maSanPham) {
        return executeQuery("SELECT * FROM SanPham WHERE MASP = ?", maSanPham);
    }
    
    // Dung cho panel nhap xuat san pham
    public SanPham selectHide(Integer maSanPham) {
        return executeQuery("SELECT * FROM SanPham WHERE MASP = ? AND IS_DELETED = 0", maSanPham);
    }

    @Override
    public List<SanPham> selectAll() {
        return executeQueryList("SELECT * FROM SanPham WHERE IS_DELETED = 0");
    }
    
    public SanPham selectNewest(){
        return executeQuery("SELECT * FROM SANPHAM ORDER BY MASP DESC LIMIT 1");
    }
    
    public List<SanPham> selectByLoaiSP(int maLoai){
        return executeQueryList("SELECT * FROM SanPham WHERE MALOAI = ? AND IS_DELETED = 0", maLoai);
    }
    
    public List<SanPham> selectByTenSP(String tenSP){
        String searchStr = "%"+tenSP+"%";
        return executeQueryList("SELECT * FROM SanPham WHERE TENSP LIKE ? AND IS_DELETED = 0", searchStr);
    }
    
    public List<SanPham> selectTenHayMoTa(String findKey){
        String searchStr = "%"+findKey+"%";
        return executeQueryList("SELECT * FROM SanPham WHERE (MOTA LIKE ? OR TENSP LIKE ?) AND IS_DELETED = 0", searchStr, searchStr);
    }
    
    public List<SanPham> selectByNhaCungCap(String maNCC){
        int maNCCint = 0;
        try{
            maNCCint = Integer.parseInt(maNCC);
        } catch (NumberFormatException e){
            // Neu khong chuyen qua dc: la chuoi string
            String searchStr = "%"+maNCC+"%";
            return executeQueryList("SELECT SANPHAM.* FROM SANPHAM, NHACUNGCAP WHERE SANPHAM.MANCC = NHACUNGCAP.MANCC AND SANPHAM.IS_DELETED=0 AND NHACUNGCAP.TENNCC LIKE ?", searchStr);
        }
        //Neu chuyen qua dc
        return executeQueryList("SELECT * FROM SANPHAM WHERE MANCC = ? AND IS_DELETED=0", maNCCint);
    }
    
    public List<SanPham> selectByMoney(String minMoney, String maxMoney){
         return executeQueryList("SELECT * FROM SANPHAM WHERE (GIATIEN >= ? AND GIATIEN <= ?) AND IS_DELETED=0", minMoney, maxMoney);
    }
    
    public List<SanPham> selectByTenSPAndLoaiSP(int maLoai,String tenSP){
        String searchStr = "%"+tenSP+"%";
        return executeQueryList("SELECT * FROM SanPham WHERE MALOAI = ? AND TENSP LIKE ?", maLoai, searchStr);
    }
    
}
