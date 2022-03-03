/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author serrperry
 */
public class Examen1TF {
    /**
     * ExamenT1 va representar unas Olimpidas. El usuario introducira un 
     * numero de participantes con sus respectivos nombres y los 
     * ordenaremos por numero menor a mayor Tiempo 
     * (El tiempo lo generamos con un random). Una vez terminamos esto
     * los escribimos por pantalla los tres tiempos menores con su 
     * respectivo participante.
     * @author Pablo García
     */
    /**
     * Ejecutaremos todos las funciones posteriores en este función
     * @param args main
     */
    public static void main(String[] args) {

        funcionOlimpiadas();
    }
    /**
     * En esta función le pediremos al usuario mediante un String 
     * que nos introduzca un numero entero.
     * @param msg Texto para el numero
     * @return El numero que sacara el usuario
     */
    public static int introducirNumeroUsuario(String msg) {
        Scanner sc = new Scanner(System.in);
        int numUser = -1;

        System.out.println(msg);
        numUser = sc.nextInt();

        return numUser;
    }
    /**
     * En esta función le pediremos al usuario mediante un String
     * que nos introduzca un texto (String)
     * @param msg Texto para el numero
     * @return El texto que sacaremos de la función
     */
    public static String introducirTextoUsuario(String msg) {
        Scanner sc = new Scanner(System.in);
        String textUser = "";

        System.out.println(msg);
        textUser = sc.nextLine();

        return textUser;

    }
    /**
     * En esta función seleccionará el usuario el número (int) de participantes,
     * el array del los nombres de los participantes (String[]) y el array de los
     * tiempos de los particicpantes (float[]). Los arrays los llenaremos y ordenaremos
     * garacias a otras funciones creadas más abajo.
     * Finalmente representaremos el podio gracias a otra función más abajo.
     */
    public static void funcionOlimpiadas() {
        int numCorredores = pedirNumeroParticipantes();
        String[] arrNombres = new String[numCorredores];
        float[] arrTiempos = new float[numCorredores];

        introducirNombresCorredores(arrNombres);
        
        generarTiemposCorredores(arrTiempos);

        ordenarArrayCorredores(arrNombres, arrTiempos);
        
        mostrarPodio(arrNombres, arrTiempos);
    }
    /**
     * En esta función le pediremos un numero de particicpantes al usuario (int) que este entre 3 y 
     * 10 participantes 
     * @return Nos devuelve el nuero de participantes
     */
    public static int pedirNumeroParticipantes() {
        int numCorredores;
        do {
            numCorredores = introducirNumeroUsuario("Introduce el numero de corredores (entre 3 y 10): ");
        } while ( !(numCorredores >= 3 && numCorredores <= 10) );

        return numCorredores;
    }
    /**
     * En esta función le pedirá a la funcion introducirTextoUsuario que a su vez le
     * le pedirá usuario que meta los nombres en el array de los participantes
     * @param arrayN El array que vamos a rellenar con Strings
     */
    public static void introducirNombresCorredores(String[] arrayN) {
        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = introducirTextoUsuario("Introduce el nombre del corredor: " + (i + 1));
        }
    }
    /**
     * En esta función generaremos los tiempos de los particicpantes
     * introducientdolos en el array correspondientes.
     * @param arrayT El array del tiempo que utilicaremos.
    */
    public static void generarTiemposCorredores(float[] arrayT) {
        for (int i = 0; i < arrayT.length; i++) {
            arrayT[i] = (float) ((Math.random() * (100.0f - 1.0f))+1);
        }
    }
    /**
     * Una funcion en la que ordenaremos los arrays de los nombres de los particicpantes junto con el de los tiempos
     * y los intercambiamos con otros funcións
     * @param arrN Array de los nombres
     * @param arrT Array de los Tiempos
     */
    public static void ordenarArrayCorredores(String[] arrN, float[] arrT) {
        for (int i = 0; i < arrT.length; i++) {
            for (int k = 0; k < arrT.length - i - 1; k++) {
                if (arrT[k + 1] < arrT[k]) {                // Si el siguiente es menor que el actual
                    intercambiarPosArray(arrT, k, k + 1);   // Se intercambian los tiempos...
                    intercambiarPosArray(arrN, k, k + 1);   // ..Y los nombres.
                }
            }
        }
    }
    /**
     * En esta función es la que utilizaremos para mostrar el podio en pantalla.
     * @param arrayN Array de los nombres
     * @param arrayT Array de los tiempos
     */
    public static void mostrarPodio(String[] arrayN, float[] arrayT) {
        System.out.println("--- PODIO ----");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("En la posición " + (i + 1) + ": " + arrayN[i]
                    + ", tiempo: " + arrayT[i]);
        }
    }
    /**
     * En esta función  intercambiaremos el array de los nombres
     * @param array Array de los nombres
     * @param posI Posicion actual
     * @param posF Posicion posterior
     */
    public static void intercambiarPosArray(String[] array, int posI, int posF) {
        String aux = "";

        aux = array[posF];
        array[posF] = array[posI];
        array[posI] = aux;
    }
    /**
     * En esta función intercambiaremos el array de los tiempos
     * @param array Array de los Tiempos
     * @param posI Posicion actual
     * @param posF Posicion posterior
     */
    public static void intercambiarPosArray(float[] array, int posI, int posF) {
        float aux = 0f;

        aux = array[posF];
        array[posF] = array[posI];
        array[posI] = aux;
    }
    /**
     * Esta Función auxiliar mejora el ejercicio representando los arrays de
     * los tiempos y los participantes antes de ordenarlas.
     * @param arrayS Array de los nombres
     * @param arrayT Array de los tiempos
     */
    public static void mostrarArrayOriginal(String[] arrayS, float[] arrayT){
        System.out.println("----- LISTA DE CORREDORES -----");
        
        for (int i = 0; i < arrayT.length; i++) {
            System.out.println("Corredor: " + (i + 1) + ": " + arrayS[i]
                    + ", tiempo: " + arrayT[i]);
        }
    }
}