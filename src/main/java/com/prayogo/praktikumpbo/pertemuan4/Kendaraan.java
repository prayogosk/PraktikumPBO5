/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan4;

public class Kendaraan {
    String nama;
    int jmlRoda; 
      
    public void nyalakanMesin(){ 
         System.out.println("Mesin " + nama + "telah  dinyalakan!"); 
    }  
    
    public void showInfo(){ 
         System.out.println("Nama    : " + nama);          
         System.out.println("Jml roda : "  + jmlRoda);          
         extraInfo();      
    } 
 
    public void extraInfo(){} 
}
