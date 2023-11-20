/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gabriel
 */
public class tec_esp {
    private int codEsp;
    private int codTec;

    public tec_esp() {
    }

    public tec_esp(int codEsp, int codTec) {
        this.codEsp = codEsp;
        this.codTec = codTec;
    }

    public int getCodEsp() {
        return codEsp;
    }

    public int getCodTec() {
        return codTec;
    }

    public void setCodEsp(int codEsp) {
        this.codEsp = codEsp;
    }

    public void setCodTec(int codTec) {
        this.codTec = codTec;
    }
    
}
