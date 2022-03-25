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
public class Jugador {
    private Integer dorsal;
    private String nomApe;
    public Jugador(){
        this.dorsal = 0;
        this.nomApe = "";
    }
    public Jugador(Integer dorsal, String nomApe){
        setDorsal(dorsal);
        setNomApe(nomApe);
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public String getNomApe() {
        return nomApe;
    }
    
    public void setDorsal(Integer dorsal) throws Numeronopositivo {
        if ( dorsal >= 0) {
            this.dorsal = dorsal;
        }else{
            throw new Numeronopositivo();
        }
    }

    public void setNomApe(String nomApe) {
        this.nomApe = nomApe;
    }
}
