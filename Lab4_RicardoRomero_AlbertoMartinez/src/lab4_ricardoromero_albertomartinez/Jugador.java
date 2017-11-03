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
public class Jugador {
        public String nombre;
        public double dinero;
        public int puntos=0;
        public Guerreros guerrero;

    public Jugador(String nombre, double dinero, Guerreros guerrero) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.guerrero = guerrero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Guerreros getGuerrero() {
        return guerrero;
    }

    public void setGuerrero(Guerreros guerrero) {
        this.guerrero = guerrero;
    }

    @Override
    public String toString() {
        return nombre;
    }
        
        
}
