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
public class AkatsukiFromKonoha {
    protected String jurusUtama;
    protected String klan;
    protected String status;

    public AkatsukiFromKonoha(String jurusUtama, String klan, String status) {
        this.jurusUtama = jurusUtama;
        this.klan = klan;
        this.status = status;
    }
    
    public void tampilData(){
        System.out.println("Jurus Utama                                 : "+jurusUtama);
        System.out.println("Asal Klan                                   : "+klan);
        System.out.println("Status(Hidup/Mati) setelah Akatsuki musnah  : "+status);
    }
}
