/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan4.Challenge;

public class Kendaraan {
    String nama;      
    int jmlangkutan;      
    int kecepatan; 
      
     public void showInfo(){ 
     System.out.println("Nama               : " + nama); 
     System.out.println("Mampu Menampung : " + jmlangkutan +" Orang");      
     System.out.println("Kecepatan          : " + kecepatan);      
     extraInfo(); 
     }      
     
     public void extraInfo(){} 
} 
