/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author serrperry
 */
public class EmpleadoC extends Empleado{
    private float numDineroVentasTotal;
    private float porcentaje;
    public EmpleadoC(float porcentaje, String nombre, String apellidos){
        super(nombre,apellidos);
        this.setPorcentaje(porcentaje);
    }
    @Override
    public float calcularSalarioFinal() {
        return this.numDineroVentasTotal * this.porcentaje;
    }

    public float getNumDineroVentasTotal() {
        return numDineroVentasTotal;
    }

    public void setNumDineroVentasTotal(float numDineroVentasTotal) {
        if (numDineroVentasTotal > 0) {
            this.numDineroVentasTotal = numDineroVentasTotal;
        }
}

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        if (porcentaje >= 1.00) {
            this.porcentaje = porcentaje;
        }
    }
    
}
