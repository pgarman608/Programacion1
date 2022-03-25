/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Pablo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        jugador1.setDorsal(2);
        jugador2.setDorsal(2);
        jugador1.setNomApe("Pablo Garcia");
        Equipo equipo1 = new Equipo();
        System.out.println("1");
        try{
            equipo1.añadirJugador(jugador1);
            equipo1.añadirJugador(jugador2);
            System.out.println("2");
        }catch(Numeronopositivo e){
            System.out.println("Un jugador no se ha podido insertar. Error: " + e);
        }
        Estadistica est1 = new Estadistica();
        try{
            est1.añadirpartidosygoles(1, 1);
            System.out.println("3");
            est1.añadirpartidosygoles(2, -2);
        }catch(Numeronopositivo e){
            System.out.println("Un partido o los goles son negativos. Error: " + e);
        }
        System.out.println("4");
    }
}