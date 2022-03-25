/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author serrperry
 */
public class Conversion {

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
        HashSet<String> dicSet = new HashSet<>(diccionario.keySet());
        /*
        for (String string : dicSet) {
            System.out.println(string);
        }*/
        ArrayList<String> dicList = new ArrayList<>(dicSet);
        System.out.println("Arraylist");
        for (String string : dicList) {
            System.out.println(string);
        }
    }
}