/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Exel;
import DAL.DataAcessObject.ChiTietHoaDonDAO;
import  DAL.DataAcessObject.HoaDonDAO;
import DAL.DataAcessObject.NhanVienDAO;
import DAL.DataAcessObject.SanPhamDAO;
import com.itextpdf.text.Font;

import DAL.DataModels.ChiTietHoaDon;
import DAL.DataModels.HoaDon;
import DAL.DataModels.NhanVien;
import DAL.DataModels.SanPham;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author tiend
 */

public class PdfTest {
    private static ChiTietHoaDonDAO cthoaDonDAO = new ChiTietHoaDonDAO();
    private static HoaDonDAO hoaDonDAO = new HoaDonDAO();
    private static NhanVienDAO nhanVienDAO = new NhanVienDAO();
    private static SanPhamDAO sanPhamDAO = new SanPhamDAO();
    
//     public static  Connection getConnecttion() throws Exception{
//    Class.forName("com.mysql.jdbc.Driver");
//    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sieuthimini","root","");
//    return con;
//    }
    public static void convertToPDF(int maHoaDon) throws DocumentException{
//        List<ChiTietHoaDon> cthoadonList=new ArrayList<ChiTietHoaDon>();
//        List<HoaDon> hoadonList=new ArrayList<HoaDon>();
//        List<String> chuoitensp= new ArrayList<String>();
//        List<String> chuoitennv= new ArrayList<String>();
//        ChiTietHoaDonDAO cthoaDonDAO = new ChiTietHoaDonDAO();
//        HoaDonDAO hoaDonDAO=new HoaDonDAO();
//        hoadonList=hoaDonDAO.selectAll();//lay csdl hoadon dua vao hoadonlist
//        cthoadonList=cthoaDonDAO.selectAll();// lay csdl cthoadon dua vao cthoadonlist
//        try { 
//            Connection con1= getConnecttion();
//            Statement stmt=con1.createStatement();
//            String sql="SELECT sanpham.TENSP FROM cthoadon,sanpham WHERE cthoadon.MASP = sanpham.MASP ORDER BY MAHD";//lay Ten San Pham dua vao chuoitensp
//            ResultSet rs= stmt.executeQuery(sql);
//            while (rs.next()) {
//               chuoitensp.add(rs.getString(1));
//                
//            }
//           
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        try { 
//            Connection con11= getConnecttion();
//            Statement stmt1=con11.createStatement();
//            String sql1="SELECT TENNV FROM nhanvien,hoadon WHERE nhanvien.MANV=hoadon.MANV ORDER BY MAHD";//LAY TEN NHAN VIEN dua vao chuoitennv theo danh sách hóa đơn tu tren xuong theo MAHD
//            ResultSet rs1= stmt1.executeQuery(sql1);
//            while (rs1.next()) {
//               chuoitennv.add(rs1.getString(1));
//                
//            }
//           
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        
        File f= new File("src\\main\\java\\DAL\\Exel\\hoadon-pdf");
        String path="";
        path= f.getAbsoluteFile().getPath();
//        BaseFont bf = BaseFont.createFont(/*"resources/ARIAL.TTF"*/ "c:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, true);
//        Font font = new Font(bf, 12, Font.BOLD);
        HoaDon hoadon = hoaDonDAO.select(maHoaDon);
        if (hoadon == null){
            return;
        }
        NhanVien nv = nhanVienDAO.select(hoadon.getMaNV());
        if (nv == null){
            return;
        }
        List<ChiTietHoaDon> listChiTiet = cthoaDonDAO.selectAllById1(maHoaDon);
        
        //Khoi tao ghi file
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "\\hoadon" + maHoaDon + ".pdf"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PdfTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        doc.open();
        String para = String.format("%-100s%-12s\n\n%-85s%-12s\n\n\n", "MÃ HÓA DON:" + String.valueOf(hoadon.getMaHD()), "MA NHAN VIEN:" + String.valueOf(nv.getMaNV()), "NGAY HOA DON:" + String.valueOf(hoadon.getNgayHD()), "TENNV:" + nv.getTenNV());
        PdfPTable tb1 = new PdfPTable(4);
        Paragraph paragraph1 = new Paragraph(para);
        tb1.addCell("STT");
        tb1.addCell("TENSP");
        tb1.addCell("SOLUONG");
        tb1.addCell("GIATIEN");
        int intstt = 0;// so thu tu trong 
        for (ChiTietHoaDon cthd : listChiTiet) {
            String stt = String.valueOf(++intstt);
            SanPham sp = sanPhamDAO.select(cthd.getMaSP());
            String tensp = String.valueOf(cthd.getMaSP()) + "." + sp.getTenSP();
            String soluong = String.valueOf(cthd.getSoLuong());
            String giatien = String.valueOf(cthd.getGiaTien());
            tb1.addCell(stt);
            tb1.addCell(tensp);
            tb1.addCell(soluong);
            tb1.addCell(giatien);
        }
        String para2 = String.format("\n\n%-100s%-12s", "Xin cam on quy khach", "Tong tien:" + hoadon.getTongTien());
        Paragraph paragraph2 = new Paragraph(para2);
        doc.add(paragraph1);
        doc.add(tb1);
        doc.add(paragraph2);
        doc.close();
//        }
        
    }
    
    public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException {
//        List<ChiTietHoaDon> cthoadonList=new ArrayList<ChiTietHoaDon>();
//        ChiTietHoaDonDAO cthoaDonDAO = new ChiTietHoaDonDAO();
//        cthoadonList=cthoaDonDAO.selectAll();
//        System.out.println(cthoadonList);
       
        convertToPDF(1);
        
        
       
    }
}
