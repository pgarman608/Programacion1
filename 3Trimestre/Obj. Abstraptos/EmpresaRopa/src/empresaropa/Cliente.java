/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaropa;

/**
 *
 * @author serrperry
 */
public abstract class Cliente {
    
    private int numCompras;
    private double compra;
    
    public Cliente(int numCompras){
        setNumCompras(numCompras);
        this.compra = 0;
    }
    
    public abstract double aplicarDescuento();

    public int getNumCompras() {
        return numCompras;
    }

    public void setNumCompras(int numCompras) {
        if(numCompras >= 0){
            this.numCompras = numCompras;
        }else{
            this.numCompras = 0;
        }
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        if(compra >= 0.01){
            this.compra += compra;
        }else{
            System.out.println("No se puede añadir a la compra");
        }
    }
}
