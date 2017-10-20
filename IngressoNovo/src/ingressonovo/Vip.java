/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingressonovo;

/**
 *
 * @author Arthur
 */
public class Vip extends Ingresso {

    float adicional = 5;
    float vip;

    public void ValorAdicional() {

        this.vip = adicional + valor;
        System.out.println("Valor  Vip: R$" + vip);

    }

}
