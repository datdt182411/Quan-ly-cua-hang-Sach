/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.threading;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class ClockThread extends Thread {
      private JLabel lbl;

    public ClockThread(JLabel lbl) {
        this.lbl = lbl;
    }
    
    //When extends Thread need to define the method run
    public void run(){
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            Date now = new Date();
            String st = sdf.format(now);            //Convert value Time to value String
            
            lbl.setText(st);        
            
            try {
                Thread.sleep(1000);                 //1000 ms = 1s ==> 1s jump Time value
            } catch (InterruptedException ex) {}
        }
    }
}
