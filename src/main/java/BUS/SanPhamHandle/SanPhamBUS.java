
package BUS.SanPhamHandle;

import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataModels.SanPham;


public class SanPhamBUS {
    SanPhamDAO spDao = new SanPhamDAO();
    public boolean AddSanPham (String Gia,String Ten,String nhaCungCap,String Loai,String Mota,String url)
            {
                SanPham sp =new SanPham();
                Long gia =Long.valueOf(Gia);
                sp.setGiaTien(gia);
                int loai = Integer.valueOf(Loai);
                sp.setMaLoai(0);
                int NhaCC = Integer.valueOf(nhaCungCap);
                sp.setMaNCC(NhaCC);
                sp.setTenSP(Ten);
                sp.setMoTa(Mota);
                sp.setHinhAnh(url);
                return spDao.insert(sp);
            }
}
