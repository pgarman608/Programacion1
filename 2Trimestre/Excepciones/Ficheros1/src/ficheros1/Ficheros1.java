/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author serrperry
 */
public class Ficheros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        leer_fichero Le = new leer_fichero();
        Le.lee();
    }
    
}
class leer_fichero{
    public void lee(){
        try {
            FileReader entrada = new FileReader("/home/serrperry/NetBeansProjects/leer1.txt");
            FileWriter entrada2 = new FileWriter("/home/serrperry/NetBeansProjects/leer1.txt");
            int c = entrada.read();
            while(c!=-1){
                c= entrada.read();
                System.out.println(c);
            }
        } catch (IOException ex) {
            System.out.println("No se encuentra el archivo");
        }
        
    }
}