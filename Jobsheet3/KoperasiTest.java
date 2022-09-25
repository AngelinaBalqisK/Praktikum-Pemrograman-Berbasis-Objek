/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class KoperasiTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Koperasi Angel = new Koperasi("111333444", "Angel", 5000000);
            
        System.out.println("Nama Anggota: " + Angel.getNama());
        System.out.println("Limit Pinjaman: " + Angel.getLimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        Angel.pinjam(10000000);
        
        System.out.println("Jumlah pinjaman saat ini : " + Angel.getJumlahPinjaman());
        System.out.println("\nMeminjam uang 4.000.000...");
        Angel.pinjam(4000000);
        
        System.out.println("Jumlah pinjaman saat ini : " + Angel.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 100.000 ");
        Angel.angsur(100000);
        
        System.out.println("Jumlah pinjaman saat ini : " + Angel.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        Angel.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini : " + Angel.getJumlahPinjaman());
        
        
        
        System.out.println("Nama Anggota\t]t: " + Angel.getNama());
        System.out.println("Limit Pinjaman\t]t: " + Angel.getJumlahPinjaman());
        
        System.out.print("\nPinjam uang: Rp.");
        int uang = input.nextInt();
        Angel.pinjam(uang);
        System.out.println("Jumlah Pinjaman saat ini: Rp." + Angel.getJumlahPinjaman());
        
        System.out.print("\nPinjam uang: Rp.");
        uang = input.nextInt();
        Angel.pinjam(uang);
        System.out.println("Jumlah Pinjaman saat ini: Rp." +Angel.getJumlahPinjaman());
        
        System.out.print("\nBayar angsuran: Rp.");
        uang = input.nextInt();
        Angel.pinjam(uang);
        System.out.println("Jumlah Pinjaman saat ini : Rp." + Angel.getJumlahPinjaman());
        
        System.out.print("\nbayar angsuran: Rp.");
        uang = input.nextInt();
        Angel.pinjam(uang);
        System.out.println("Jumlah Pinjaman saat ini: Rp." + Angel.getJumlahPinjaman());
    }
}
