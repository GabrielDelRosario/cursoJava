/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gabriel
 */
public class inc_esp {
    private int codigInc;
    private int codEsp;

    public void setCodigInc(int codigInc) {
        this.codigInc = codigInc;
    }

    public void setCodEsp(int codEsp) {
        this.codEsp = codEsp;
    }

    public int getCodigInc() {
        return codigInc;
    }

    public int getCodEsp() {
        return codEsp;
    }

    public inc_esp(int codigInc, int codEsp) {
        this.codigInc = codigInc;
        this.codEsp = codEsp;
    }

    public inc_esp() {
    }
}
