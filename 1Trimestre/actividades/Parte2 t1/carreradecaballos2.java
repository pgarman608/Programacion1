import java.util.*;
import java.lang.Thread;
public class carreradecaballos2 {
    public static void main(String[] args) throws InterruptedException {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        String caballo1 = "/=1=/º";
        String caballo2 = "/=2=/º";
        String caballo3 = "/=3=/º";
        String move = "-";
        int eleccion = 0;
        int vueltas = 0;
        int calc1 = 0;
        int calc2 = 0;
        int calc3 = 0;
        //Solución
        do {
            System.out.println("Introduceme que caballo quieres ( 1, 2 y 3):");
            eleccion = sc.nextInt();
            if (eleccion == 1 || eleccion == 2 || eleccion == 3) {
                System.out.println("Eleccion de caballo correcto");
            } else {
                System.out.println("No existe ese caballo");
            }
        } while (eleccion == 1 && eleccion == 2 && eleccion == 3);
        System.out.println("¿Cual es la meta( en numero)?");
        vueltas = sc.nextInt();
        for (int i = 0; i < vueltas; i++) {
            int r =0;
            r = (int)(Math.random()*(4-1)+1);
            if (r == 1) {
                caballo1=move + caballo1;
                calc1++;
            } else {
                if (r==2) {
                    caballo2=move + caballo2;
                    calc2++;
                } else {
                    if (r==3) {
                        caballo3=move + caballo3;
                        calc3++;
                    }
                }
            }
            i = calc1 + calc2 + calc3;
            Thread.sleep(1200);
                System.out.println(caballo1);
                System.out.println(caballo2);
                System.out.println(caballo3);
        }
            switch (eleccion) {
                case 1:
                    if (calc1 > calc2) {
                        if (calc1 > calc3) {
                            System.out.println("Has ganadp");
                        } else {
                            System.out.println("Has perdido, ha ganado el caballo 3");
                        }
                    } else {
                        if (calc2 > calc3) {
                            System.out.println("Has perdido, ha ganado el caballo 2");
                        }
                    }
                    break;
                case 2:
                if (calc1 > calc2) {
                    if (calc1 > calc3) {
                        System.out.println("Has perdido, ha ganado el caballo 1");
                    } else {
                        System.out.println("Has perdido, ha ganado el caballo 3");
                    }
                } else {
                    if (calc2 > calc3) {
                        System.out.println("Has ganado");
                    }
                }
                    break;
                default:
                if (calc1 > calc2) {
                    if (calc1 > calc3) {
                        System.out.println("Has perdido, ha ganado el caballo 1");
                    } else {
                        System.out.println("Has ganado");
                    }
                } else {
                    if (calc2 > calc3) {
                        System.out.println("Has perdido, ha ganado el caballo 3");
                    }
                }
            }
    }
}