/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpools;

/**
 *
 * @author Dias NandaIka
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threadpools {
     public String angka;
     
     public void setNama(String newNama) {
         angka = newNama;
     }
     public String getNama(){
         return angka;
     }
     
    public static void main(String[] args) {
     ExecutorService service = Executors.newFixedThreadPool(5);
     for (int i=1;i<5;i++) {
         service.submit(new ClassThread(1));
         Threadpools testangka = new Threadpools();
         testangka.setNama(" = Bilangan Ganjil");
         for (int angka = 1;angka<100;angka=angka+2){
             System.out.println(angka+testangka.getNama());
         }
     }
        System.out.println("semua task telah disubmit");
        service.shutdown();
        
        try {
            service.awaitTermination(1, TimeUnit.DAYS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hasil");
    }
}