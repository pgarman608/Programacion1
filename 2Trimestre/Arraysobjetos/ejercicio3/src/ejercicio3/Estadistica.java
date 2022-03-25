/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.HashMap;

/**
 *
 * @author Pablo
 */
public class Estadistica {
    private HashMap<Integer,Integer> estadisticas;
    public Estadistica(){
        this.estadisticas = new HashMap<>();
    }
    public Estadistica( HashMap estadisticas){
        setEstadisticas(estadisticas);
    }

    public HashMap getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(HashMap estadisticas) {
        this.estadisticas = estadisticas;
    }
    public void añadirpartidosygoles(Integer partido, Integer goles) throws Numeronopositivo{
        if (partido >= 0 && goles >= 0) {
            estadisticas.put(partido,goles);
        }else{
            throw new  Numeronopositivo();
        }
    }
    public Integer obtenerGoles(Integer partido)throws Numeronopositivo{
        Integer aux;
        if (partido >= 0) {
            aux = estadisticas.get(partido);
        }else{
            throw new Numeronopositivo();
        }
        return aux;
    }
}
