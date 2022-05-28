
package GUI.ManageGroup.Handle.SanPhamHandle;

import DAL.DataAcessObject.SanPhamDAO;
import DTO.SanPham;


public class SanPhamToData {
    SanPhamDAO spDao = new SanPhamDAO();
    public boolean AddSanPham (String Gia,String Ten,int nhaCungCap,int Loai,String Mota,String url)
            {
                SanPham sp =new SanPham();
                Long gia =Long.valueOf(Gia);
                sp.setGiaTien(gia);
                int loai = Integer.valueOf(Loai);
                sp.setMaLoai(loai);
                int NhaCC = Integer.valueOf(nhaCungCap);
                sp.setMaNCC(NhaCC);
                sp.setTenSP(Ten);
                sp.setMoTa(Mota);
                sp.setHinhAnh(url);
                return spDao.insert(sp);
            }
}
