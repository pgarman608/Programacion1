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
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ClienteA ca1 = new ClienteA(300000);
       double aux = ca1.calcularDescuento();
       double roundDbl = Math.round(aux*100.0)/100.0;
       System.out.println(roundDbl);
    }
}
