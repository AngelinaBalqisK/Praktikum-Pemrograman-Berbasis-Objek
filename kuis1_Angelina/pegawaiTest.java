/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis1_Angelina;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class pegawaiTest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama :");
        String  nama = input.nextLine();
        System.out.print("Masukkan NIP :");
        String Nip = input.nextLine();
        System.out.print("Jumlah Jam Kerja : ");
        int jumlahJamKerja = input.nextInt();

        pegawai p = new pegawai(nama, Nip, jumlahJamKerja);

        p.gajiPokok();
        p.lembur();
        p.uangMakan();
        p.transport();
        p.total();
    }
}
