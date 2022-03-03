/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garciapablo542;

/**
 *
 * @author serrperry
 */
public class Vehiculo{
    public static int vehiculoscreados = 0;
    public static int kilometrostotales = 0;
    public int kilometrosRecorridos;
    public Vehiculo(){
        vehiculoscreados++;
        kilometrosRecorridos = 0;
    }
    public Vehiculo(int kilometrosRecorridos){
        vehiculoscreados++;
        setKilometrosRecorridos(kilometrosRecorridos);
        kilometrostotales += kilometrosRecorridos;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        if(kilometrosRecorridos > 0){
            this.kilometrosRecorridos = kilometrosRecorridos;
            kilometrostotales += kilometrosRecorridos;
        }
    }
}
