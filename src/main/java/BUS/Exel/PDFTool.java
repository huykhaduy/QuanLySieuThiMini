package BUS.Exel;

import BUS.BusAccessor.CTHoaDonBUS;
import BUS.BusAccessor.HoaDonBUS;
import BUS.BusAccessor.KhachHangBUS;
import BUS.BusAccessor.NhanVienBUS;
import DTO.ChiTietHoaDon;
import DTO.HoaDon;
import DTO.KhachHang;
import DTO.NhanVien;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import BUS.SaleServices.Money;

public class PDFTool {
    private static String desktopPath = System.getProperty("user.home") + "/Desktop";
    private static String projectPath = System.getProperty("user.dir");
    private static HoaDonBUS hdBus = new HoaDonBUS();
    private static NhanVienBUS nvBus = new NhanVienBUS();
    private static CTHoaDonBUS ctHdBus = new CTHoaDonBUS();
    private static KhachHangBUS khBUS = new  KhachHangBUS();
    
    public static void exportHoaDonPDF(int maHoaDon) {
        HoaDon hd = hdBus.get(maHoaDon);
        if (hd == null)
            return;
        NhanVien nv = nvBus.get(hd.getMaNV());
        if (nv == null)
            return;
        List<ChiTietHoaDon> listChiTiet = ctHdBus.getByKey1(maHoaDon);
        String dest = projectPath + "/Report_Excel/hoadon_"+maHoaDon+".pdf";
        //Khoi tao ghi file
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(dest));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PdfTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PDFTool.class.getName()).log(Level.SEVERE, null, ex);
        }
        doc.open();   
        
        
    }
    
    //Create directory at desktop if it doesn't exist
    public static void createDirectoryIfNotExist(String dirname){
        File f = new File(projectPath+"/"+dirname);
        if (!f.exists()){
            boolean isSuccess = f.mkdir();
            if (isSuccess)
                System.out.println("Create successfully directory " + f.getAbsolutePath());
            else
                System.out.println("Can't create " + f.getAbsolutePath());
        }
    }
    
    public static void HTMLStringToPDF(String html, String outputPath){
        try {
            HtmlConverter.convertToPdf(html,
                    new FileOutputStream(outputPath));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PDFTool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PDFTool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void renderPDF(int maHoaDon){
        createDirectoryIfNotExist("Report_Excel");
        String outputFolder = projectPath + "/Report_Excel/hoadon_"+maHoaDon+".pdf";
        HoaDon hd = hdBus.get(maHoaDon);
        if (hd == null)
            return;
        NhanVien nv = nvBus.get(hd.getMaNV());
        if (nv == null)
            return;
        KhachHang kh = khBUS.get(hd.getMaKH());
        String tenKH = "";
        if (kh != null)
            tenKH = kh.getTenKH();
        List<ChiTietHoaDon> listChiTiet = ctHdBus.getByKey1(maHoaDon);
        String listProductContent = HTMLTemplate.convertChiTietSPToHTML(listChiTiet);
        String html = HTMLTemplate.getHTMLTemplate(hd.getMaHD()+"", hd.getNgayHD().toString(), nv.getTenNV(), tenKH, listProductContent, Money.format(hd.getTongTien()), Money.format(hd.getTienGiam()), Money.format(hd.getTongTien()-hd.getTienGiam()));
        HTMLStringToPDF(html, outputFolder);
    }

    public static void main(String[] args) {
        renderPDF(4);
    }
}
