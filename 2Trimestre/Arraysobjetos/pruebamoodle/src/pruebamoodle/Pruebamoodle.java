/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebamoodle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author serrperry
 */
public class Pruebamoodle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    HashMap<String,String> hm1 = new HashMap<>();
    String valuetemp = "";
    String keytemp = "";
    boolean aux = false;
    System.out.println("Por favor, introduzca nombre de usuario y contraseña para acceder al área restringida.");
    System.out.println("Dispone de 3 intentos.");
    hm1.put("admin","224477");
    hm1.put("maria","ztf99");
    hm1.put("pepe","zxcvb");

    for(int i = 1; i<4 && aux == false; i++){
        System.out.println("Usuario:");
        keytemp = sc.nextLine();
        System.out.println("Contraseña:");
        valuetemp = sc.nextLine();
        if (hm1.containsKey(keytemp)) {
            if(hm1.containsValue(valuetemp)){
                aux = true;
                System.out.println("Ha accedido al área restringida");
            }
        }
    }
    if (aux == false) {
        System.out.println("Lo siento, no tiene acceso al área restringida");
    }
    }
}
