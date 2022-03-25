/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.HashSet;

/**
 *
 * @author Pablo
 */
public class Equipo {
    private HashSet<Jugador> equipos;
    public Equipo(){
        this.equipos = new HashSet<>();
    }
    public Equipo(HashSet equipos){
        this.equipos = equipos;
    }

    public HashSet<Jugador> getEquipos() {
        return equipos;
    }

    public void setEquipos(HashSet<Jugador> equipos) {
        this.equipos = equipos;
    }
    public void añadirJugador(Jugador jugador)throws Numeronopositivo{
        if (jugador.getDorsal() > 0) {
            this.equipos.add(jugador);
        }else{
            if (!(equipos.contains(jugador))) {
                                
            }else{
                throw new Numeronopositivo();
            }
        }
    }
    public void borrarJugador(Jugador jugador){
        if (this.equipos.contains(jugador)) {
            this.equipos.remove(jugador);
        }else{
            System.out.println("No se a podido elimar");
        }
    }
}
