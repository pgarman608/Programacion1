/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebamoodle2;

/**
 *
 * @author serrperry
 */
public class Pruebamoodle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carta ct1 = new Carta(Palo.bastos,ValCarta.as);
        Carta ct2 = new Carta(Palo.copas,ValCarta.dos);
        System.out.println(ct1.equals(ct1));
    }
    
}
