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
public class Cliente {
    
    private String nombreCliente;
    private int codigoCliente;

    public Cliente(String nombreCliente, int codigoCliente) {
        this.nombreCliente = nombreCliente;
        this.codigoCliente = codigoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCliente=" + nombreCliente + ", codigoCliente=" + codigoCliente + '}';
    }
}
