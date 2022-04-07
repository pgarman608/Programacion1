/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Pablo
 */
public abstract class Cliente {
    private double total;
    private double compra;
    public Cliente(double compra){
        this.compra = compra;
        this.total += compra;
    }

    public double getTotal() {
        return total;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        if (compra >= 1.00) {
            this.compra = compra;
        }
    }
    public abstract double calcularDescuento();
}
