/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerodecrescente;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class NumeroDecrescente {

   
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int v;
        String entrada;

        System.out.print("Digite um valor: ");
        entrada = in.next();
        v = Integer.parseInt(entrada);

        do {
            System.out.println(v);
            v--;
        } while (v >= 0);
    }

}
