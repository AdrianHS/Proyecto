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
public class Usuario {
    
    private String nombre;
    private String apellidos;
    private String genero;
    private String email;
    private String contrasenna;
    private String confimarContrasenna;

    public Usuario(String nombre, String apellidos, String genero, String email, String contrasenna, String confimarContrasenna) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.email = email;
        this.contrasenna = contrasenna;
        this.confimarContrasenna = confimarContrasenna;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getConfimarContrasenna() {
        return confimarContrasenna;
    }

    public void setConfimarContrasenna(String confimarContrasenna) {
        this.confimarContrasenna = confimarContrasenna;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero + ", email=" + email + ", contrasenna=" + contrasenna + ", confimarContrasenna=" + confimarContrasenna + '}';
    }
}
