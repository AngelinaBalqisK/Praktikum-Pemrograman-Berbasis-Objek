/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angel.relasiclass.percobaan3;
 // @author Angel

public class Pegawai {
    private String nip;
    private String nama;
    
    Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getNip(){
        return nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    public String info() { String info = "";
    info += "Nip: " + this.nip + "\n";
    info += "Nama: " + this.nama + "\n";
    return info;
    }
}
