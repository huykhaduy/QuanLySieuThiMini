/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Exel;

import DAL.DataModels.GiamGiaSP;
import DAL.DataModels.SanPham;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author tiend
 */
public class sanphamexcel {
    public static ArrayList<SanPham> spList=new ArrayList<SanPham>();

    public static void sanphamtuexcel() throws FileNotFoundException, IOException{
       
        File f= new File("src\\main\\java\\DAL\\Exel\\sp.xlsx");
        FileInputStream file = new FileInputStream(f.getAbsoluteFile());
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet  sheet=workbook.getSheetAt(0);
        DataFormatter fmt = new DataFormatter();
        for(Row row:sheet){
             SanPham test1= new SanPham();
             if(row.getCell(0)!= null){
                 Cell cell = row.getCell(0);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    
                    if (! value.trim().isEmpty()) {
                        test1.setMaSP(Integer.parseInt(value));
                    }
                 }
             }
            if(row.getCell(1)!= null){
                
                Cell cell = row.getCell(1);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                   if (! value.trim().isEmpty()) {
                       
                       test1.setTenSP(value);
                       
                   }
                }
            }
            if(row.getCell(2)!= null){
                
                Cell cell = row.getCell(2);
                 if(cell!=null) {
                  String value = fmt.formatCellValue(cell);
                     
                    if (! value.trim().isEmpty()) {
                       test1.setMoTa(value);
                    }
                 }
             }
             if(row.getCell(3)!= null){
                 Cell cell = row.getCell(3);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    if (! value.trim().isEmpty()) {
                        test1.setHinhAnh(value);
                    }
                 }
             }
            if(row.getCell(4)!= null){
                 Cell cell = row.getCell(4);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    if (! value.trim().isEmpty()) {
                        test1.setGiaTien(Long.parseLong(value));
                    }
                 }
             }
             if(row.getCell(5)!= null){
                 Cell cell = row.getCell(5);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    if (! value.trim().isEmpty()) {
                        test1.setSoLuong(Integer.parseInt(value));
                    }
                 }
             }
             if(row.getCell(6)!= null){
                 Cell cell = row.getCell(6);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    if (! value.trim().isEmpty()) {
                        test1.setMaLoai(Integer.parseInt(value));
                    }
                 }
             }
             if(row.getCell(7)!= null){
                 Cell cell = row.getCell(7);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    if (! value.trim().isEmpty()) {
                        test1.setMaNCC(Integer.parseInt(value));
                    }
                 }
             }
             if(row.getCell(8)!= null){
                 Cell cell = row.getCell(8);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    if (! value.trim().isEmpty()) {
                        test1.setDeleted(Boolean.getBoolean(value));
                    }
                 }
             }
             spList.add(test1);
         }
         for(int i=0;i<spList.size();i++){
                SanPham s=spList.get(i);
                
                System.out.println(s.toString());
               
            }   
         workbook.close();
         file.close();

    }
    public static void main(String[] args) throws IOException {
        
        sanphamtuexcel();
       
        System.out.println(spList.get(0).getHinhAnh());
        
    }
}
