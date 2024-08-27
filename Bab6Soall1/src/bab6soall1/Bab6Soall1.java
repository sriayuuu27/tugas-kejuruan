/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab6soall1;

/**
 *
 * @author Sriay
 */
import java.util.Scanner;

public class Bab6Soall1 {

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
       
       //Menentukan grade berdasarkan nilai
       char grade;
       if (nilai >=85) {
           grade = 'A';
       } else if (nilai>= 70) {
           grade = 'B';
       } else if (nilai>= 55) {
           grade = 'C';
       } else if (nilai>= 40) {
           grade = 'D';
       } else {
           grade = 'E';
       }
       
       //Menampilkan ouput grade
       System.out.println("Grade : " + grade);
       
       //Menutup sacnner
       scanner.close();
    }
    
}
