package ejercicio1;
/**
 *
 * @author serrperry
 */
public class Motocicleta {
    private int caballosdp;
    private int vpuntaKmh;
    private String letrasMatricula;
    private int numeroMatricula;
    public Motocicleta(){
        caballosdp = 0;
        vpuntaKmh = 0;
        letrasMatricula = "";
        numeroMatricula = 0;
    }
    public Motocicleta(int caballosdp, int vpuntaKmh, String letrasMatricula, int numeroMatricula){
        this.caballosdp = caballosdp;
        this.vpuntaKmh = vpuntaKmh;
        this.letrasMatricula = letrasMatricula;
        this.numeroMatricula = numeroMatricula;
    }
    public int getCaballosdp(){
        return caballosdp;
    }
    public int getVpuntaKmh(){
        return vpuntaKmh;
    }
    public String getLetrasMatricula(){
        return letrasMatricula;
    }
    public int getNumeroMatricula(){
        return numeroMatricula;
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
    public void setNumeroMatricula(int numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }
    public void mostrarMatricula(){
        System.out.println(numeroMatricula + letrasMatricula);
    }
}
