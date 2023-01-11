/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan4;

public class Mobil extends Kendaraan{
    int maxGear; 
    
    public void belok(String arah){ 
        System.out.println("Mobil " + nama + "belok ke " + arah  + "!"); 
    }
    
    public void belok(){ 
        System.out.println("error : mohon masukan arah"); 
    }
    
    public void exstraInfo(){ 
        System.out.println("Max Gear"+ maxGear); 
    } 
} 
