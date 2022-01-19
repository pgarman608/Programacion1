package ejercicio1;

/**
 *
 * @author serrperry
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Motocicleta motoc1;
        motoc1 = new Motocicleta();
        Motocicleta motoc2;
        motoc2 = new Motocicleta(100,120,"ABC",1234);

        motoc1.setCaballosdp(80);
        motoc1.setLetrasMatricula("XAN");
        motoc1.setNumeroMatricula(987);
        motoc1.setVpuntaKmh(90);

        motoc1.getCaballosdp();
        motoc1.getLetrasMatricula();
        motoc1.getNumeroMatricula();
        motoc1.getVpuntaKmh();

        motoc2.getCaballosdp();
        motoc2.getLetrasMatricula();
        motoc2.getNumeroMatricula();
        motoc2.getVpuntaKmh();

        motoc1.mostrarMatricula();
        motoc2.mostrarMatricula();
    }
}
