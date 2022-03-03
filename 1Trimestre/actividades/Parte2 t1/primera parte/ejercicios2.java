import java.util.Locale;
import java.util.Scanner;
public class ejercicios2{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String separador = "----------------------";
        //Ejercicio1(4)

            //Declaración de variables

                int num11 = 0;

            //Solucion
                System.out.println("Escribe un numero entero en la siguiente linea");

                num11 = sc.nextInt();

                    if(num11 % 2 == 0){
                        System.out.println("Tu numero es par");
                    }

                System.out.println("Adios");

            System.out.println(separador);
        
        //Ejercicio2(5)

            //Declaración de variables
                
                int num21 = 0;
                int num22 = 0;

            //Solución

                System.out.println("Escribeme el primer numero en la siguiente linea");
                
                    num21 = sc.nextInt();
                
                System.out.println("Escribeme el segundo numero en la siguiente linea");
                
                    num22 = sc.nextInt();
                
                if(num21==num22){
                
                    System.out.println("Tus numeros son iguales");
                
                }else if(num21>num22){
                
                    System.out.println("El primer numero es mayor");
                
                }else{
                
                    System.out.println("El segundo numero es mayor");
                
                }

                System.out.println(separador);
        
        //Ejercicio3(7)

            //Declaración de variables

                int num31 = 0;
                int num32 = 0;
                int resto31 = 0;

            //Solución

                System.out.println("Escribeme un numero en la siguiente linea que sea multiplo de 10");

                    num31 = sc.nextInt();

                resto31 = num31 % 10;

                if(resto31 == 0){

                    System.out.println("Tu numero es multiplo de 10");
                    System.out.println("Escribe otro numero que sea multiplo de tres");
                        num32 = sc.nextInt();

                    resto31 = num32 % 10;

                    if(resto31 == 0){

                        System.out.println("Tu segundo numero es multiplo de 10");

                    }else{

                        System.out.println("Tu segundo numero no es multiplo de 10");

                    }
                }else{

                    System.out.println("Tu numero no es multiplo de 10");

                }

                System.out.println(separador);

        //Ejercicio4(8)

            //Declaración de variables

                int num41 = 0;
                int num42 = 0;
                int resto41 = 0;
            
            //Solución
            
                System.out.println("Escribeme un numero para multiplicarlo por otro");
                    num41 = sc.nextInt();
                
                if(num41 == 0){
                
                    System.out.println("El producto de 0 por cualquier número es 0");
                
                }else{
                
                    System.out.println("Escribeme el segundo numero de la multiplicación");
                        
                        num42 = sc.nextInt();
                    
                    resto41 = num41 * num42;

                    System.out.println("El resultado es " + resto41);
                }

                    System.out.println(separador);

        //Ejercicio5(9)
            
            //Declaración de variables
            
                int num51 = 0;
                int num52 = 0;
                int resto51= 0;
            
            //Solucion
            
                System.out.println("Escribeme el primer numero de una division");
                    
                    num51 = sc.nextInt();
                
                System.out.println("Escribeme el segundo numero de una division");

                    num52 = sc.nextInt();

                if(num52 != 0){

                    resto51 = num51 / num52;
                    
                    System.out.println("Tu resultado es: " + resto51);
                
                }else{

                    System.out.println("Error: No se puede dividir entre cero");

                }

                System.out.println(separador);

        //Ejercicio6(10, 11, 12 y 13)
            
            //Declaración de variables

                int num61 = 0;

            //Solucón

                System.out.println("Escribeme un numero que sea multipo de 2 o 3");

                    num61 = sc.nextInt();

                if(((num61 % 2) == 0 )&&((num61 % 3) == 0)){

                    System.out.println("Es multiplo de 2 y 3");
                
                }else if((num61 % 2) == 0){

                    System.out.println("Tu numero es multiplo de 2 pero no del 3");

                }else if((num61 % 3) == 0){

                    System.out.println("Tu numero es multiplo de 3 pero no del 2");

                }else{

                    System.out.println("Error!");

                }

                System.out.println(separador);
        
        //Ejercicio7(14)
            
            //Declaración de variables

                int num71 = 0;
                int num72 = 0;

            //Solucón

                System.out.println("Escribeme un numero:");

                    num71 = sc.nextInt();

                System.out.println("Escribeme otro numero:");

                    num72 = sc.nextInt();

                if( ( ( num71 % 2 ) == 0 ) && ( ( num71 % 2 ) == 0 ) ){

                    System.out.println("Son los dos pares");
                
                }else{
                
                    System.out.println("Los dos ");
                
                }
        //Ejercicio
            //Declaración de variable
                String dsemana = "";
            //solución
                System.out.println("Escribeme un dia de la semana");
                dsemana = sc.nextLine();
                switch(dsemana){
                    case "Lunes":
                    System.out.println("Es Lunes");
                }               
    }
}