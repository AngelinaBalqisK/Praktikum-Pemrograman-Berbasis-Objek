/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author USER
 */
public class segitiga {
  public static void main (String[] args){
      
      int nim[] = {2,1,4,1,7,6,2,0,6,9};
    
      
     int i = 0;
        
        while (i < nim.length) {
            int j = nim.length;
            while(j > i ){
                System.out.print(" ");
                j--;
            }
            
            int k =0;
            while(k <= i){
                
                System.out.print(nim[i] + " ");
                k++;
            }
            System.out.println();
            i++;
            
        }
        
        System.out.println();
        System.out.println("Jumlah baris : " + nim.length);
    }
  }

