import java.util.Scanner;
public class act19rb {
    public static void main(String[] args) {
        //Declaracion
        Scanner sc = new Scanner(System.in);
        int capas = 0 ;
        String esp = " ";
        String piramide = "*";
        //Solucion
        System.out.println("¿Cuantas capas quieres?");
        capas = sc.nextInt();
        for (int i = capas; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                esp = esp + " ";
            }
            System.out.println(esp + piramide);
            piramide = piramide + "*" + "*";
            esp = " ";
        }
    }
}
