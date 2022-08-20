/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlycuahang.helper;

import java.sql.Connection;
import java.sql.DriverManager;

//Class use connect object in database and return data
public class DatabaseHelper {
    public static Connection opConnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlycuahangonl", "root", "182411");
        
        return connection;
    }
}
