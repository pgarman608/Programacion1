/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

/**
 *
 * @author serrperry
 */
public class Articulo {
    private String codigo;
    private String descripcion;
    private float precio;
    private static int stock;
    public Articulo(){
        this.codigo = "";
        this.descripcion = "";
        this.precio = 0f;
        this.stock++;
    }
    public Articulo(Articulo articulo){
        this.codigo = articulo.getCodigo();
        this.precio = articulo.getPrecio();
        this.descripcion = articulo.getDescripcion();
        this.stock++;
    }
    public Articulo(String codigo, String descripcion, float precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock++;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public static void setStock(int stock) {
        Articulo.stock = stock;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }
    public static int getStock() {
        return stock;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getCodigo() {
        return codigo;
    }
}
