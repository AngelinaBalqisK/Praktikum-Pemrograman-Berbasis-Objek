/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.tugas;

/**
 *
 * @author USER
 */
public class Dosen extends DaftarGaji{
    public int jumlahSKS;
    public int tarifSKS;
    
    public void Dosesn(int jumlahSKS, int tarifSKS){
        this.jumlahSKS = jumlahSKS;
        this.tarifSKS = tarifSKS;
    }
    public void setJumlahSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    public int getJumlahSKS(){
        return jumlahSKS;
    }
    public void setTarifSKS(int tarifSKS){
        this.tarifSKS = tarifSKS;
    }
    public int getTarifSKS(){
        return tarifSKS;
    }
    public int getGaji(){
        return gaji;
    }
}
