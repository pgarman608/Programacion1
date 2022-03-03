/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayluno;
/**
 *
 * @author serrperry
 */
public class Compañero {
    private String nombre;
    public Compañero(){
        this.nombre = "";
    }
    public Compañero (String nombre){
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!(nombre.equals(""))) {
            this.nombre = nombre;            
        }
    }
}