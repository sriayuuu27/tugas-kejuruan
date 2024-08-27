/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab7soal2;

/**
 *
 * @author Sriay
 */
import java.util.Scanner;

public class Bab7Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membaca input dari pengguna
        Scanner  scanner = new Scanner(System.in);
        
        // Input NIM
        System.out.println("NIM: ");
        String nim = scanner.nextLine();
        
        // Input Nama
        System.out.println("NAMA: ");
        String nama = scanner.nextLine();
        
        // Input Tahun
        System.out.println("TAHUN: ");
        int tahun = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Input Pilih Peminatan
        System.out.println("PILIH PEMINATAN (M/J): ");
        char peminatan = scanner.nextLine().charAt(0);
        
        // Menentukan  output berdasarkan pilihan peminatan
        String peminatanOutput;
        switch (peminatan) {
            case 'M':
                peminatanOutput = " PEMROGRAMAN MOBILE, PEMROGRAMAN JAVA " + tahun;
                break;
            case 'J':
                peminatanOutput = " PEMROGRAMAN JAVA, PEMROGRAMAN MOBILE " + tahun;
                break;
            default:
                peminatanOutput = "Pilihan peminatan tidak valid";
                break;
        }
        
        // Menampilkan hasil
        System.out.println("\nOutput:");
        System.out.println(peminatanOutput);
    }
    
}
