
package javaapplication8;

/**
 *
 * @author serrperry
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fracion f1 = new Fracion(20,4);
        f1.simplifica();
        System.out.println(f1.getDenominador() +" "+ f1.getNumerador());
        f1.toString();
    }
}
