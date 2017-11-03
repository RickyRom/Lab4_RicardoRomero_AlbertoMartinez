/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ricardoromero_albertomartinez;

/**
 *
 * @author Alberto
 */
public class Bruja extends Guerreros{
    public String siglo;
    public String lugar;

    public Bruja() {
        super();
    }

    public Bruja(String siglo, String lugar, String nombre, int edad, String lugar_naci, int poder_ataque, int salud, int costo) {
        super(nombre, edad, lugar_naci, poder_ataque, salud, costo);
        this.siglo = siglo;
        this.lugar = lugar;
    }

    public String getSiglo() {
        return siglo;
    }

    public void setSiglo(String siglo) {
        this.siglo = siglo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

 
    public void atacar(){
            
}

    @Override
    public void ataque() {
        
    }
}
