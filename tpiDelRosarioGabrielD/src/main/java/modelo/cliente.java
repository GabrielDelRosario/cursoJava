/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gabriel
 */
public class cliente {
    private int codigo;
    private String cuit;
    private String razonSocial;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCuit() {
        return cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public cliente(int codigo, String cuit, String razonSocial) {
        this.codigo = codigo;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }

    public cliente() {
    }
}
