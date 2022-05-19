/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.VoucherDAO;
import DAL.DataModels.Voucher;
import java.util.List;

/**
 *
 * @author tiend
 */
public class VoucherBUS implements IBussAccess<Voucher,String>{
    private final VoucherDAO voucherDAO =new VoucherDAO();
    @Override
    public Voucher get(String maVoucher) {
        return voucherDAO.select(maVoucher);
    }

    @Override
    public List<Voucher> getAll() {
        return voucherDAO.selectAll();
    }

    @Override
    public boolean add(Voucher vouncher) {
        return  voucherDAO.insert(vouncher);
    }

    @Override
    public boolean edit(String maVoucher, Voucher voucher) {
        return voucherDAO.update(maVoucher, voucher);
    }

    @Override
    public boolean remove(String maVoucher) {
        return voucherDAO.delete(maVoucher);
    }

    @Override
    public Voucher getNewest() {
       List<Voucher> list=getAll();
       return list== null ? null : list.get(list.size()-1);
    }

   
}
