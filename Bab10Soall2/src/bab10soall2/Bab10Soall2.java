/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab10soall2;

/**
 *
 * @author Sriay
 */
public class Bab10Soall2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Aritmatika3
        Aritmatika aritmatika = new Aritmatika();

        // Nilai untuk operasi
        int bilangan1 = 10;
        int bilangan2 = 5;

        // Mengakses dan menampilkan hasil dari metode pengurangan
        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);

        // Mengakses dan menampilkan hasil dari metode perkalian
        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);

        // Mengakses dan menampilkan hasil dari metode pembagian
        try {
            double hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
            System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Mengakses dan menampilkan hasil dari metode pangkat
        double hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}
    
