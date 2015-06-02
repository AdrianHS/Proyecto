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
public class Reservacion {
    
    private String descripcion;
    private String fechaEntrada;
    private String fechaSalida;
    private int cantidadHabitaciones;
    private int noches;
    private int cantidadAdultos;
    private int cantidadNinnos;
    ArrayList<Reservacion>listaHabitaciones = new ArrayList<>();
    ArrayList<Reservacion>historia = new ArrayList<>();

    public Reservacion(String descripcion, String fechaEntrada, String fechaSalida, int cantidadHabitaciones, int noches, int cantidadAdultos, int cantidadNinnos) {
        this.descripcion = descripcion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.noches = noches;
        this.cantidadAdultos = cantidadAdultos;
        this.cantidadNinnos = cantidadNinnos;
    }

    public Reservacion() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public int getCantidadAdultos() {
        return cantidadAdultos;
    }

    public void setCantidadAdultos(int cantidadAdultos) {
        this.cantidadAdultos = cantidadAdultos;
    }

    public int getCantidadNinnos() {
        return cantidadNinnos;
    }

    public void setCantidadNinnos(int cantidadNinnos) {
        this.cantidadNinnos = cantidadNinnos;
    }

    public ArrayList<Reservacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Reservacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public ArrayList<Reservacion> getHistoria() {
        return historia;
    }

    public void setHistoria(ArrayList<Reservacion> historia) {
        this.historia = historia;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "descripcion=" + descripcion + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", cantidadHabitaciones=" + cantidadHabitaciones + ", noches=" + noches + ", cantidadAdultos=" + cantidadAdultos + ", cantidadNinnos=" + cantidadNinnos + ", listaHabitaciones=" + listaHabitaciones + ", historia=" + historia + '}';
    }
}
