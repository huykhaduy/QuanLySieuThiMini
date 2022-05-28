/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.BasicHandle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MY ACER
 */



public class EmailExampleTest {
    
    private static EmailExample emailExample;

    public boolean checkEmail(String email) {
        emailExample = new EmailExample();
        return emailExample.validate(email);
    }
    
}
