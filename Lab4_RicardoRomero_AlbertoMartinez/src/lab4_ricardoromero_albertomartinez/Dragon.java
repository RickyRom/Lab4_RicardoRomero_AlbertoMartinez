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
public class Dragon extends Guerreros{
    public String color;
    public String raza;

    public Dragon() {
    }

    public Dragon(String color, String raza, String nombre, int edad, String lugar_naci, int poder_ataque, int salud, int costo) {
        super(nombre, edad, lugar_naci, poder_ataque, salud, costo);
        this.color = color;
        this.raza = raza;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void atacar(){
        
    }
    
}
