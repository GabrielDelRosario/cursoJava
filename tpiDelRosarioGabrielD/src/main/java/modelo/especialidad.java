/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gabriel
 */
public class especialidad {
    private int codigo;
    private String especialidad;

    public especialidad() {
    }

    public especialidad(int codigo, String especialidad) {
        this.codigo = codigo;
        this.especialidad = especialidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
