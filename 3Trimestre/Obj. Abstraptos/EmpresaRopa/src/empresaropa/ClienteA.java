/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaropa;

/**
 *
 * @author serrperry
 */
public class ClienteA extends Cliente{
    private final double descuento = 0.90;
    public ClienteA(int numCompras){
        super(numCompras);
    }

    @Override
    public double aplicarDescuento() {
        return this.getCompra() * descuento;
    }
}
