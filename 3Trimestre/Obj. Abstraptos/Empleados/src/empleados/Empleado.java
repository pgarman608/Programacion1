/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author serrperry
 */
public abstract class Empleado{
    private String nombre;
    private String apellidos;
    public Empleado(String nombre, String apellidos){
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if (apellidos != null) {
            this.apellidos = apellidos;
        }
    }
    public abstract float calcularSalarioFinal();
}
