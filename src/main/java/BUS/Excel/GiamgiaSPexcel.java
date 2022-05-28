/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.Excel;
import  BUS.Excel.sanphamexcel;
import  DTO.GiamGiaSP;
import DTO.SanPham;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;/**
 *
 * @author tiend
 */
public class GiamgiaSPexcel {
   
   
    public static void laydulieutuexcel() throws FileNotFoundException, IOException{
         ArrayList<GiamGiaSP> giamgiaspList=new ArrayList<GiamGiaSP>();
         File f= new File("src\\main\\java\\DAL\\Exel\\giamgiasp.xlsx");
         System.out.println("TEST:"+f.getAbsoluteFile());
         FileInputStream file = new FileInputStream(f.getAbsoluteFile());
         XSSFWorkbook workbook=new XSSFWorkbook(file);
         XSSFSheet  sheet=workbook.getSheetAt(0);
         DataFormatter fmt = new DataFormatter();
         for(Row row:sheet){
             GiamGiaSP test1= new GiamGiaSP();
             if(row.getCell(0)!= null){
                 Cell cell = row.getCell(0);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    
                    if (! value.trim().isEmpty()) {
                        test1.setSoPhieu(Integer.parseInt(value));
                    }
                 }
             }
            if(row.getCell(1)!= null){
                
                Cell cell = row.getCell(1);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
//                    Timestamp ts1= new Timestamp(Long.parseLong(value));
                   if (! value.trim().isEmpty()) {
                       
                       test1.setNgayBD(Timestamp.valueOf(value));
                       
                   }
                }
            }
            if(row.getCell(2)!= null){
                
                Cell cell = row.getCell(2);
                 if(cell!=null) {
                  String value = fmt.formatCellValue(cell);
                     
                    if (! value.trim().isEmpty()) {
                       test1.setNgayKT(Timestamp.valueOf(value));
                    }
                 }
             }
             if(row.getCell(3)!= null){
                 Cell cell = row.getCell(3);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    if (! value.trim().isEmpty()) {
                        test1.setPtGiam(Integer.parseInt(value));
                    }
                 }
             }
            if(row.getCell(4)!= null){
                 Cell cell = row.getCell(4);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    if (! value.trim().isEmpty()) {
                        test1.setMaSP(Integer.parseInt(value));
                    }
                 }
             }
             if(row.getCell(5)!= null){
                 Cell cell = row.getCell(5);
                 if(cell!=null) {
                    String value = fmt.formatCellValue(cell);
                    if (! value.trim().isEmpty()) {
                        test1.setIsDeleted(Boolean.getBoolean(value));
                    }
                 }
             }
             giamgiaspList.add(test1);
         }
//         for (Row row : sheet) {
//            Cell cell = row.getCell(0);
//            if(cell!=null) {
//            String value = fmt.formatCellValue(cell);
//            if (! value.trim().isEmpty()) {
//             System.out.println("Cell as string is " + value);
//            }
//         }
//         }
         Timestamp ts= new Timestamp(System.currentTimeMillis());
         System.out.println("TS:"+ts);
         for(int i=0;i<giamgiaspList.size();i++){
                GiamGiaSP s=giamgiaspList.get(i);
                
                System.out.println(s.toString());
               
            }   
         workbook.close();
         file.close();
         

    }
     public static void main(String[] args) throws IOException {
        
        laydulieutuexcel();
       
        
    }
}
