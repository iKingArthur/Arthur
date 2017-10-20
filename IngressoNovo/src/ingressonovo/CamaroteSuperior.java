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
public class CamaroteSuperior extends Vip {

    String localizacao = "Camarote Superior";
    float taxa = 25;
    float camSup;

    public String getLocalzacao() {
        return localizacao;
    }

    public void setLocalzacao(String localzacao) {
        this.localizacao = localzacao;
    }

    public float getCamSup() {
        return camSup;
    }

    public void setCamSup(float camSup) {
        this.camSup = camSup;
    }

    public void CamaroteSup() {

        this.camSup = taxa + valor + adicional;

        System.out.println("Valor do Ingresso: R$" + camSup);
        System.out.println("Localização do seu Ingresso: " + localizacao);
    }
}
