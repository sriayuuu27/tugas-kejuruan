/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab6soal2;

/**
 *
 * @author Sriay
 */
import java.util.Scanner;

public class Bab6Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
       //Meminta input NIM dari pengguna
       System.out.println("NIM ? : ");
       String nim =scanner.nextLine();
       
       //Meminta input Nama dari pengguna
       System.out.println("NAMA ? : ");
       String nama = scanner.nextLine();
       
       //Meminta input Nilai dari pengguna
       System.out.println("NILAI ? : ");
       int nilai = scanner.nextInt();
       
       //Menentukan grade dan keterangan berdasarkan nilai
       char grade;
       String keterangan;
       if (nilai >=85) {
           grade = 'A';
           keterangan = "Lulus";
       } else if (nilai>= 70) {
           grade = 'B';
           keterangan = "Lulus";
       } else if (nilai>= 55) {
           grade = 'C';
           keterangan = "Lulus";
       } else if (nilai>= 40) {
           grade = 'D';
           keterangan = "Tidak Lulus";
       } else {
           grade = 'E';
           keterangan = "Tidak Lulus";
       }
       
       //Menampilkan ouput grade
       System.out.println("Grade : " + grade);
       System.out.println("Keterangan : " + keterangan);
       
       //Menutup sacnner
       scanner.close();
    }
    
}
