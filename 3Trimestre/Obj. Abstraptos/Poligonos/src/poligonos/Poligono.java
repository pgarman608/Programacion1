/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poligonos;

/**
 *
 * @author serrperry
 */
public abstract class Poligono {
    private abstract float[] lados;
    public Poligono(){
        this.lados = new float[10]
    }
    public abstract float calcularPerimetro();
    public abstract float calcularArea();

    public float[] getLados() {
        return lados;
    }

    public void setLados(float[] lados) {
        this.lados = lados;
    }
}
