import java.util.Scanner;
public class scanner1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		System.out.println("A");
		a = sc.nextInt();

		System.out.println("EL a es: " + a);

		//Ejercicio 5
	//Definición y identificación de variables
		int num1 = 0;
		int num2 = 0;
		int ressuma = 0;
		int resresta = 0;
		int resmultiplicacion = 0;
		int resdivision = 0;
		int resresto = 0;
	//Solución del problemas
			System.out.println("Elige el primer numero que sea entero:");
				num1 = sc.nextInt();
			System.out.println("ELige el segundo numero que sea entero:");
				num2 = sc.nextInt();
		ressuma = num1 + num2;
		resresta = num1 - num2;
		resmultiplicacion = num1 * num2;
		resdivision = num1 / num2;
		resresto = num1 & num2;
			System.out.println("El resultado de la suma es: " + ressuma);
			System.out.println("El resultado de la resta es: " + resresta);
			System.out.println("El resultado de la multiplicacion es: " + resmultiplicacion);
			System.out.println("El resultado de la division es: " + resdivision);
			System.out.println("El resultado del resto de la division  es: " + resresto);

	}	
}

