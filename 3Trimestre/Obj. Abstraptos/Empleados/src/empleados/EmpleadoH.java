/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author serrperry
 */
public class EmpleadoH extends Empleado{
    private int numHoras;
    private float salarioHora;
    private float salHoraExt;
    public EmpleadoH(String nombre, String apellidos, float salarioHora, float salHoraExt){
        super(nombre, apellidos);
        this.setSalHoraExt(salHoraExt);
        this.setSalarioHora(salarioHora);
    }
    @Override
    public float calcularSalarioFinal() {
        float salarioFinal = 0 ;
        if (this.numHoras <= 40) {
            salarioFinal = this.numHoras * this.salarioHora;
        }else{
            int horasExtras = this.numHoras - 40;
            salarioFinal = 40 * this.salarioHora;
            salarioFinal += horasExtras * this.salHoraExt;
        }
    return salarioFinal;
    }
    public int getNumHoras() {
        return numHoras;
    }
    public void setNumHoras(int numHoras) {
        if (numHoras > 0) {
            this.numHoras = numHoras;
        }
    }
    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        if (salarioHora > 0) {
            this.salarioHora = salarioHora;
        }
    }

    public float getSalHoraExt() {
        return salHoraExt;
    }

    public void setSalHoraExt(float salHoraExt) {
        if (salHoraExt > 0) {
            this.salHoraExt = salHoraExt;
        }
    }
    
}
