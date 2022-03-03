import java.util.*;
import java.io.*;
public class buclesr1 {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int ejercicio = 0;
        System.out.println("Dime que actividad quieres");
        ejercicio = teclado.nextInt();
//Ejercicio1
        while (ejercicio == 1) {
            //Declaración de variables
            
            //Solucion
            for (int i = 0; i <= 100; i = i +5) {
                System.out.println(i);
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio2
        while (ejercicio == 2) {
            //Declaración de variables
            int num = 0;
            // Solución

            while (num <= 100) {
                System.out.println(num);
                num = num +5;
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio3
        while (ejercicio == 3) {
            //declracion de variables
            int num = 0;
            do {
                System.out.println(num);
                num = num + 5;
            } while (num <= 100);
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio4
        while (ejercicio == 4) {
           for (int i = 320; i > 140; i = i -20) {
               System.out.println(i);
           }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio5
        while (ejercicio == 5) {
            int num = 320;
            while (num > 160) {
                num = num -20;
                System.out.println(num);   
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio6
        while (ejercicio == 6) {
            // Declaración de variables
            int num = 320;
            //Solución
            do {
                num = num - 20;
                System.out.println(num);
            } while (num >= 180);
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio7
        while (ejercicio == 7) {
            int cont = 0;
            int i = 0;
            while (cont != 2345 || i == 4){
                System.out.println("Introduce 4 numeros para abrir la caja fuerte");
                cont = teclado.nextInt();
                i++;
                if (cont == 2345 ) {
                    System.out.println("La caja se ha abierto satisfactoriamente");
                } else {
                    System.out.println("Lo siento, esa no es la combinación");
                    
                }
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio8
        while (ejercicio == 8) {
            //Declaracion de variables
            int num1 = 0;
            int calc1 = 0;
            //Solucion
            System.out.println("Escribeme un numero para saber su tabla de multiplicar.");
            num1 = teclado.nextInt();  
            for (int i = 0; i <= 10; i++) {
                calc1 = num1 * i;
                System.out.println(""+ num1 +" x "+ i +" = "+ calc1);
                i++;
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio9
        while (ejercicio == 9) {
            int form = 0;
            System.out.println("Forma 1 o 2");
            form = teclado.nextInt();
            while(form == 1){
                //Declaración de variables
                int num1= 0;
                int num2= 0;
                char n = 'n';
                //Solución
                do {
                    System.out.println("Escribeme un numero para contarle los digitos");
                    num1 = teclado.nextInt();
                    num2=0;
                    while (num1 != 0) {
                        num1 = num1/10;
                        num2++;
                    }
                System.out.println("Tu nombre tiene " + num2 + " cifras");
                System.out.println("Continuar");
    
                //Sacar un char por pantalla
                n =  teclado.next().charAt(0);
                
                } while (n != 'n' && n != 'N');
            }
            while (form == 2) {
                //Declaracion de variables
                int num1 = 0;
                int suma = 0;
                //Solucion
                System.out.println("Introduce un numero");
                num1 = teclado.nextInt();
                for ( int i = num1 ; i != 0 ; i = i /10) {
                    suma++;
                }
                System.out.println(suma);
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio10
        while (ejercicio == 10)  {
            //Hacer con dowhile
            float contar = 0; 
            int num1 = 0;
            int num2 = 0;
            float res1= 0;
            int sumar= 0;
            /*
            System.out.println("Escrime cuantos numeros quieres para la media");
            contar = teclado.nextInt();
            for (int i = 1; i <= contar; i++) {
                num1 = teclado.nextInt();
                res1=res1+num1;
            }
            res1 = res1 / contar;
            System.out.println("La media es:" + res1);
            */
            do {
                System.out.println("Introduce el numeroa sumar");
                num1 = teclado.nextInt();
                if (num1 > 0) {
                    sumar+=num1;
                    num2++;
                }
            } while (num1<0);
            if (num2>0) {
                System.out.println("La media es" + (sumar/num2));
            } else {
                System.out.println("La media no se puede hacer.");
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio11
        while (ejercicio == 11) {
            Double num1 = 0.0;
            System.out.println("Escribeme el numero para calcular: ");
            num1 = teclado.nextDouble();
            for (int i = 0; i <= 4; i++){
                System.out.println(""+ (num1 + i) +"\t"+ Math.pow((num1 + i), 2) + "\t" + Math.pow((num1 + i), 3));
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio12
        while (ejercicio == 12) {
            int numf1 = 0;
            int numf2 = 1;
            int suma = 0;
            int fivo = 0 ;
            System.out.println("¿Cuantos numeros quieres de la serie de fibonacci?");
            fivo = teclado.nextInt();
            if (fivo <=0){
                System.out.println("Error, numero incorrecto");
            }else{
                for (int i = 0; i <= fivo; i++) {
                    System.out.print(suma+" ");
                    suma = numf1 + numf2;
                    numf1 = numf2;
                    numf2 = suma;
                }
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio13
        while (ejercicio == 13) {
            int num1 = 0;
            int contn = 0;
            int contp = 0;
            for (int i = 1; i <=10; i++) {
                System.out.println("Numero " + i + " = ");
                num1 = teclado.nextInt();
                if (num1 < 0){
                    System.out.println("Negativo");
                    contp++;
                }else{
                    System.out.println("Positivo");
                    contn++;
                }
            }
            System.out.println("Hay " + contn + " numeros negativos");
            System.out.println("Hay " + contp + " numeros positivos");
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio14
        while (ejercicio == 14) {
            int num1 = 0 ;
            int num2 = 0 ;
            int sol = 0 ;

            System.out.println("Escribeme la base:");
            num1 = teclado.nextInt();
            System.out.println("Escribeme el exponente:");
            num2 = teclado.nextInt();
            sol = (int)Math.pow(num1, num2);
            System.out.println("La solucion es:");
            System.out.println(sol);   
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio15
        while (ejercicio == 15) {
            int num1 = 0;
            int num2 = 0;
            int resu = 1;
            System.out.println("Escribeme el base");
            num1 = teclado.nextInt();
            System.out.println("Escribeme cuantos exponentes quieres");
            num2 = teclado.nextInt();
            
            for (int index = 1; index <= num2; index++) {
                resu = resu * num1;
                System.out.println(num1 + "^" + index + " = " + resu);
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio16
        while (ejercicio == 16) {
            int fin2 = 0;
            do {
            int num1 = 0;
            System.out.println("Escribeme un numero");
            num1 = teclado.nextInt();
            if (num1 == 1 || num1 == 2 || num1 == 3 || num1 == 5) {
                System.out.println("Tu numero es primo");
            } else {
                if (num1 % num1 == 0 && num1 % 1 == 0) {
                    if(num1 % 2 == 0 || num1 % 3 == 0 || num1 % 5 == 0){
                        System.out.println("Tu numero no es primo");
                    }else{
                        System.out.println("Tu numero es primo");   
                    }
                } else {
                    System.out.println("Tu numero no es primo");
                }   
            }
            System.out.println("Repetir");
            fin2 = teclado.nextInt();
            } while (fin2 != 0);
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio17
        while (ejercicio == 17) {
            int num1 = 0;
            System.out.println("Introduce un numero");
            num1 = teclado.nextInt();
            for (int i = 0; i <= 100; i++) {
                System.out.println(num1);
                num1 = num1 + 1;
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio18
        while (ejercicio == 18) {
            int num1 = 0 ;
            int num2 = 0 ;
            System.out.println("Escribeme el primer numero");
            num1 = teclado.nextInt();
            System.out.println("Escribeme el segundo numero");
            num2 = teclado.nextInt();
            for (int index = num1; index < num2; index+=7) {
                num1+=7;
                System.out.println(num1);
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio19
        while (ejercicio == 19) {
            //Declaracion de variables
            String carac="0";
            int vueltas = 0 ;
            String calc1 ="0";
            String tabu = " ";
            //Solucion
            System.out.println("Introduce el numero de capas");
            vueltas = teclado.nextInt();
            for (int i = vueltas; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    tabu = tabu + " ";
                }
                carac+=tabu;
                System.out.println(carac);
                carac+=calc1;
                tabu = " ";
            }
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio20
        while (ejercicio == 20) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio21
        while (ejercicio == 21) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio22
        while (ejercicio == 22) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio23
        while (ejercicio == 23) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio24
        while (ejercicio == 24) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio25
        while (ejercicio == 25) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio26
        while (ejercicio == 26) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio27
        while (ejercicio == 27) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio28
        while (ejercicio == 28) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio29
        while (ejercicio == 29) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
        }
//Ejercicio30
        while (ejercicio == 30) {
            
            System.out.println("Terminar(0)");
            ejercicio = teclado.nextInt();
            
        }
    }
}