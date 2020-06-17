/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201282_uts_java_no3;

/**
 *

 */
//input-output
import java.util.Scanner;
public class PROJECT_SEDERHANA_programpengertian_Simbiosis {
            public static void main(String[] args) {
       //membuat variable
       String simbiosis,jawab;
       boolean jalan = true;
               
               //membuat new scanner(input-output)
               Scanner scan = new Scanner (System.in);
                System.out.println("=====================================================================");
                System.out.println("                     Program Pengertian Simbiosis                    ");
                System.out.println("                (mutualisme, komensalisme, parasitisme)              ");
                System.out.println("=====================================================================");
               //memanggil perintah untuk input
               System.out.print   ("Masukkan Simbiosis : ");
               //menyimpan apa yang akan diketik di variable
               simbiosis = scan.nextLine();
               //percabangan menggunakan switch case
                System.out.println("Pengertian         : ");
               switch (simbiosis){
                   case "mutualisme":
                       System.out.println("simbiosis mutualisme adalah hubungan antara mahluk hisup yang saling menguntungkan ");
                       break;
                   case "komensalisme":
                       System.out.println("simbiosis komensalisme adalah hubungan antara mahluk hidup yang mana yang satu diuntungkan namun yang lain tidak dirugikan maupun di untungkan");
                       break;
                   case "parasitisme":
                       System.out.println("simbiosis parasitisme adalah hubungan antara mahluk hidup yang satu diuntungkan dan yang lain dirugikan ");
                       break;
                   default:
                       System.out.println("simbiosis tidak ada!");
               }
               
                System.out.println("=====================================================================");
                         
               
               //PERULANGAN, menggunakan While
                while (jalan){
                    System.out.println("Apakah anda keluar ?");
                    System.out.println("Jawab (Y/T)");
                    jawab = scan.nextLine();
                    
                    //cek jawaban,apakah  berhenti maka ketikkan "Y"
                    if (jawab.equalsIgnoreCase("Y")){
                        jalan = false;
                    }
                }
               }
    }
                 
