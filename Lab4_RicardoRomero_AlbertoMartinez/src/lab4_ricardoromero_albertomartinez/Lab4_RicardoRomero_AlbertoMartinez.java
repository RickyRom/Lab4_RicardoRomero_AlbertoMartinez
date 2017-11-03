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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Guerreros> inventario = new ArrayList();

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

                        inventario.add(new mago(lugar_naci, lugar_naci, nombre, edad, lugar_naci, poder_ataque, salud, costo));
                    }

                    if (op.equals("b")) {
                        
                    }
                }
            }

            if (opn.equals("b")) {

            }

            if (opn.equals("c")) {

            }

            if (opn.equals("d")) {

            }

            if (opn.equals("e")) {

            }
        }
    }

}
