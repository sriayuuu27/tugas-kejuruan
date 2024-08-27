/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab5soal1;

/**
 *
 * @author Sriay
 */
import java.util.Scanner;

public class Bab5Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("## Pendataan Karyawan PT. Petani kode ##");
        System.out.println("Nama Karyawan : ");
        String nama = scanner.nextLine();
        
        System.out.println("Usia : ");
        int usia = scanner.nextInt();
        
        System.out.println("Gaji : ");
        int gaji = scanner.nextInt();
        
        System.out.println(" Nama : " + nama);
        System.out.println(" Usia : " + usia + " Tahun ");
        System.out.println(" Gaji : " + "Rp." + gaji);
        
        
    }
    
}
