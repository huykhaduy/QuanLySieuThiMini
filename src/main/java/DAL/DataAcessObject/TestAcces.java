package DAL.DataAcessObject;

import DAL.DataModels.*;

import javax.swing.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

class TestAcce {

    public static void main(String[] args) {
//        testLoginDetail();
        JOptionPane.showMessageDialog(null, "Done","Title",JOptionPane.OK_OPTION);
    }

    public static void testLoaiSanPham() {
        LoaiSanPhamDAO loaiSanPhamDAO = new LoaiSanPhamDAO();
        LoaiSanPham loaisanpham = new LoaiSanPham();
        //Save
        loaiSanPhamDAO.save(loaisanpham);
        //Find
        LoaiSanPham lsp = loaiSanPhamDAO.find(1);
        if (lsp != null) {
            System.out.println(lsp);
            //Update
            lsp.setTenLoai("Laptop");
            loaiSanPhamDAO.update(lsp);
        }
        //FindAll
        List<LoaiSanPham> list = loaiSanPhamDAO.findAll();
        for (LoaiSanPham lsp1 : list) {
            System.out.println(lsp1);
        }
        //Delete
        loaiSanPhamDAO.delete(2);
    }

    public static void testChucVu() {
        ChucVuDAO chucVuDAO = new ChucVuDAO();
        //Find
        ChucVu cv = chucVuDAO.find(1);
        if (cv != null) {
            System.out.println(cv);
            //Update
            cv.setMoTa("Chức vụ bán hàng");
            chucVuDAO.update(cv);
        }
        //FindAll
        List<ChucVu> list = chucVuDAO.findAll();
        for (ChucVu cv1 : list) {
            System.out.println(cv1);
        }
        ChucVu chucvu = new ChucVu();
        //Save
        chucVuDAO.save(chucvu);
        //Delete
        chucVuDAO.delete(2);
    }

    public static void testKhachHang() {
        KhachHangDAO khachHangDAO = new KhachHangDAO();
        KhachHang khachhang = new KhachHang();
        //Save
        khachHangDAO.save(khachhang);
        //Find
        KhachHang kh = khachHangDAO.find(1);
        if (kh != null) {
            System.out.println(kh);
            //Update
            kh.setHoTen("Nguyễn Văn A");
            kh.setDiaChi("Hà Nội");
            kh.setSdt("0987654321");
            kh.setEmail("duy@gmail.com");
            khachHangDAO.update(kh);
        }
        //FindAll
        List<KhachHang> list = new ArrayList<>();
        list = khachHangDAO.findAll();
        for (KhachHang kh1 : list) {
            System.out.println(kh1);
        }
        //Delete
        khachHangDAO.delete(2);
    }

    public static void testNhanVien() {
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        NhanVien nhanvien = new NhanVienQuanLy();
        //Save
        nhanVienDAO.save(nhanvien);
        //Find
        NhanVien nv = nhanVienDAO.find(1);
        if (nv != null) {
//            System.out.println(nv);
            //Update
            nv.setHoTen("Nguyễn Văn A");
            nv.setDiaChi("Hà Nội");
            nv.setSdt("0987654321");
            nv.setEmail("nun");
            nhanVienDAO.update(nv);
        }
        //FindAll
        List<NhanVien> list = new ArrayList<>();
        list = nhanVienDAO.findAll();
        for (NhanVien nv1 : list) {
            System.out.println(nv1);
        }
        //Delete
        nhanVienDAO.delete(2);
    }

    public static void testTaiKhoan() {
        TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
        TaiKhoan tk = new TaiKhoan("duy39821", "123456", 5, new Timestamp(System.currentTimeMillis()), false, false, 1);
        //Save
        taiKhoanDAO.save(tk);
        //Find
        TaiKhoan tk1 = taiKhoanDAO.find("duy39821");
        if (tk1 != null) {
            System.out.println(tk1);
            //Update
            tk1.setMatKhau("03123123");
            taiKhoanDAO.update(tk1);
        }
        //FindAll
        List<TaiKhoan> list = new ArrayList<>();
        list = taiKhoanDAO.findAll();
        for (TaiKhoan tk2 : list) {
            System.out.println(tk2);
        }
        //Delete
        taiKhoanDAO.delete("duy3908");
    }

    public static void testLoginDetail() {
        LoginDetailDAO loginDetailDAO = new LoginDetailDAO();
        LoginDetail ld = new LoginDetail();
        //Save
        loginDetailDAO.save(ld);
        //Find
        LoginDetail ld1 = loginDetailDAO.find(1);
        if (ld1 != null) {
            System.out.println(ld1);
            //Update
            ld1.setAuthKey("Somekey");
            loginDetailDAO.update(ld1);
        }
        //FindAll
        List<LoginDetail> list = new ArrayList<>();
        list = loginDetailDAO.findAll();
        for (LoginDetail ld2 : list) {
            System.out.println(ld2);
        }
        //Delete
        loginDetailDAO.delete(2);
    }
}

//    public static void testNhapHang(){
//        PhieuNhapDAO nhapHangDAO = new PhieuNhapDAO();
//        PhieuNhap nhaphang = new PhieuNhap();
//        //Save
//        nhapHangDAO.save(nhaphang);
//        //Find
//        PhieuNhap nh = nhapHangDAO.find(1);
//        if (nh != null) {
//            System.out.println(nh);
//            //Update
//            nh.setNgayNhap(new Timestamp(System.currentTimeMillis()));
//            nh.setTongTien(1200000);
//            nh.setMaNhanVien(1);
//            nh.setMaNhaCungCap(1);
//            nhapHangDAO.update(nh);
//        }
//        //FindAll
//        List<NhapHang> list = new ArrayList<>();
//        list = nhapHangDAO.findAll();
//        for (NhapHang nh1 : list) {
//            System.out.println(nh1);
//        }
//        //Delete
//        nhapHangDAO.delete(2);
//    }
//
//    public static void testNhaCungCap(){
//        NhaCungCapDAO nhaCungCapDAO = new NhaCungCapDAO();
//        NhaCungCap ncc = new NhaCungCap();
//        //Save
//        nhaCungCapDAO.save(ncc);
//        //Find
//        NhaCungCap ncc1 = nhaCungCapDAO.find(1);
//        if (ncc1 != null) {
//            System.out.println(ncc1);
//            //Update
//            ncc1.setTenNhaCungCap("NCC1");
//            ncc1.setDiaChi("Hà Nội");
//            ncc1.setSdt("0987654321");
//            ncc1.setEmail("nun");
//            nhaCungCapDAO.update(ncc1);
//        }
//        //FindAll
//        List<NhaCungCap> list = new ArrayList<>();
//        list = nhaCungCapDAO.findAll();
//        for (NhaCungCap ncc2 : list) {
//            System.out.println(ncc2);
//        }
//        //Delete
//        nhaCungCapDAO.delete(2);
//    }
//}