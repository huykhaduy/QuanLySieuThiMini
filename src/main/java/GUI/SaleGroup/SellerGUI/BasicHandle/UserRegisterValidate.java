/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import DAL.DataAcessObject.KhachHangDAO;

/**
 *
 * @author MY ACER
 */
public class UserRegisterValidate {
    private final KhachHangDAO khachHangDao;
    private EmailExampleTest emailExampleTest;

    public UserRegisterValidate() {
        this.khachHangDao = new KhachHangDAO();
        emailExampleTest = new EmailExampleTest();
    }
    
    public boolean checkEmail( String email ){
      return emailExampleTest.checkEmail(email);
    }
    
    public boolean checkSex(String sex){
      return "Nam".equals(sex);
    }
    
    public boolean checkName(String name){
        return name.length() < 3;
    }
    
    public boolean checkNumber(String number){
        return number.length() <= 9 || number.length()>10;
    }
    

}

