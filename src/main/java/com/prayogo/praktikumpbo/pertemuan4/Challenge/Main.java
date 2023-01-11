/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan4.Challenge;

public class Main {
    public static void main(String[] args) { 
         Bus trans = new Bus(); 
         Kendaraan kn= new Kendaraan(); 
          
         trans.nama = "Trans Jateng";      
         trans.jmlangkutan = 45;          
         trans.kecepatan = 110; 
    
         kn.nama ="Trans Banyumas";          
         kn.jmlangkutan= 50;          
         kn.kecepatan=130; 
        
         trans.showInfo();         
         trans.tujuan("Alun Alun Purwokerto"); 
         
         kn.showInfo(); 
     } 
}
