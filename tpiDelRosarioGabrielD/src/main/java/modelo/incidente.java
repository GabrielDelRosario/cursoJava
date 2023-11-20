/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Gabriel
 */
public class incidente {
    private int codigo;
    private String incidente;
    private Date fechaResol;
    private boolean resuelto;
    private int codInt;
    private int codCli;
    
    public incidente() {
    }

    public incidente(int codigo, String incidente, Date fechaResol, boolean resuelto, int codInt, int codCli) {
        this.codigo = codigo;
        this.incidente = incidente;
        this.fechaResol = fechaResol;
        this.resuelto = resuelto;
        this.codInt = codInt;
        this.codCli = codCli;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getIncidente() {
        return incidente;
    }

    public Date getFechaResol() {
        return fechaResol;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public int getCodInt() {
        return codInt;
    }

    public int getCodCli() {
        return codCli;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setIncidente(String incidente) {
        this.incidente = incidente;
    }

    public void setFechaResol(Date fechaResol) {
        this.fechaResol = fechaResol;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    public void setCodInt(int codInt) {
        this.codInt = codInt;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }
    
}
