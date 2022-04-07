/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author serrperry
 */
public class EmpleadoA extends Empleado{
    public float salarioBase;
    
    public EmpleadoA(String nombre,String apellidos, float salarioBase){
        super(nombre, apellidos);
        setSalarioBase(salarioBase);
    }
    
    public float getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        if ( salarioBase >= 0) {
            this.salarioBase = salarioBase;
        }
    }

    @Override
    public float calcularSalarioFinal() {
        return this.salarioBase;
    }
}
