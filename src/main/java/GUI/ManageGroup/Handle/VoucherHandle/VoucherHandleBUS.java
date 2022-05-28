/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.ManageGroup.Handle.VoucherHandle;

import DAL.DataAcessObject.VoucherDAO;
import DTO.Voucher;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MY ACER
 */
public class VoucherHandleBUS {
    VoucherDAO voucherDao = new VoucherDAO();
    
    public boolean AddVoucher(String maVoucher, String minimizeVoucher, String maxmizeVoucher,String startDay, String endDay, String percent, String numberUse, String describe){
        Voucher voucher = new Voucher();
        voucher.setMaVoucher(maVoucher);
        Long valueMin = Long.valueOf(minimizeVoucher);
        voucher.setGiaTriToiThieu(valueMin);
        Long valueMax = Long.valueOf(maxmizeVoucher);
        voucher.setKmToiDa(valueMax);
        try {
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(startDay);
            Timestamp ngayBatDau = new Timestamp(date.getTime());
            voucher.setNgayBD(ngayBatDau);
        } catch (ParseException ex) {
            Logger.getLogger(VoucherHandleBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(endDay);
            Timestamp ngayKetThuc = new Timestamp(date1.getTime());
            voucher.setNgayKT(ngayKetThuc);
        } catch (ParseException ex) {
            Logger.getLogger(VoucherHandleBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Integer phanTramgiam = Integer.valueOf(percent);
        voucher.setPtGiam(phanTramgiam);
        Integer soLuotSuDung = Integer.valueOf(numberUse);
        voucher.setSoLuotSD(soLuotSuDung);
        voucher.setMoTa(describe);
        
        voucher.setDeleted(false);
        
        return voucherDao.insert(voucher);
    }
    
    public boolean DeleteVoucher(String maVoucher){
        return voucherDao.delete(maVoucher);
    }
    
    public boolean EditVoucher(String maVoucher, String minimizeVoucher, String maxmizeVoucher,String startDay, String endDay, String percent, String numberUse, String describe){
        Voucher voucher = new Voucher();
        Long valueMin = Long.valueOf(minimizeVoucher);
        voucher.setGiaTriToiThieu(valueMin);
        Long valueMax = Long.valueOf(maxmizeVoucher);
        voucher.setKmToiDa(valueMax);
        try {
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(startDay);
            Timestamp ngayBatDau = new Timestamp(date.getTime());
            voucher.setNgayBD(ngayBatDau);
        } catch (ParseException ex) {
            Logger.getLogger(VoucherHandleBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(endDay);
            Timestamp ngayKetThuc = new Timestamp(date1.getTime());
            voucher.setNgayKT(ngayKetThuc);
        } catch (ParseException ex) {
            Logger.getLogger(VoucherHandleBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        Integer phanTramgiam = Integer.valueOf(percent);
        voucher.setPtGiam(phanTramgiam);
        Integer soLuotSuDung = Integer.valueOf(numberUse);
        voucher.setSoLuotSD(soLuotSuDung);
        voucher.setMoTa(describe);
        voucher.setDeleted(false);
        
        
        return voucherDao.update(maVoucher, voucher);
    }
    
}
