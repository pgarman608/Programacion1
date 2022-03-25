/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diccionario;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author serrperry
 */
public class Diccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,String> diccionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String aux = "";
        diccionario.put("puerto","door");
        diccionario.put("diccionario","diccionary");
        diccionario.put("perro","dog");
        diccionario.put("gato","cat");
        diccionario.put("arana","spider");
        System.out.println("Escribeme una palabra en español y te la dire en ingles");
        aux = sc.nextLine();
        aux = aux.toLowerCase();
        if (diccionario.containsKey(aux)) {
            System.out.println(aux + " en ingles es " + diccionario.get(aux));
        }else{
            System.out.println("La palabra " + aux + " no se encuentra en el diccionario.");
        }
    }
}
