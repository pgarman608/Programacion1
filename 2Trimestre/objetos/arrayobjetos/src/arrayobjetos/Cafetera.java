/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayobjetos;

/**
 *
 * @author serrperry
 */
public class Cafetera {
    private int CM;
    private int CA;
    
    public Cafetera(){
        this.CA = 0;
        this.CM = 1000;
    }
    public Cafetera(int CM){
        this.CA = CM;
        this.CM = CM;
    }
    public Cafetera(int CM, int CA){
        setCM(CM);
        setCA(CA);
    }
    
    public int getCM() {
        return CM;
    }

    public int getCA() {
        return CA;
    }

    public void setCA(int CA) {
        if (CA > 0) {
            if (CA <= CM) {
                this.CA = CA;
            }else{
                this.CA = this.CM;
            }
        }
    }
    public void setCM(int CM) {
        if (CM > 0) {
            this.CM = CM;
        }
    }
    public void llenarCafetera(){
        this.CA = this.CM;
    }
    public void agregarCafe(int Cafe){
        this.CA += Cafe;
    }
    public void vaciarCafetera(){
        this.CA = 0;
    }
    public void servirTaza(int taza){
        if (taza>0) {
            if (taza > this.CA) {
                System.out.println("Solo se podrá servir una taza de " + this.CA + " de cafe");
            }else{
                System.out.println("Se sirve una taza de " + taza + " de cafe");
            }
        }else{
            System.out.println("No se puede servir una taza");
        }
    }
}
