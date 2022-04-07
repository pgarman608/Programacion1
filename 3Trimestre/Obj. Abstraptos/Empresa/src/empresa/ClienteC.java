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
public class ClienteC extends Cliente{
    
    private final double descuento = 0.98;
    
    public ClienteC(double compra){
        super(compra);
    }
    @Override
    public double calcularDescuento() {
        double aux = this.getCompra();
        for (double i = this.getTotal() ; i > 10000; i -= 10000) {
            aux = aux * this.descuento;
        }
        return aux;
    }
}
