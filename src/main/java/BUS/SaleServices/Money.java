package BUS.SaleServices;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huykh
 */
public class Money {
    public static String format(Long yourMoney){
        String str = String.format("%,d", yourMoney);
        return str;
    }
    public static void main(String[] args){
        System.out.println(Money.format(39238119932L));
    }
}
