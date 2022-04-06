package DAL.DataAcessObject;

import DAL.DataModels.LoaiSanPham;
import DAL.DataModels.NhaCungCap;
import DAL.DataModels.SanPham;

import java.util.List;

public class TestClass {
    public static void main(String[] args) {

    }



    public static void testSanPham(){
        SanPham sp = new SanPham(0,"Sua ong tho","Sua ong tho tiet trung vinamlik 100% sua bo","D:/img/image.png",36000,1,1,1,false);
        SanPhamDAO sanPhamDAO = new SanPhamDAO();
        if (sanPhamDAO.insert(sp))
            System.out.println("Insert success");
        else
            System.out.println("Insert fail");

        sp.setGiaTien(360033120);
        if (sanPhamDAO.update(1,sp))
            System.out.println("Update success");
        else
            System.out.println("Update fail");

        if (sanPhamDAO.delete(1))
            System.out.println("Delete success");
        else
            System.out.println("Delete fail");

        List<SanPham> list = sanPhamDAO.selectAll();
        for (SanPham sanPham : list) {
            System.out.println(sanPham);
        }

    }

    public static void testLoaiSanPham(){
        LoaiSanPhamDAO loaiSanPhamDAO = new LoaiSanPhamDAO();
        LoaiSanPham lsp = new LoaiSanPham(1,"Laptop","Laptop de nang cao",false);
        System.out.println(lsp);

        if (loaiSanPhamDAO.insert(lsp)){
            System.out.println("Insert success");
        };

        if (loaiSanPhamDAO.update(1,lsp)){
            System.out.println("Update success");
        } else {
            System.out.println("Update fail");
        }

        if (loaiSanPhamDAO.delete(1)){
            System.out.println("Delete success");
        } else {
            System.out.println("Delete fail");
        }

        List<LoaiSanPham> list = loaiSanPhamDAO.selectAll();
        for (LoaiSanPham loaiSanPham : list) {
            System.out.println(loaiSanPham);
        }
    }

    public static void testNhaCungCap(){
        NhaCungCapDAO nhaCungCapDAO = new NhaCungCapDAO();
        NhaCungCap ncc = new NhaCungCap(1,"Duy","Ho Chi Minh","123","supply@gmail.com",false);
        System.out.println(ncc);

        if (nhaCungCapDAO.insert(ncc)){
            System.out.println("Insert success");
        };

        if (nhaCungCapDAO.update(1,ncc)){
            System.out.println("Update success");
        } else {
            System.out.println("Update fail");
        }

        if (nhaCungCapDAO.delete(1)){
            System.out.println("Delete success");
        } else {
            System.out.println("Delete fail");
        }

        List<NhaCungCap> list = nhaCungCapDAO.selectAll();
        for (NhaCungCap nhaCungCap : list) {
            System.out.println(nhaCungCap);
        }
    }
}
