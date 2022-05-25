/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Exel;

import BUS.BusAccessor.SanPhamBUS;
import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataModels.GiamGiaSP;
import DAL.DataModels.SanPham;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
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
    
    private static List<SanPham> spList=new ArrayList<SanPham>();
    private static List<SanPham> spTuExcelList=new ArrayList<SanPham>();
    private static SanPhamBUS spBUS = new SanPhamBUS();
    private static SanPhamDAO spDAO= new SanPhamDAO();
    public static void sanphamtuexcel(File f) {
        try {
            
            FileInputStream file = new FileInputStream(f.getAbsoluteFile());
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            DataFormatter fmt = new DataFormatter();
            for (Row row : sheet) {
                SanPham sp1 = new SanPham();
                if (row.getCell(0) != null) {
                    Cell cell = row.getCell(0);
                    if (cell != null) {
                        String value = fmt.formatCellValue(cell);
                        if (!value.trim().isEmpty()) {
                            if(spBUS.TrungSanPham(spBUS.getAll(), value))
                               sp1.setMaSP(Integer.parseInt(value));
                            else {
                                continue;
                            }
                        }
                    }
                }
                if (row.getCell(1) != null) {

                    Cell cell = row.getCell(1);
                    if (cell != null) {
                        String value = fmt.formatCellValue(cell);
                        if (!value.trim().isEmpty()) {

                            sp1.setTenSP(value);

                        }
                    }
                }
                if (row.getCell(2) != null) {

                    Cell cell = row.getCell(2);
                    if (cell != null) {
                        String value = fmt.formatCellValue(cell);

                        if (!value.trim().isEmpty()) {
                            sp1.setMoTa(value);
                        }
                    }
                }
                if (row.getCell(3) != null) {
                    Cell cell = row.getCell(3);
                    if (cell != null) {
                        String value = fmt.formatCellValue(cell);
                        if (!value.trim().isEmpty()) {
                            sp1.setSoLuong(Integer.parseInt(value));
                        }
                    }
                }
                if (row.getCell(4) != null) {
                    Cell cell = row.getCell(4);
                    if (cell != null) {
                        String value = fmt.formatCellValue(cell);
                        if (!value.trim().isEmpty()) {
                            sp1.setHinhAnh(value);
                        }
                    }
                }
                if (row.getCell(5) != null) {
                    Cell cell = row.getCell(5);
                    if (cell != null) {
                        String value = fmt.formatCellValue(cell);
                        if (!value.trim().isEmpty()) {
                            sp1.setGiaTien(Long.parseLong(value));
                        }
                    }
                }
                if (row.getCell(6) != null) {
                    Cell cell = row.getCell(6);
                    if (cell != null) {
                        String value = fmt.formatCellValue(cell);
                        if (!value.trim().isEmpty()) {
                            sp1.setMaLoai(Integer.parseInt(value));
                        }
                    }
                }
                if (row.getCell(7) != null) {
                    Cell cell = row.getCell(7);
                    if (cell != null) {
                        String value = fmt.formatCellValue(cell);
                        if (!value.trim().isEmpty()) {
                            sp1.setMaNCC(Integer.parseInt(value));
                        }
                    }
                }

                spTuExcelList.add(sp1);
            }
            for (int i = 0; i < spTuExcelList.size(); i++) {
                SanPham s = spTuExcelList.get(i);
                spBUS.add(s);
            }
            workbook.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static void sanPhamtuDataBaseraExcel( ) {
        try {
            File f = new File("src\\main\\java\\DAL\\Exel\\sp.xlsx");
            FileInputStream file = new FileInputStream(f.getAbsoluteFile());
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            int rowIndex = 0;

            spList = spBUS.getAll();
            for (SanPham sp : spList) {
                Row row = sheet.createRow(rowIndex);
                Cell cell = row.createCell(0);
                cell.setCellValue(sp.getMaSP());
                cell = row.createCell(1);
                cell.setCellValue(sp.getTenSP());
                cell = row.createCell(2);
                cell.setCellValue(sp.getMoTa());
                cell = row.createCell(3);
                cell.setCellValue(sp.getSoLuong());
                cell = row.createCell(4);
                cell.setCellValue(sp.getHinhAnh());
                cell = row.createCell(5);
                cell.setCellValue(sp.getGiaTien());
                cell = row.createCell(6);
                cell.setCellValue(sp.getMaLoai());
                cell = row.createCell(7);
                cell.setCellValue(sp.getMaNCC());

                rowIndex++;

            }
            createOutputFile(workbook, f.getAbsoluteFile().getPath());

            workbook.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    private static void createOutputFile(XSSFWorkbook workbook, String excelFilePath) {
        try (OutputStream os = new FileOutputStream(excelFilePath)) {
            workbook.write(os);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        File f = new File("src\\main\\java\\DAL\\Exel\\sp.xlsx");
        sanphamtuexcel(f);
        sanPhamtuDataBaseraExcel();
        
        
    }
}
