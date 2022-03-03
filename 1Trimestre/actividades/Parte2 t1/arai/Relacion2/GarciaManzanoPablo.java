package arai.Relacion2;

import java.util.Scanner;
public class GarciaManzanoPablo{
    public static void main(String[] args) {
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        String frase = null;
        char letra = ' ';
        int cont = 0;
        //Solución

        System.out.println("Introduceme una oracion (no meter tildes ni carracteres especiales)");
        frase = sc.nextLine();
        frase = frase.toLowerCase();
        
        System.out.println("Introduceme una letra para encontrar el numero de veces que se repite en la frase");
        letra = sc.next().charAt(0);
        letra = Character.toLowerCase(letra);
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                cont++;
            }
        }
        
        System.out.println("Tu letra sale " + cont + " veces");

    }
}