/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis1_Angelina;

/**
 *
 * @author USER
 */
public class pegawai {
    private String nama;
    private String nip;
    private double gajiPokok;
    private double lembur;
    private double uangMakan;
    private double transport;
    private int jumlahJamKerja;
    private double total;
    
    pegawai (String nama, String nip, int jumlahJamKerja){
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.lembur = lembur;
        this.uangMakan = uangMakan;
        this.transport = transport;
        this.jumlahJamKerja = jumlahJamKerja;
        this.total = total;
    
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public void setNip (String nip){
        this.nip = nip;
    }
    public String getNama(){
        return nama;
    }
    public String getNip(){
        return nip;
    }
    public double getGajiPokok(){
        return gajiPokok;
    }
    public void jumlahJamKerja(){
       this.jumlahJamKerja = jumlahJamKerja;
    }
    public void gajiPokok(){
        gajiPokok = 2000*jumlahJamKerja;
        }
    public void transport(){
        if(jumlahJamKerja >= 9){
            transport = 4500;
        }else{
            transport = 0;
        }
    }
    public void uangMakan (){
        if (jumlahJamKerja >= 8){
            uangMakan = 3500;
        }else{
            uangMakan = 0;
        }
    }
     public void lembur(){
        if(jumlahJamKerja > 7){
            lembur = (jumlahJamKerja - 7) * (1.5 * gajiPokok);
        }else{
            lembur = 0;
        }
    }
      public void total(){
        total = gajiPokok + uangMakan + lembur + transport;
        System.out.println("Gaji Pokok : " + gajiPokok );
        System.out.println( "Uang Makan :" + uangMakan);
        System.out.println("Lembur : " + lembur);
        System.out.println("Transportasi : " + transport);

        System.out.println("Total Gaji : " + total);
      }
}
