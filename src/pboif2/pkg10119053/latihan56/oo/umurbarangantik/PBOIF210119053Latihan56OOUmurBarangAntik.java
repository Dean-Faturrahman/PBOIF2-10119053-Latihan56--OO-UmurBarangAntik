/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan56.oo.umurbarangantik;
import model.Radio;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program umur barang antik
 */
public class PBOIF210119053Latihan56OOUmurBarangAntik {

    public static void main(String[] args) {
        Radio radio;
        
        radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : " + radio.getName());
        System.out.print("Umur barang antik ini adalah : ");
        radio.tampilUmur();
        System.out.println(" tahun.");
                
    }
    
}
