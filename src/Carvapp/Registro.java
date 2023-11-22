/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carvapp;

/**
 *
 * @author Usuario
 */
public class Registro {
   private int Registroid;
    private String FechaEntrada;
    private String HoraHentrada;
    private String FechaSalida;
    private String HoraSalida;
    private String Estado;

    public Registro(int Registroid, String FechaEntrada, String HoraHentrada, String FechaSalida, String HoraSalida, String Estado) {
        this.Registroid = Registroid;
        this.FechaEntrada = FechaEntrada;
        this.HoraHentrada = HoraHentrada;
        this.FechaSalida = FechaSalida;
        this.HoraSalida = HoraSalida;
        this.Estado = Estado;
    }

    public int getRegistroid() {
        return Registroid;
    }

    public void setRegistroid(int Registroid) {
        this.Registroid = Registroid;
    }

    public String getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(String FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public String getHoraHentrada() {
        return HoraHentrada;
    }

    public void setHoraHentrada(String HoraHentrada) {
        this.HoraHentrada = HoraHentrada;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
                                       
   
}
