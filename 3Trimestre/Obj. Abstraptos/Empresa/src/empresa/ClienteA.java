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
public class ClienteA extends Cliente{

    private static final double descuento = 0.90;
    
    public ClienteA(double compra){
        super(compra);
    }
    @Override
    public double calcularDescuento() {
        double aux = this.getCompra();
        for (double totalAux = this.getTotal() ; totalAux >= 10000; totalAux -= 10000) {
            aux = aux * this.descuento;
        }
        return aux;
    }
}