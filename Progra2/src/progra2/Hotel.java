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
public class Hotel {
    
    private String nombre;
    private String direccion;
    private String pais;
    private int telefono;
    private String tipoHospedeje;
    private String tamannoHotel;
    private String checkIN;
    private String checkON;
    private String servicios;
    private int annoConstruccion;
    private String dscripcionHabitacion;
    ArrayList<Hotel>listaFotografia = new ArrayList<>();
    ArrayList<Hotel>listaServicios = new ArrayList<>();
    ArrayList<Hotel>listaAtractivos = new ArrayList<>();

    public Hotel(String nombre, String direccion, String pais, int telefono, String tipoHospedeje, String tamannoHotel, String checkIN, String checkON, String servicios, int annoConstruccion, String dscripcionHabitacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
        this.telefono = telefono;
        this.tipoHospedeje = tipoHospedeje;
        this.tamannoHotel = tamannoHotel;
        this.checkIN = checkIN;
        this.checkON = checkON;
        this.servicios = servicios;
        this.annoConstruccion = annoConstruccion;
        this.dscripcionHabitacion = dscripcionHabitacion;
    }

    public Hotel() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTipoHospedeje() {
        return tipoHospedeje;
    }

    public void setTipoHospedeje(String tipoHospedeje) {
        this.tipoHospedeje = tipoHospedeje;
    }

    public String getTamannoHotel() {
        return tamannoHotel;
    }

    public void setTamannoHotel(String tamannoHotel) {
        this.tamannoHotel = tamannoHotel;
    }

    public String getCheckIN() {
        return checkIN;
    }

    public void setCheckIN(String checkIN) {
        this.checkIN = checkIN;
    }

    public String getCheckON() {
        return checkON;
    }

    public void setCheckON(String checkON) {
        this.checkON = checkON;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public int getAnnoConstruccion() {
        return annoConstruccion;
    }

    public void setAnnoConstruccion(int annoConstruccion) {
        this.annoConstruccion = annoConstruccion;
    }

    public String getDscripcionHabitacion() {
        return dscripcionHabitacion;
    }

    public void setDscripcionHabitacion(String dscripcionHabitacion) {
        this.dscripcionHabitacion = dscripcionHabitacion;
    }

    public ArrayList<Hotel> getListaFotografia() {
        return listaFotografia;
    }

    public void setListaFotografia(ArrayList<Hotel> listaFotografia) {
        this.listaFotografia = listaFotografia;
    }

    public ArrayList<Hotel> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(ArrayList<Hotel> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public ArrayList<Hotel> getListaAtractivos() {
        return listaAtractivos;
    }

    public void setListaAtractivos(ArrayList<Hotel> listaAtractivos) {
        this.listaAtractivos = listaAtractivos;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", direccion=" + direccion + ", pais=" + pais + ", telefono=" + telefono + ", tipoHospedeje=" + tipoHospedeje + ", tamannoHotel=" + tamannoHotel + ", checkIN=" + checkIN + ", checkON=" + checkON + ", servicios=" + servicios + ", annoConstruccion=" + annoConstruccion + ", dscripcionHabitacion=" + dscripcionHabitacion + ", listaFotografia=" + listaFotografia + ", listaServicios=" + listaServicios + ", listaAtractivos=" + listaAtractivos + '}';
    }
}
