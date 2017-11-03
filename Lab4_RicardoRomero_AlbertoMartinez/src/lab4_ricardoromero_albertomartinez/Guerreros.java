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
public abstract class Guerreros {
    public String nombre;
    public int edad;
    public String lugar_naci;
    public double poder_ataque;
    public double salud;
    public double costo;

    public Guerreros() {
    }

    public Guerreros(String nombre, int edad, String lugar_naci, double poder_ataque, double salud, double costo) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugar_naci = lugar_naci;
        setPoder_ataque(poder_ataque);
        setSalud(salud);
        setCosto(costo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugar_naci() {
        return lugar_naci;
    }

    public void setLugar_naci(String lugar_naci) {
        this.lugar_naci = lugar_naci;
    }

    public double getPoder_ataque() {
        return poder_ataque;
    }

    public void setPoder_ataque(double poder_ataque) {
        this.poder_ataque = poder_ataque;
        if (poder_ataque < 50) {
            this.poder_ataque = poder_ataque;
        }
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
        if (salud > 100 && salud < 200) {
            this.salud = salud;
        }
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
        if (costo < 300) {
            this.costo = costo;
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public abstract Guerreros ataque(Guerreros g2);
}
