/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gabriel
 */
public class servicio {
    private int codigo;
    private String servicio;

    public servicio() {
    }

    public servicio(int codigo, String servicio) {
        this.codigo = codigo;
        this.servicio = servicio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
}
