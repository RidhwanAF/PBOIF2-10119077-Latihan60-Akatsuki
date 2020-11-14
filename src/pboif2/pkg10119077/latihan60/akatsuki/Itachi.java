/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan60.akatsuki;

/**
 *
 * @author RAF
 */
public class Itachi extends AkatsukiFromKonoha{
    private String tujuan;

    public Itachi(String jurusUtama, String klan, String status) {
        super(jurusUtama, klan, status);
        System.out.println("Itachi");
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
}
