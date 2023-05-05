/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.helper;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */

public class Validator {
    
     public static boolean checkEmpty(JTextField field, StringBuilder sb, String msg){   
        boolean flag = true;   
       // Check text == null 
        if (field.getText().equals("")){                                                
            sb.append(msg).append("\n");
            field.setBackground(Color.yellow);        
            field.requestFocus();                      
            flag = false;
        }else{
            field.setBackground(Color.white);
        }
        return flag;
    }
     
      public static boolean checkEmpty(JTextArea field, StringBuilder sb, String msg){   
        boolean flag = true;   
       // Check text == null 
        if (field.getText().equals("")){                                                
            sb.append(msg).append("\n");
            field.setBackground(Color.yellow);         
            field.requestFocus();                     
            flag = false;
        }else{
            field.setBackground(Color.white);
        }
        return flag;
    }
     

      public static boolean checkEmpty(JPasswordField field, StringBuilder sb, String msg){   
        boolean flag = true;   
        String password = new String(field.getPassword());
       // Check password == null 
        if (password.equals("")){                                                
            sb.append(msg).append("\n");
            field.setBackground(Color.yellow);      
            field.requestFocus();                    
            flag = false;
        }else{
            field.setBackground(Color.white);
        }
        return flag;
    }
     
      
    public static boolean checkEmail(JTextField field, StringBuilder sb){
        boolean check = true;
        
         if(!checkEmpty(field, sb, "Email chưa nhập")){
             return false;
            }
    // \\w+ : Character list
          Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");     
          
          Matcher matcher = pattern.matcher(field.getText());          
          
          if(!matcher.find()){                 
            sb.append("Email không hợp lệ\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
            check = false;
          }

         if(check){
             field.setBackground(Color.white);              
          }
         
         
         return check;
        }
    

    public static boolean checkPhoneNumber(JTextField field, StringBuilder sb){
         boolean check = true;
         
         if(!checkEmpty(field, sb, "Số điện thoại chưa được nhập")){
             return false;
                }
         
         try {
             if(field.getText().length() != 10 ){
                 sb.append("Số điện thoại phải có độ dài 10 số \n");
                 field.setBackground(Color.yellow);
                 field.requestFocus();
                 check = false;
             }
             int phonenumber = Integer.parseInt(field.getText());           
             
        } catch (Exception e) {
            sb.append("Số điện thoại vừa nhập không hợp lệ (Phải là các giá trị số)\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
            check = false;
                }
         if(check){
             field.setBackground(Color.white);                       
                }
         return check;
        }
}
