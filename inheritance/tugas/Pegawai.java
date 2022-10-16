/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.tugas;

/**
 *
 * @author USER
 */
public class Pegawai extends DaftarGaji{
    public String nip;
    public String nama;
    public String alamat;
    
    public void Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getNama(){
        return nama;
    }
    public int getGaji(){
        return gaji;
    }
}
