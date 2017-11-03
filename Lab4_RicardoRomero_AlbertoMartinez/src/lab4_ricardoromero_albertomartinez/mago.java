/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ricardoromero_albertomartinez;

/**
 *
 * @author ricky
 */
public class mago extends Guerreros{
    private String tipo_magia;
    private String elemento_favorito;

    public mago() {
        super();
    }

    public mago(String tipo_magia, String elemento_favorito, String nombre, int edad, String lugar_naci, int poder_ataque, int salud, int costo) {
        super(nombre, edad, lugar_naci, poder_ataque, salud, costo);
        this.tipo_magia = tipo_magia;
        this.elemento_favorito = elemento_favorito;
    }

    public String getTipo_magia() {
        return tipo_magia;
    }

    public void setTipo_magia(String tipo_magia) {
        this.tipo_magia = tipo_magia;
    }

    public String getElemento_favorito() {
        return elemento_favorito;
    }

    public void setElemento_favorito(String elemento_favorito) {
        this.elemento_favorito = elemento_favorito;
    }

    @Override
    public String toString() {
        return "mago{" + "tipo_magia=" + tipo_magia + ", elemento_favorito=" + elemento_favorito + '}';
    }

    @Override
    public void ataque() {
        
    }
}
