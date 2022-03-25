/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciomapas;

/**
 *
 * @author serrperry
 */
public class Carta {
    private Palo palo;
    private Numero valCarta;
    public Carta(){
        int aux = 0;
        aux = (int)((Math.random() * (4-1)) + 1);
        setPalo(aux);
        aux = (int)((Math.random() * (9 - 1)) + 1);
        setNumero(aux);
    }
    public Carta(Numero valCarta,Palo palo){
        this.palo = palo;
        this.valCarta = valCarta;
    }
    public void setPalo(int palo) {
        switch(palo){
            case 1:
                this.palo = Palo.bastos;
            break;
            case 2:
                this.palo = Palo.espadas;
            break;
            case 3:
                this.palo = Palo.oros;
            break;
            case 4:
                this.palo = Palo.copas;
            break;
        }
    }

    public void setNumero(int valCarta) {
        switch(valCarta){
            case 1:
                this.valCarta = Numero.as;
            break;
            case 2:
                this.valCarta = Numero.dos;
            break;
            case 3:
                this.valCarta = Numero.tres;
            break;
            case 4:
                this.valCarta = Numero.cuatro;
            break;
            case 5:
                this.valCarta = Numero.cinco;
            break;
            case 6:
                this.valCarta = Numero.seis;
            break;
            case 7:
                this.valCarta = Numero.sota;
            break;
            case 8:
                this.valCarta = Numero.caballo;
            break;
            case 9:
                this.valCarta = Numero.rey;
            break;
        }
    }
    public Palo getPalo() {
        return palo;
    }
    
    public Numero getValCarta() {
        return valCarta;
    }
    
    @Override
    public String toString(){
        return this.valCarta + " de " + this.palo;
    }
    
    public boolean equals(Carta obj) {
        boolean aux = false;
        if (obj.getPalo() == this.palo) {
            if (obj.getValCarta() == this.valCarta) {
                aux = true;
            }
        }
        return aux;
    }
    
}
