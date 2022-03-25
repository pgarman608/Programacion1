/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebamoodle2;

/**
 *
 * @author serrperry
 */
public class Carta {
    private Palo palo;
    private ValCarta valCarta;

    public Palo getPalo() {
        return palo;
    }
    
    public ValCarta getValCarta() {
        return valCarta;
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
                this.palo = Palo.copas;
            break;
            case 4:
                this.palo = Palo.oros;
            break;
        }
    }

    public void setValCarta(int valCarta) {
        switch(valCarta){
            case 1:
                this.valCarta = ValCarta.as;
            break;
            case 2:
                this.valCarta = ValCarta.dos;
            break;
            case 3:
                this.valCarta = ValCarta.tres;
            break;
            case 4:
                this.valCarta = ValCarta.cuatro;
            break;
            case 5:
                this.valCarta = ValCarta.cinco;
            break;
            case 6:
                this.valCarta = ValCarta.seis;
            break;
            case 7:
                this.valCarta = ValCarta.siete;
            break;
            case 8:
                this.valCarta = ValCarta.ocho;
            break;
            case 9:
                this.valCarta = ValCarta.nueve;
            break;
            case 10:
                this.valCarta = ValCarta.sota;
            break;
            case 11:
                this.valCarta = ValCarta.caballo;
            break;
            case 12:
                this.valCarta = ValCarta.rey;
            break;
        }
    }
    public Carta(Palo palo,ValCarta valCarta){
        this.palo = palo;
        this.valCarta = valCarta;
    }
    @Override
    public String toString(){
        return "El palo es: "+ this.palo + " y su valor es: " + this.valCarta;
    }
    @Override
    public boolean equals(Object obj) {
        boolean aux = false;
        if (obj == this) {
            if (obj instanceof Carta) {
                aux = true;
            }
        }
        return aux;
    }
}
