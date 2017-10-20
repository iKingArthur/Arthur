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
public class IngressoNovo {
    
    
    public static void main(String[] args) {
        

        Ingresso a = new Ingresso();
        Normal b = new Normal();
        Vip c = new Vip();
        CamaroteInferior d = new CamaroteInferior();
        CamaroteSuperior e = new CamaroteSuperior();
        
        a.ImprimeValor();
        b.ImprimeNormal();
        c.ValorAdicional();
        d.CamaroteInf();
        e.CamaroteSup();
    }
}
