/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garciapablo542;

import garciapablo542.Vehiculo;

/**
 *
 * @author serrperry
 */
public class Bicicleta extends Vehiculo{
    public Bicicleta(){
        kilometrosRecorridos=0;
    }
    public Bicicleta(int kilometrosRecorridos){
        vehiculoscreados++;
        setKilometrosRecorridos(kilometrosRecorridos);
        kilometrostotales += kilometrosRecorridos;
    }
    
    public void andar(){
        System.out.println("Andamos con la bicicleta");
    }
    
    public void accion(){
        System.out.println("Hacemos el caballito con la Bicicleta");
    }
}
