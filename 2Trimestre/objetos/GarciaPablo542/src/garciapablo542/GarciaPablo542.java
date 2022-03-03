/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garciapablo542;

import java.util.Scanner;

/**
 *
 * @author serrperry
 */
public class GarciaPablo542 {
    private static Bicicleta bici1 = new Bicicleta();
    private static Coche car1 = new Coche();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        car1.setKilometrosRecorridos(100);
        bici1.setKilometrosRecorridos(50);
        todo();
    }
    private static void todo(){
        int nummenu = 0;
        do {
            verMenu();
            nummenu = pruebaMenu(nummenu);
            elegirMenu(nummenu);
        } while (nummenu != 8);
    }
    private static void verMenu(){
        System.out.println("VEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
    }
    private static int pruebaMenu(int menu){
        int menu2 = menu;
        boolean aux = true;
        do {
           aux = true;
           menu2 = insertKeyInt("Elige la opcion entre 1 y 8");
            if (menu2 < 1 || menu2 > 8) {
                aux = false;
                System.out.println("Has introducido un numero incorrecto");
            }
        } while (aux == false);
        return menu2;
    }
    private static int insertKeyInt(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int aux = sc.nextInt();
        return aux;
    }
    private static void elegirMenu(int nummenu){
        switch(nummenu){
            case 1:
                System.out.println("-----------");
                bici1.andar();
                System.out.println("-----------");
            break;
            case 2:
                System.out.println("-----------");
                bici1.accion();
                System.out.println("-----------");
            break;
            case 3:
                System.out.println("-----------");
                car1.andar();
                System.out.println("-----------");
            break;
            case 4:
                System.out.println("-----------");
                car1.accion();
                System.out.println("-----------");
            break;
            case 5:
                System.out.println("Los Kilometros recorridos de la bici son " + bici1.kilometrosRecorridos);
            break;
            case 6:
                System.out.println("-----------");
                System.out.println("Los Kilometros recorridos del coche son " + car1.kilometrosRecorridos);
                System.out.println("-----------");
            break;
            case 7:
                System.out.println("-----------");
                System.out.println("Los Kilometros recorridos totales son " + Vehiculo.kilometrostotales);
                System.out.println("-----------");
            break;
            case 8:
                System.out.println("Adios");
            break;
        }
    }
}
