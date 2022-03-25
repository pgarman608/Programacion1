/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hastset;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author serrperry
 */
public class Hastset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    HashSet<Integer> hs1 = new HashSet<>();
    hs1.add(20);
    hs1.add(25);
    hs1.add(100);
        System.out.println(hs1);
    HashSet<Integer> hs2 = new HashSet<>(hs1);
        System.out.println(hs2);
    hs1.add(8000);
    hs2.addAll(hs1);
    hs1.add(900);
        System.out.println(hs1);
        System.out.println(hs2);
        System.out.println(hs1.equals(hs2));
        System.out.println(hs1.retainAll(hs2));
    HashSet<Object> hs3 = new HashSet<>();
    hs3.add('c');
    String abc = "abc";
        System.out.println(hs1.retainAll(hs2));
        System.out.println(hs1.iterator());
        System.out.println(hs1.iterator());
        Iterator<Integer> aux = hs1.iterator();
        System.out.println(aux.next());
        System.out.println(aux.next());
        System.out.println(hs1);
    }
}
