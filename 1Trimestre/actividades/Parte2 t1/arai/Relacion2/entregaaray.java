package arai.Relacion2;

import java.util.Scanner;
public class entregaaray{
    public static void main(String[] args) {
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        String frase = null;
        char letra = ' ';
        int cont = 0;
        //Solución
        System.out.println("Introduceme una oracion (no meter tildes ni carracteres especiales)");
        frase = sc.nextLine();
        frase.toLowerCase();
        System.out.println("Introduceme una letra para encontrar el numero de veces que se repite en la frase");
        letra = sc.next().charAt(0);
        letra = Character.toLowerCase(letra);
        for (int index = 1; index < frase.length(); index++) {
            if (frase.charAt(index) == letra) {
                cont++;
            }
        }
        System.out.println("Tu letra sale " + cont + " veces");
    }
}
