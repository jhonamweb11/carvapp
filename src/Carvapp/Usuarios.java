/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carvapp;

/**
 *
 * @author Usuario
 */
public class Usuarios {
    private int Usuarioid;
    private String Nombre;
    private String Apellido;   
    private String Usuario;   
    private String Contrasena;   

    public Usuarios(int Usuarioid, String Nombre, String Apellido, String Usuario, String Contrasena) {
        this.Usuarioid = Usuarioid;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
    }

    public int getUsuarioid() {
        return Usuarioid;
    }

    public void setUsuarioid(int Usuarioid) {
        this.Usuarioid = Usuarioid;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
    
}
