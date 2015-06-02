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
public class Actractivos {
    
    private String nombre;
    private String lugar;
    private int identificador;

    public Actractivos(String nombre, String lugar, int identificador) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Atractivos{" + "nombre=" + nombre + ", lugar=" + lugar + ", identificador=" + identificador + '}';
    }
    
}
