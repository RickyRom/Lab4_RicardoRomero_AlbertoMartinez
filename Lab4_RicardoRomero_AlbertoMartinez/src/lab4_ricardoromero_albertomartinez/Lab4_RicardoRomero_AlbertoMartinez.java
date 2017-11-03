/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ricardoromero_albertomartinez;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ricky
 */
public class Lab4_RicardoRomero_AlbertoMartinez {

    static ArrayList<Guerreros> inventario = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String opn = "";
        while (!opn.equals("s")) {
            opn = JOptionPane.showInputDialog(""
                    + "a-Creación de Guerreros\n"
                    + "b-Eliminación de Guerreros\n"
                    + "c-Registro de Jugadores\n"
                    + "d-Iniciar Partida\n"
                    + "e-Listar Jugadores\n"
                    + "s-Salir"
                    + "");

            if (opn.equals("a")) {
                String op = "";
                while (!op.equals("s")) {
                    op = JOptionPane.showInputDialog(""
                            + "a-Mago\n"
                            + "b-Elfo\n"
                            + "c-Dragon\n"
                            + "d-Arquero\n"
                            + "e-Bruja\n"
                            + "s-Salir"
                            + "");

                    if (op.equals("a")) {
                        String nombre;
                        int edad;
                        String lugar_naci;
                        int poder_ataque;
                        int salud;
                        int costo;
                        String tipo_magia;
                        String elemento_favorito;

                        nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad: "));
                        lugar_naci = JOptionPane.showInputDialog("Ingrese Lugar Nacimiento: ");
                        poder_ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Poder Ataque(Máximo 50): "));
                        salud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Salud(100-200): "));
                        costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Costo(Máximo 300): "));
                        tipo_magia = JOptionPane.showInputDialog("Ingrese el tipo de magia: ");
                        elemento_favorito = JOptionPane.showInputDialog("Ingrese el elemento favorito: ");

                        inventario.add(new mago(tipo_magia, elemento_favorito, nombre, edad, lugar_naci, poder_ataque, salud, costo));
                    }

                    if (op.equals("b")) {
                        String nombre;
                        int edad;
                        String lugar_naci;
                        int poder_ataque;
                        int salud;
                        int costo;
                        String tipo_arma;
                        int rango_militar;

                        nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad: "));
                        lugar_naci = JOptionPane.showInputDialog("Ingrese Lugar Nacimiento: ");
                        poder_ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Poder Ataque(Máximo 50): "));
                        salud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Salud(100-200): "));
                        costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Costo(Máximo 300): "));
                        tipo_arma = JOptionPane.showInputDialog("Ingrese el tipo de arma: ");
                        rango_militar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Rango Militar: "));

                        inventario.add(new elfo(tipo_arma, rango_militar, nombre, edad, lugar_naci, poder_ataque, salud, costo));
                    }

                    if (op.equals("c")) {
                        String nombre;
                        int edad;
                        String lugar_naci;
                        int poder_ataque;
                        int salud;
                        int costo;
                        String color;
                        String raza;

                        nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad: "));
                        lugar_naci = JOptionPane.showInputDialog("Ingrese Lugar Nacimiento: ");
                        poder_ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Poder Ataque(Máximo 50): "));
                        salud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Salud(100-200): "));
                        costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Costo(Máximo 300): "));
                        color = JOptionPane.showInputDialog("Ingrese el Color: ");
                        raza = JOptionPane.showInputDialog("Ingrese la Raza: ");

                        inventario.add(new Dragon(color, raza, nombre, edad, lugar_naci, poder_ataque, salud, costo));
                    }

                    if (op.equals("d")) {
                        String nombre;
                        int edad;
                        String lugar_naci;
                        int poder_ataque;
                        int salud;
                        int costo;
                        String arco;
                        String armadura;

                        nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad: "));
                        lugar_naci = JOptionPane.showInputDialog("Ingrese Lugar Nacimiento: ");
                        poder_ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Poder Ataque(Máximo 50): "));
                        salud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Salud(100-200): "));
                        costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Costo(Máximo 300): "));
                        arco = JOptionPane.showInputDialog("Ingrese el material del Arco: ");
                        armadura = JOptionPane.showInputDialog("Ingrese el material de la Armadura: ");

                        inventario.add(new Arquero(arco, armadura, nombre, edad, lugar_naci, poder_ataque, salud, costo));
                    }

                    if (op.equals("e")) {
                        String nombre;
                        int edad;
                        String lugar_naci;
                        int poder_ataque;
                        int salud;
                        int costo;
                        String siglo;
                        String lugar;

                        nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad: "));
                        lugar_naci = JOptionPane.showInputDialog("Ingrese Lugar Nacimiento: ");
                        poder_ataque = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Poder Ataque(Máximo 50): "));
                        salud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Salud(100-200): "));
                        costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Costo(Máximo 300): "));
                        siglo = JOptionPane.showInputDialog("Ingrese el Siglo de Nacimiento: ");
                        lugar = JOptionPane.showInputDialog("Ingrese el Lugar de Residencia: ");

                        inventario.add(new Bruja(siglo, lugar, nombre, edad, lugar_naci, poder_ataque, salud, costo));
                    }
                }
            }

            if (opn.equals("b")) {
                listar();
                eliminar();
            }

            if (opn.equals("c")) {

            }

            if (opn.equals("d")) {
                
            }

            if (opn.equals("e")) {

            }
        }
    }

    public static void eliminar() {
        int pos;
        pos = Integer.parseInt(JOptionPane.showInputDialog(" " + "Posicion a Eliminar"));
        inventario.remove(pos);
    }

    public static void listar() {
        String p = "";
        for (Object t : inventario) {
            if (t instanceof Guerreros) {
                p += inventario.indexOf(t) + "" + "-" + t + "\n";
            }
            JOptionPane.showMessageDialog(null, p);
        }
    }
}
