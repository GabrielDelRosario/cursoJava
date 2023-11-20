/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gabriel
 */
public class ser_cli {
    private int codCli;
    private int codigSer;

    public ser_cli() {
    }

    public ser_cli(int codCli, int codigSer) {
        this.codCli = codCli;
        this.codigSer = codigSer;
    }

    public int getCodCli() {
        return codCli;
    }

    public int getCodigSer() {
        return codigSer;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public void setCodigSer(int codigSer) {
        this.codigSer = codigSer;
    }
    
}
