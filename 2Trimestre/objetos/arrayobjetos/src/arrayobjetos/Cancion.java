/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayobjetos;

/**
 *
 * @author serrperry
 */
public class Cancion {
    private String titulo;
    private String Autor;
    
    public Cancion(){
        this.titulo = " ";
        this.Autor = " ";
    }
    public Cancion(String titulo, String Autor){
        setTitulo(titulo);
        setAutor(Autor);
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        if (Autor != null) {
            this.Autor = Autor;
        }
    }
    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;   
        }
    }
}
