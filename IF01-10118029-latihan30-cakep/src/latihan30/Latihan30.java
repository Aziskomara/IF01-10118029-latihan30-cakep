/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan30;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program cakep
 */
public class Latihan30 {
    public static final String reset = "\u001B[0m";
    public static final String merah = "\u001B[31m";
    public static final String hijau = "\u001B[32m";
    public static final String kuning = "\u001B[33m";
    public static final String biru = "\u001B[34m";
    public static final String ungu = "\u001B[35m";
    public static final String biruMuda = "\u001B[36m";
    public static final String putih = "\u001B[37m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        String status;
        String statusCek;
        
        //masukkan       
        System.out.print( merah + "Kamu " + hijau + "Ngerjain Sendiri " + kuning + "Latihan 17 sampe " + 
                          biru + "Latihan 30 ini ?\n" );
        System.out.print("Jawab " + merah + "(Yoi/Enggak) :  " + reset);
        Scanner tempStatus = new Scanner(System.in);
        status = tempStatus.nextLine();
        statusCek = status.toUpperCase();
        
        System.out.println();
        
        //proses dan keluaran
        if(statusCek.equals("YOI")){
            System.out.println(  merah + "Cakep Bener ." + ungu + "Good Job");
        }
        else{
            System.out.println( merah + "Tetep Cakep sih.");
            System.out.println( biruMuda + "Sing penting paham konsep nya yee");
            System.out.println(reset + "Keep the source code works dude ");
        }
    }
    
}
