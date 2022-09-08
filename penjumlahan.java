/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author USER
 */
public class penjumlahan {
    public static void main (String[] args){
       int nim[] = {2,1,4,1,7,6,2,0,6,9};
      int total = 0;
      
      for (int i = 0; i<nim.length; i++){
          total += nim[i];
      }
      
      System.out.println("Hasil Penjumlahan = " + total);
    }
}
