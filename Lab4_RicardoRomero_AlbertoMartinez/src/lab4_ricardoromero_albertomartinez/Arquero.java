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
public class Arquero extends Guerreros{
    public String arco;
    public String armadura;
    

    public Arquero() {
        super();
    }

    public Arquero(String arco, String armadura, String nombre, int edad, String lugar_naci, int poder_ataque, int salud, int costo) {
        super(nombre, edad, lugar_naci, poder_ataque, salud, costo);
        this.arco = arco;
        this.armadura = armadura;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    
    public void atacar(){
        
    }

    @Override
    public void ataque() {
        
    }
    
}
