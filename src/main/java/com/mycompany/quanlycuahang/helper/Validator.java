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
//Class help check input data
public class Validator {
    
     public static boolean checkEmpty(JTextField field, StringBuilder sb, String msg){   
        boolean flag = true;   
       // Check text == null 
        if (field.getText().equals("")){                                                
            sb.append(msg).append("\n");
            field.setBackground(Color.yellow);         //If text = null ==> display yellow
            field.requestFocus();                      //Call the method make to create symbol input
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
            field.setBackground(Color.yellow);         //If text = null ==> display yellow
            field.requestFocus();                      //Call the method make to create symbol input
            flag = false;
        }else{
            field.setBackground(Color.white);
        }
        return flag;
    }
     
// The method check input data in Password have Empty
      public static boolean checkEmpty(JPasswordField field, StringBuilder sb, String msg){   
        boolean flag = true;   
        String password = new String(field.getPassword());
       // Check password == null 
        if (password.equals("")){                                                
            sb.append(msg).append("\n");
            field.setBackground(Color.yellow);         //If text = null ==> display yellow
            field.requestFocus();                      //Call the method make to create symbol input
            flag = false;
        }else{
            field.setBackground(Color.white);
        }
        return flag;
    }
     
      
//The method check value EMAIL after input  
    public static boolean checkEmail(JTextField field, StringBuilder sb){
        boolean check = true;
        
         if(!checkEmpty(field, sb, "Email ch??a nh???p")){
             return false;
            }
    // \\w+ : M???t d??y k?? t??? 
          Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");       //Build sample Email help check Format
          
          Matcher matcher = pattern.matcher(field.getText());          //Call the method matcher help check value field.getText() with sample Email
          
          if(!matcher.find()){                  //Check comparator the same
            sb.append("Email kh??ng h???p l???\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
            check = false;
          }

         if(check){
             field.setBackground(Color.white);              //Check value valid ==> Background is WHITE
          }
         
         
         return check;
        }
    
//The method check value Phonenumber after input
    public static boolean checkPhoneNumber(JTextField field, StringBuilder sb){
         boolean check = true;
         
         if(!checkEmpty(field, sb, "S??? ??i???n tho???i ch??a ???????c nh???p")){
             return false;
                }
         
         try {
             if(field.getText().length() != 10 ){
                 sb.append("S??? ??i???n tho???i ph???i c?? ????? d??i 10 s??? \n");
                 field.setBackground(Color.yellow);
                 field.requestFocus();
                 check = false;
             }
             int phonenumber = Integer.parseInt(field.getText());             //Help convert value String to value Integer
             
        } catch (Exception e) {
            sb.append("S??? ??i???n tho???i v???a nh???p kh??ng h???p l??? (Ph???i l?? c??c gi?? tr??? s???)\n");
            field.setBackground(Color.yellow);
            field.requestFocus();
            check = false;
                }
         if(check){
             field.setBackground(Color.white);                       //Check value valid ==> Background is WHITE
                }
         return check;
        }
}
