/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carvapp;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author Usuario
 */
public class Conexion {

    public static com.mysql.jdbc.Connection obtenerConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Connection conectar = null;
    String usuario = "admin";
    String contrasena = "xiS69t@JSI!vJ7rx";
    String bd = "biblioteca";
    String ip = "127.0.0.1";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd+"?useSSL=false";
   
    public  Connection establecerConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario,contrasena);
           //JOptionPane.showMessageDialog(null,"Se conecto a la base de datos: ");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se conectó a la base de datos, ERROR: "+ e.toString());
        }
        return conectar;
    }
}
