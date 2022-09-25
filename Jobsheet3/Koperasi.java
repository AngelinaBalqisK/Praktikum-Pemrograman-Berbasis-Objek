/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu3;

/**
 *
 * @author USER
 */
public class Koperasi {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlah;
    private int pinjam;
    private int angsur;
    
    Koperasi (String noKtp, String nama, int limitPinjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }
    public void setNoKtp(String noKtp){
        this.noKtp=noKtp;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public String getNoKtp(){
        return noKtp;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public void setLimit (int newLimitPinjaman){
        if (newLimitPinjaman > 5000000){
            limitPinjaman=newLimitPinjaman;
            System.out.println("maaf, jumlah pinjaman melebihi limit");
        }else {
            limitPinjaman = newLimitPinjaman;
        }
    }
    public int getJumlahPinjaman(){
        return jumlah;
    }
    public void pinjam(int pinjaman){
        if (pinjaman<limitPinjaman){
            jumlah += pinjaman;
        }else{
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
    }
    public void angsur(int angsuran){
        if(jumlah>0){
            if(jumlah > angsuran){
                if(angsuran >= (jumlah * 0.1)){
                    jumlah -= angsuran;
                }else{
                    System.out.println("Maaf, angsuran minimal harus 10% dari jumlah pinjaman");
                }
            }else{
                System.out.println("Pinjaman lunas, tersisa uang Rp." +(jumlah-angsuran));
                jumlah=0;
            }
        }else{
            System.out.println(nama + "tidak memiliki pinjaman.");
                }
    } 
}
