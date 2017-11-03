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
    static ArrayList<Jugador> jugadores = new ArrayList();

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
                if (!inventario.isEmpty()) {
                    eliminar();
                } else {
                    JOptionPane.showMessageDialog(null, "No hay guerreros en el inventario!");
                }
            }

            if (opn.equals("c")) {
                int val;
                do {
                    val = 0;
                    String nombre;
                    double dinero;
                    Guerreros g;
                    int pos;

                    nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
                    dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad de dinero disponible: "));

                    if (inventario.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay guerreros en el inventario!");
                        val = 0;
                    } else {
                        String s = "Eliga el numero del Guerrero que desea comprar\n";
                        for (Object t : inventario) {
                            if (t instanceof Guerreros) {
                                s += "" + inventario.indexOf(t) + "- " + t + " Costo: " + ((Guerreros) t).getCosto() + "\n";
                            }
                        }
                        pos = Integer.parseInt(JOptionPane.showInputDialog(s));

                        if (dinero < inventario.get(pos).getCosto()) {
                            val = 1;
                            JOptionPane.showMessageDialog(null, "No tiene el suficiente dinero! vuelva a intentar");
                        } else {

                            dinero = dinero - inventario.get(pos).getCosto();
                            JOptionPane.showMessageDialog(null, "Ha comprado su guerrero con exito!");
                            jugadores.add(new Jugador(nombre, dinero, inventario.get(pos)));
                            inventario.remove(pos);
                            JOptionPane.showMessageDialog(null, "Jugador creado con exito!");
                        }
                    }

                } while (val == 1);

            }

            if (opn.equals("d")) {
                String p = "Escoja al jugador 1"+"\n";
                String s="";
                int pos1, pos2, cont=2, win=0;
                for (Object t : jugadores) {
                    if (t instanceof Jugador) {
                        p += jugadores.indexOf(t) + "" + "-" + t + "\n"
                                + "Dinero: " + ((Jugador) t).getDinero() + "\n"
                                + "Puntos: " + ((Jugador) t).getPuntos() + "\n"
                                + "Guerrero: " + ((Jugador) t).getGuerrero() +" Salud: "+((Jugador) t).getGuerrero().getSalud() + " Poder de ataque: "+((Jugador) t).getGuerrero().getPoder_ataque()+ "\n";
                    }

                }
                pos1 = Integer.parseInt(JOptionPane.showInputDialog(p));
                
                p = "Escoja al jugador 2"+"\n";

                for (Object t : jugadores) {
                    if (t instanceof Jugador) {
                        p += jugadores.indexOf(t) + "" + "-" + t + "\n"
                                + "Dinero: " + ((Jugador) t).getDinero() + "\n"
                                + "Puntos: " + ((Jugador) t).getPuntos() + "\n"
                                + "Guerrero: " + ((Jugador) t).getGuerrero() +" Salud: "+((Jugador) t).getGuerrero().getSalud() + " Poder de ataque: "+((Jugador) t).getGuerrero().getPoder_ataque()+ "\n";
                    }

                }
                pos2 = Integer.parseInt(JOptionPane.showInputDialog(p));
                do{
                    if (cont%2==0) {
                        s="Guerrero del jugador 1: " + ((Jugador) jugadores.get(pos1)).getGuerrero() +" Salud: "+((Jugador) jugadores.get(pos1)).getGuerrero().getSalud() + " Poder de ataque: "+((Jugador) jugadores.get(pos1)).getGuerrero().getPoder_ataque()+ "\n"
                                +"Guerrero del jugador 2: " + ((Jugador) jugadores.get(pos2)).getGuerrero() +" Salud: "+((Jugador) jugadores.get(pos2)).getGuerrero().getSalud() + " Poder de ataque: "+((Jugador) jugadores.get(pos2)).getGuerrero().getPoder_ataque()+ "\n"
                                +"ATACAR";

                        JOptionPane.showMessageDialog(null, s);
                        jugadores.get(pos2).setGuerrero(jugadores.get(pos1).getGuerrero().ataque(jugadores.get(pos2).getGuerrero()));
                        JOptionPane.showMessageDialog(null, "Termino tu turno!");
                        if(jugadores.get(pos2).getGuerrero().getSalud()<=0){
                            win=1;
                        }
                        cont++;

                    }else{
                        s="Guerrero del jugador 1: " + ((Jugador) jugadores.get(pos1)).getGuerrero() +" Salud: "+((Jugador) jugadores.get(pos1)).getGuerrero().getSalud() + " Poder de ataque: "+((Jugador) jugadores.get(pos1)).getGuerrero().getPoder_ataque()+ "\n"
                                +"Guerrero del jugador 2: " + ((Jugador) jugadores.get(pos2)).getGuerrero() +" Salud: "+((Jugador) jugadores.get(pos2)).getGuerrero().getSalud() + " Poder de ataque: "+((Jugador) jugadores.get(pos2)).getGuerrero().getPoder_ataque()+ "\n"
                                +"ATACAR";

                        JOptionPane.showMessageDialog(null, s);
                        jugadores.get(pos1).setGuerrero(jugadores.get(pos2).getGuerrero().ataque(jugadores.get(pos1).getGuerrero()));
                        JOptionPane.showMessageDialog(null, "Termino tu turno!");
                        if(jugadores.get(pos1).getGuerrero().getSalud()<=0){
                            win=2;
                        }
                        cont++;
                    }
                }while(win==0);
                if(win==1){
                    JOptionPane.showMessageDialog(null, "Ganaste "+jugadores.get(pos1));
                    jugadores.get(pos1).setPuntos(jugadores.get(pos1).getPuntos()+3);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Ganaste "+jugadores.get(pos2));
                    jugadores.get(pos1).setPuntos(jugadores.get(pos2).getPuntos()+3);
                    
                }
                
            }

            if (opn.equals("e")) {
                String p = "";
                for (Object t : jugadores) {
                    if (t instanceof Jugador) {
                        p += jugadores.indexOf(t) + "" + "-" + t + "\n";
                    }
                    JOptionPane.showMessageDialog(null, p);
                }
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
        }
        JOptionPane.showMessageDialog(null, p);
    }
}
