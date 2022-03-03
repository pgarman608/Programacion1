 package arai.Relacion2;
 
 /**
  * actividad1r2
  */
 public class actividad1r2 {
 
    public static void main(String[] args) {
        //Declarcion de variables
        int arpns = 10;
        int[] arps = new int[arpns];
        int[] arpp = new int[arpns];
        int[] arpi = new int[arpns];
        int auxo = 0;
        int auxp = 0;
        int auxi = 0;
        //Solucion
        for (int i = 0; i < arps.length; i++) {
            arps[i] = (int)(Math.random()*(9+1));
        }
        for (int i = 0; i < arps.length; i++) {
            for (int j = 0; j < arps.length-1; j++) {
                if (arps[j+1] < arps[j]) {
                    auxo = arps[j+1];
                    arps[j+1] = arps[j];
                    arps[j]=auxo;
                }
            }
        }
        for (int i = 0; i < arps.length; i++) {
            if (arps[i]%2==0) {
                arpp[auxp] = arps[i];
                auxp++;
            } else {
                arpi[auxi] = arps[i];
                auxi++;
            }          
        }
        for (int i = 0; i < arpp.length; i++) {
            System.out.println(arpp[i]);
        }
        System.out.println("---------");
        for (int i = 0; i < arpi.length; i++) {
            System.out.println(arpi[i]);
        }
    }
 }