/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.percobaan1;

/**
 *
 * @author USER
 */
public class ClassB extends ClassA{
    public int z;
    
    public void getNilaiZ(){
        System.out.println("nilai z: "+ z);
    }
    public void getJumlah(){
        System.out.println("jumlah:  "+ (x+y+z));
    }
}
