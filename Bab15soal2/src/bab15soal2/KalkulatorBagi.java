/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab15soal2;

/**
 *
 * @author Sriay
 */
public class KalkulatorBagi {
    protected double a;
    protected double b;

    public KalkulatorBagi(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double bagi() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }
}
