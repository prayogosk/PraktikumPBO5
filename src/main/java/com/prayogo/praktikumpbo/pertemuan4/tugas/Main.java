/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan4.tugas;

public class Main {
    public static void main(String[] args) { 
         Ayam bangkok = new Ayam(); 
         Hewan kucing= new Hewan(); 
          
         bangkok.nama = "Ayam Bangkok";      
         bangkok.makananhewan = "Pur 394";          
         bangkok.pemilik = "Suwono"; 
    
         kucing.nama ="Kucing";          
         kucing.makananhewan= "Wiskas";          
         kucing.pemilik="Yogo"; 
        
         bangkok.showInfo();         
         bangkok.bertarung(15); 
         
         kucing.showInfo(); 
     } 
}
