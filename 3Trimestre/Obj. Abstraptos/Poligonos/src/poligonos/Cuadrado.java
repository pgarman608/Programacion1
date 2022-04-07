/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poligonos;

/**
 *
 * @author serrperry
 */
public class Cuadrado extends Poligono{
    private float[] lados;
    public Cuadrado(){
        this.lados = new float[4];
    }

    @Override
    public float calcularArea() {
        float aux = this.lados[1] * this.lados[0]; 
        return aux;
    }

    @Override
    public float calcularPerimetro() {
        float aux = 0;
        for (int i = 0; i < this.lados.length; i++) {
            aux += this.lados[i];
        }
        return aux;
    }

    public float[] getLados() {
        return lados;
    }

    public void setLados(float[] lados) {
        this.lados = lados;
    }
}
