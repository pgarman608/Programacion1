import java.util.Scanner;
public class exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0 ;
        int exp = 0 ;
        int resu = 0 ;
        System.out.println("Introduce la base");
        base = sc.nextInt();
        System.out.println("Introduce el exponente");
        exp = sc.nextInt();
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= exp; j++) {
                resu = i * j;
                System.out.println(i + " ^ "+ j + " = " + resu);
            }
        }
    }
}
