/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gabriel
 */
public class tecnico {
    private int codigo;
    private String nombre;
    private String email;
    private int whatsapp;

    public tecnico() {
    }

    public tecnico(int codigo, String nombre, String email, int whatsapp) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.whatsapp = whatsapp;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getWhatsapp() {
        return whatsapp;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWhatsapp(int whatsapp) {
        this.whatsapp = whatsapp;
    }
    
}
