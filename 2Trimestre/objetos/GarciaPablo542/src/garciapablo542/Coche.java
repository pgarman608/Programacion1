package garciapablo542;

import garciapablo542.Vehiculo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author serrperry
 */
public class Coche extends Vehiculo{

    public Coche(){
        kilometrosRecorridos=0;
    }
    public Coche(int kilometrosRecorridos){
        Vehiculo.vehiculoscreados++;
        setKilometrosRecorridos(kilometrosRecorridos);
        Vehiculo.kilometrostotales += kilometrosRecorridos;
    }
    public void andar(){
        System.out.println("Andamos con el coche");
    }
    public void accion(){
        System.out.println("Quemamos las ruedas del coche");
    }
}