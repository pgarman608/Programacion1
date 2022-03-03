/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;
/**
 *
 * @author serrperry
 */
public class Alumnos {
    private String DNI;
    private int edad;
    private float[] notat;
    private final int todostr = 3;
    public Alumnos(){
        this.DNI = "";
        this.edad = -1;
        notat = new float[todostr];
        for (int i = 0; i < todostr; i++) {
            this.notat[i] = (float)-1.0;
        }
    }
    public String getDNI() {
        return DNI;
    }
    public int getEdad() {
        return edad;
    }
    public float[] getNotat() {
        return notat;
    }
    public void setDNI(String DNI) {
        if (!(DNI.equals("") || DNI == null)) {
            this.DNI = DNI;
        }
    }
    public void setNotat(float[] notat) {
        boolean aux = revisarnotas(notat);
        if (aux == false) {
            this.notat = notat;
        }
    }
    public void setEdad(int edad) {
        if (edad >= 1 && edad <= 100) {
            this.edad = edad;
        }
    }
    public float notamedia(){
        boolean aux = revisarnotas(this.notat);
        float notamedia;
        if (aux == true) {
            notamedia =-1;
        }else{
            notamedia =(this.notat[0] + this.notat[1] + this.notat[2])/3;
        }
        return notamedia;
    }
    public boolean revisarnotas(float[] notat){
        boolean aux = false;
        for (int i = 0; i < 3; i++) {
            if (notat[i] <= -1 && notat[i] >=10) {
                aux = true;
            }
        }
        return aux;
    }
    public void importnota(float NTr , int pos){
        if (NTr >= 0 && NTr <= 10) {
            if (pos >= 1 && pos <= 3) {
                pos--;
                this.notat[pos] = NTr;
            }
        }
    }
    public void vernotas(){
        System.out.println(this.notat[0]);
        System.out.println(this.notat[1]);
        System.out.println(this.notat[2]);
    }
}