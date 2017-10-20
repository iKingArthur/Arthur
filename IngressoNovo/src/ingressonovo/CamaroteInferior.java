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
public class CamaroteInferior extends Vip {

    String localizacao = "Camarote Inferior";
    float camInf = valor + adicional;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void CamaroteInf() {

        System.out.println("Valor do Ingresso Camarote Inferior: R$" + camInf);
        System.out.println("Localização do seu Ingresso: " + localizacao);

    }
}
