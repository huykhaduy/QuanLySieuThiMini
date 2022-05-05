/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.AccountCustomer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MY ACER
 */



public class EmailExampleTest {
    
    	private static EmailExample emailExample;
	public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
	public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

	public boolean checkEmail() {
                                            emailExample = new EmailExample();
                                            boolean isvalid = true;
		for (String email : validEmail) {
			 isvalid = emailExample.validate(email);
		}
		for (String email : invalidEmail) {
			 isvalid = emailExample.validate(email);
		}
                                            return isvalid;
	}
    
}
