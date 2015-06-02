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
public class Temporada {
    
    private String nombre;
    private int codigo;
    private String fechaInicio;
    private String fechaFinal;
    private int cambioPrecio;

    public Temporada(String nombre, int codigo, String fechaInicio, String fechaFinal, int cambioPrecio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cambioPrecio = cambioPrecio;
    }

    public Temporada() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCambioPrecio() {
        return cambioPrecio;
    }

    public void setCambioPrecio(int cambioPrecio) {
        this.cambioPrecio = cambioPrecio;
    }

    @Override
    public String toString() {
        return "Temporada{" + "nombre=" + nombre + ", codigo=" + codigo + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", cambioPrecio=" + cambioPrecio + '}';
    }
}
