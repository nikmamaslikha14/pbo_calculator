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
public class programhitung {
        public static void main(String[] args){
        double Penambahan;
        double Pengurangan;
        double Perkalian;
        double Pembagian;

        calculator calculator = new calculator();
        Penambahan = calculator.getPenambahan(11,6);
        Pengurangan = calculator.getPengurangan(14,7);
        Perkalian = calculator.getPerkalian(7,2);
        Pembagian = calculator.getPembagian(14,2);
        System.out.println(" Hasil penambahan = "+Penambahan);
        System.out.println(" Hasil pengurangan = "+Pengurangan);
        System.out.println(" Hasil perkalian = "+Perkalian);
        System.out.println(" Hasil pembagian = "+Pembagian);

    }

}
