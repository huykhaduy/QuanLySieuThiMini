/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.VoucherHandle;

import DAL.DataAcessObject.VoucherDAO;
import DAL.DataModels.Voucher;
import java.sql.Timestamp;

/**
 *
 * @author MY ACER
 */
public class VoucherBUS {
    VoucherDAO voucherDao = new VoucherDAO();
    
    public boolean AddVoucher(String maVoucher, String minimizeVoucher, String maxmizeVoucher,String startDay, String endDay, String percent, String numberUse, String describe){
        Voucher voucher = new Voucher();
        voucher.setMaVoucher(maVoucher);
        Long valueMin = Long.valueOf(minimizeVoucher);
        voucher.setGiaTriToiThieu(valueMin);
        Long valueMax = Long.valueOf(maxmizeVoucher);
        voucher.setKmToiDa(valueMax);
       Timestamp ngayBatDau = Timestamp.valueOf(startDay);
        voucher.setNgayBD(ngayBatDau);
       Timestamp ngayKetThuc = Timestamp.valueOf(endDay);
        voucher.setNgayKT(ngayKetThuc);
        Integer phanTramgiam = Integer.valueOf(percent);
        voucher.setPtGiam(phanTramgiam);
        Integer soLuotSuDung = Integer.valueOf(numberUse);
        voucher.setSoLuotSD(soLuotSuDung);
        voucher.setMoTa(describe);
        
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
       Timestamp ngayBatDau = Timestamp.valueOf(startDay);
        voucher.setNgayBD(ngayBatDau);
       Timestamp ngayKetThuc = Timestamp.valueOf(endDay);
        voucher.setNgayKT(ngayKetThuc);
        Integer phanTramgiam = Integer.valueOf(percent);
        voucher.setPtGiam(phanTramgiam);
        Integer soLuotSuDung = Integer.valueOf(numberUse);
        voucher.setSoLuotSD(soLuotSuDung);
        voucher.setMoTa(describe);
        
        
        return voucherDao.update(maVoucher, voucher);
    }
    
}
