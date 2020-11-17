/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dean
 */
public class BarangAntik {
    private int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur(){
        System.out.print(umur);
    }
}
