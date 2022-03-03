package arai.Relacion1;

public class act10array {
    public static void main(String[] args) {
        //Declaracion de variables
            int[] nums1 = new int[20];
            String ip= "";
            String p = "";
            //Solucion
            for (int i = 0; i < nums1.length; i++) {
                nums1[i]=(int)(Math.random()*(((100) - 0 +1) + 0));
            }
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i]%2==0) {
                    p = p + ", " + nums1[i];     
                }else{
                    ip = p + ", " + nums1[i];
                }
            }
            System.out.println(p+ip);
        }
    }

