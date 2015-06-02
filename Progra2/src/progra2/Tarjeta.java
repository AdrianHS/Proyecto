/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package progra2;

/**
 *
 * @author Adrian
 */
public class Tarjeta {
    private String nombreTarjeta;
    private String tipo;
    private int nuemeroTarjeta;
    private int codigoSeguridad;
    private String fechaVencimiento;

    public Tarjeta(String nombreTarjeta, String tipo, int nuemeroTarjeta, int codigoSeguridad, String fechaVencimiento) {
        this.nombreTarjeta = nombreTarjeta;
        this.tipo = tipo;
        this.nuemeroTarjeta = nuemeroTarjeta;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Tarjeta() {
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNuemeroTarjeta() {
        return nuemeroTarjeta;
    }

    public void setNuemeroTarjeta(int nuemeroTarjeta) {
        this.nuemeroTarjeta = nuemeroTarjeta;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "nombreTarjeta=" + nombreTarjeta + ", tipo=" + tipo + ", nuemeroTarjeta=" + nuemeroTarjeta + ", codigoSeguridad=" + codigoSeguridad + ", fechaVencimiento=" + fechaVencimiento + '}';
    }
}
