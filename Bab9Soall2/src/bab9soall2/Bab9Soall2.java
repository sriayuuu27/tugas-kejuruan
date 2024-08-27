/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soall2;

/**
 *
 * @author Sriay
 */
import java.util.Scanner;

public class Bab9Soall2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai awal dan nilai akhir
        System.out.println("Masukkan bilangan awal: ");
        int awal = scanner.nextInt();
        
        System.out.println("Masukkan bilangan akhir: ");
        int akhir = scanner.nextInt();
        
        // Menampilkan hashil deret bilangan
        System.out.println("hasil deret bilangan: ");
        for (int i = awal; i <= akhir; i+= 5) {
            System.out.println(i);
            if (i + 5 <= akhir) {
                System.out.println(", ");
            }
        }
        
        
    }
    
}
