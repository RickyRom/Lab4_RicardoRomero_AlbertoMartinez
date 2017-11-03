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
public class Ataque {
    public Guerreros g1;
    public Guerreros g2;
    public int num;

    public Ataque(Guerreros g1, Guerreros g2, int num) {
        this.g1 = g1;
        this.g2 = g2;
        this.num = num;
    }

    public Guerreros getG1() {
        return g1;
    }

    public void setG1(Guerreros g1) {
        this.g1 = g1;
    }

    public Guerreros getG2() {
        return g2;
    }

    public void setG2(Guerreros g2) {
        this.g2 = g2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Ataque: " +num ;
    }
    
    
    
}
