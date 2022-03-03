package ejercicio1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author serrperry
 */
public class Motocicleta {
    private int caballosdp;
    private int vpuntaKmh;
    private String letrasMatricula;
    private String numeroMatricula;
    public Motocicleta(){
        this.caballosdp = 0;
        this.vpuntaKmh = 0;
        this.letrasMatricula = "";
        this.numeroMatricula = "";
    }
    public Motocicleta(int caballosdp, int vpuntaKmh, String letrasMatricula, String numeroMatricula){
        this.setCaballosdp(caballosdp);
        this.setVpuntaKmh(vpuntaKmh);
        this.setLetrasMatricula(letrasMatricula);
        this.setNumeroMatricula(numeroMatricula);
    }
    public int getCaballosdp(){
        return this.caballosdp;
    }
    public int getVpuntaKmh(){
        return this.vpuntaKmh;
    }
    public String getLetrasMatricula(){
        return this.letrasMatricula;
    }
    public String getNumeroMatricula(){
        return this.numeroMatricula;
    }
    public void setCaballosdp(int caballosdp){
        this.caballosdp = caballosdp;
    }
    public void setVpuntaKmh(int vpuntaKmh){
        this.vpuntaKmh = vpuntaKmh;
    }
    public void setLetrasMatricula(String letrasMatricula){
        this.letrasMatricula = letrasMatricula;
    }
    public void setNumeroMatricula(String numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }
    public void mostrarMatricula(){
        System.out.println(this.letrasMatricula + this.numeroMatricula);
    }
}
