/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan60.akatsuki;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF - 2
 * Deskripsi    : Akatsuki Anime Naruto inheritance dan polymophism
 */
public class PBOIF210119077Latihan60Akatsuki {

    public static void main(String[] args) {
        System.out.println("=================================Akatsuki yang berasal dari ninja Konoha=================================");
        System.out.print("Nama                                        : ");Tobi objTobi = new Tobi("Kamui", "Uchiha", "Mati");
        objTobi.setTujuan("Menciptakan dunia genjutsu Mugen Tsukoyomi dengan kendalinya");
        objTobi.tampilData();
        System.out.println("Tujuan                                      : "+objTobi.getTujuan());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        System.out.print("Nama                                        : ");Itachi objItachi = new Itachi("Tsukoyomi", "Uchiha", "Mati");
        objItachi.setTujuan("Melindungi Desa Konoha dan adiknya Sasuke");
        objItachi.tampilData();
        System.out.println("Tujuan                                      : "+objItachi.getTujuan());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        System.out.print("Nama                                        : ");Orochimaru objOrochimaru = new Orochimaru("Ular", "Tidak diketahui", "Hidup");
        objOrochimaru.setTujuan("Meneliti untuk menguasai semua jutsu yang ada");
        objOrochimaru.tampilData();
        System.out.println("Tujuan                                      : "+objOrochimaru.getTujuan());        
    }
    
}
