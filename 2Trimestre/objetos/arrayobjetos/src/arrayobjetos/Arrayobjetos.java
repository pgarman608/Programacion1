/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayobjetos;

/**
 *
 * @author serrperry
 */
public class Arrayobjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera(100,100);
        System.out.println("CA = " + cafetera1.getCA() + " CM = " + cafetera1.getCM());
        cafetera1.servirTaza(-1);
    }
    
}
