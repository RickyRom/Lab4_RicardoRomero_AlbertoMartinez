/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ricardoromero_albertomartinez;

import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Partida {
    public int num;
    ArrayList<Ataque>ataques=new ArrayList();

    public Partida() {
    }

    public Partida(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
  

    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public void setAtaques(ArrayList<Ataque> ataques) {
        this.ataques = ataques;
    }

    @Override
    public String toString() {
        return "partida: "+num;
    }
    
}
