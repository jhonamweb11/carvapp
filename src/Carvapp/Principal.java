/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carvapp;

import interfaz.AgregarVisitante;
import interfaz.Login;

/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
                
        Login objectLogin = new Login();
       objectLogin.setVisible(false);
       
       AgregarVisitante objectCrud = new AgregarVisitante();
       objectCrud.setVisible(true);
        
    }
}
