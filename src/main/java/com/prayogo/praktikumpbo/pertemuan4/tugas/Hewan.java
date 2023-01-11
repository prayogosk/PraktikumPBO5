/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan4.tugas;

public class Hewan {
    String nama;
    String makananhewan;
    String pemilik;      
      
     public void showInfo(){ 
     System.out.println("Hewan   : " + nama); 
     System.out.println("Makanan : " + makananhewan);      
     System.out.println("Pemilik : " + pemilik);      
     extraInfo(); 
     }      
     
     public void extraInfo(){}
}
