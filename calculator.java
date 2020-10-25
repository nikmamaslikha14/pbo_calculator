/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_calculato;

/**
 *
 * @author ANI
 */
public class calculator {
        public static double getPenambahan(double nilai_1, double nilai_2){
        double hasil = nilai_1 + nilai_2;
        return hasil;
    }

    public static double getPengurangan(double nilai_1, double nilai_2){
       double hasil = nilai_1 - nilai_2;
        return hasil;
    }

    public static double getPerkalian(double nilai_1, double nilai_2){
        double hasil = nilai_1 * nilai_2;
        return hasil;
    }

    public static double getPembagian(double nilai_1, double nilai_2){
        double hasil = nilai_1 / nilai_2;
        return hasil;
    }
}