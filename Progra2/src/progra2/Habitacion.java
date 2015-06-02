/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package progra2;

import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class Habitacion {
    
    
    private String tipo;
    private int numeracion;
    private String tipoCama;
    private int maximoPersonas;
    private String tamanno;
    private String descripcion;
    private int precio;
    ArrayList<Habitacion>listasExtras = new ArrayList<>();

    public Habitacion(String tipo, int numeracion, String tipoCama, int maximoPersonas, String tamanno, String descripcion, int precio) {
        this.tipo = tipo;
        this.numeracion = numeracion;
        this.tipoCama = tipoCama;
        this.maximoPersonas = maximoPersonas;
        this.tamanno = tamanno;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Habitacion() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public int getMaximoPersonas() {
        return maximoPersonas;
    }

    public void setMaximoPersonas(int maximoPersonas) {
        this.maximoPersonas = maximoPersonas;
    }

    public String getTamanno() {
        return tamanno;
    }

    public void setTamanno(String tamanno) {
        this.tamanno = tamanno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Habitacion> getListasExtras() {
        return listasExtras;
    }

    public void setListasExtras(ArrayList<Habitacion> listasExtras) {
        this.listasExtras = listasExtras;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "tipo=" + tipo + ", numeracion=" + numeracion + ", tipoCama=" + tipoCama + ", maximoPersonas=" + maximoPersonas + ", tamanno=" + tamanno + ", descripcion=" + descripcion + ", precio=" + precio + ", listasExtras=" + listasExtras + '}';
    }
}
