/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel.relasiclass.percobaan2;


// @author Angel
public class Mobil {
    private String merk;
    private int biaya;
    
    public Mobil(){
        
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public void setBiaya(int biaya){
        this.biaya=biaya;
    }
    public String getMerk(){
        return merk;
    }
    public int getBiaya(){
        return biaya;
    }
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
