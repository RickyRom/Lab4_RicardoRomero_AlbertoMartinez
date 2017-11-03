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
public class elfo extends Guerreros{
    private String tipo_arma;
    private int rango_militar;

    public elfo() {
        super();
    }

    public elfo(String tipo_arma, int rango_militar, String nombre, int edad, String lugar_naci, int poder_ataque, int salud, int costo) {
        super(nombre, edad, lugar_naci, poder_ataque, salud, costo);
        this.tipo_arma = tipo_arma;
        this.rango_militar = rango_militar;
    }

    public String getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(String tipo_arma) {
        this.tipo_arma = tipo_arma;
    }

    public int getRango_militar() {
        return rango_militar;
    }

    public void setRango_militar(int rango_militar) {
        this.rango_militar = rango_militar;
    }

    @Override
    public String toString() {
        return "elfo{" + "tipo_arma=" + tipo_arma + ", rango_militar=" + rango_militar + '}';
    }

    @Override
    public void ataque() {
        
    }
}
