/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program untuk menampilkan huruf besar dan kecil
 */
public class PBOIF210119049Latihan27HurufBesarKecil {
    public static Scanner scan = new Scanner(System.in);
    
    public static String setKalimat(){
        System.out.print("Masukkan Kalimat : ");
        return scan.nextLine();
    }
    
    public static void getTampil(String nama){
        System.out.println("=====Hasil Formatting=====");
        System.out.printf("Huruf Besar : %s%n", nama.toUpperCase());
        System.out.printf("Huruf Kecil : %s%n", nama.toLowerCase());
    }
    
    public static void main(String[] args) {
        String nama = setKalimat();
        getTampil(nama);
        
    }
    
}
