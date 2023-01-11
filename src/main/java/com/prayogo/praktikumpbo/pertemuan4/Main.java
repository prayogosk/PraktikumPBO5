
package com.prayogo.praktikumpbo.pertemuan4;


public class Main {
    public static void main(String[] args) { 
        Mobil toyota = new Mobil(); 
        Kendaraan kn= new Kendaraan(); 
 
        toyota.nama = "avanza"; 
        toyota.jmlRoda = 4;
        toyota.maxGear = 5;
         	 
        kn.nama =" kendaraan Misterius"; 
        kn.jmlRoda= 4; 	 
         
        toyota.showInfo();
        toyota.belok("kanan");	 
        
        kn.showInfo(); 	 
    } 
}
