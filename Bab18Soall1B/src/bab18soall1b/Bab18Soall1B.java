/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab18soall1b;

/**
 *
 * @author Sriay
 */
public class Bab18Soall1B {
public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Usia harus lebih dari atau sama dengan 18.");
        } else {
            System.out.println("Usia valid: " + age);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // Menggunakan metode yang dapat melempar eksepsi
            checkAge(16);  // Ini akan melempar IllegalArgumentException
        } catch (IllegalArgumentException e) {
            // Menangkap dan menangani eksepsi
            System.out.println("Kesalahan: " + e.getMessage());
        }
        
        System.out.println("Program tetap berjalan...");
    }
    
}
