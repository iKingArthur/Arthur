/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;

/**
 *
 * @author Arthur
 */
public class ParImpar {

    public static void main(String[] args) {

        int a;
        int b = 0;
        float c;
        float d = 1;

        for (a = 0; a < 31; a++) {
            if (a % 2 != 0) {
                b = b + a;
            }
        }
        for (c = 1; c < 31; c++) {

            if (c % 2 == 0) {
                d = d * c;
            }

        }
        System.out.println("Soma dos números impares entre 0 e 30: " + b);
        System.out.println("Multiplicação dos números pares entre 0 e 30: " + d);

//      E16 = 3606
//      Valor total da multiplicação = 4.28498713606 
//      Se 0 contar como par, então c = 0 e d = 1, resultando no resultado da multiplicação como 0
    }

}
