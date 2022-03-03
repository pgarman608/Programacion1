import java.util.Locale;
import java.util.Scanner;
import javax.imageio.stream.ImageOutputStream;
import javax.xml.transform.Source;
public class ejercicios1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
//Ejercicio 1
			String o ="-----------------------";
			System.out.println("B = Base de datos y P = Programacion");
			System.out.println(o);
			System.out.println("   | L | M | X | J | V |");
			System.out.println(o);
			System.out.println(" 1 | B | P | B | P | B |");
			System.out.println(o);
			System.out.println(" 2 | P | B | P | B | P |");
			System.out.println(o);
//Ejercicio 2
		System.out.println("    *");
		System.out.println("   ***");
		System.out.println("  *****");
		System.out.println(" *******");
		System.out.println("*********");
//Ejercicio 3
		String separador = "----------------";
			System.out.println("|\tAND\t|\tOR \t|\tNOT\t|");
			System.out.println(separador + separador + separador);
			System.out.println("|Inputs |Outputs|Inputs |Outputs|Inputs |Outputs|");
			System.out.println(separador + separador + separador);
			System.out.println("| F | F | " + (false&&false) + " | F | F | " + (false||false) + " | F |   " + (!false) + "    |");
			System.out.println(separador + separador + separador);
			System.out.println("| T | F | " + (true&&false) + " | T | F | " + (true||false) + "  | T |   " + (!true) + "   |");
			System.out.println(separador + separador + separador);
			System.out.println("| F | T | " + (false&&true) + " | F | T | " + (false||true) + "  |");
			System.out.println(separador + separador);
			System.out.println("| T | T | " + (true&&true) + "  | T | T | " + (true||true) + "  |");
			System.out.println(separador + separador);
//Ejercicio 8
	//Forma larga
		char barrita = 92;
			System.out.println("Salto de linea -> " + barrita + "n");
	//Forma corta
		System.out.println("Salto de linea -> \\n");
		System.out.println("Recroceso -> \\b");
		System.out.println("Tabulador -> \\t");
		System.out.println("Salto de pagina -> \\f");
		System.out.println("Retorno de carro -> \\r");
//Ejercicio 4
	//Definicion y identificacion de variables
		String nom = "";
	//Solución del problema
			System.out.println("Escribe en la seguiente linea tu nombre");
				nom = sc.nextLine();
			System.out.println("Tu nombre es: " + nom);
//Ejercicio 5
	//Definición y identificación de variables
		int num1 = 0;
		int num2 = 0;
		int res1 = 0;
	//Solución del problemas
			System.out.println("Elige el primer numero que sea entero:");
				num1 = sc.nextInt();
			System.out.println("ELige el segundo numero que sea entero:");
				num2 = sc.nextInt();
			res1 = num1 + num2;
			System.out.println("El resultado de la suma es: " + res1);
			res1 = num1 - num2;
			System.out.println("El resultado de la resta es: " + res1);
			res1 = num1 * num2;
			System.out.println("El resultado de la multiplicacion es: " + res1);
			res1 = num1 / num2;
			System.out.println("El resultado de la division es: " + res1);
			res1 = num1 % num2;
			System.out.println("El resultado del resto de la division  es: " + res1);
//Ejercicio 6
	//Definición y identificación de variables
		double num11 = (double) 0.0;
		double num12 = (double) 0.0;
		double res2 = 0;
	//Solución del problemas
			System.out.println("Elige el primer numero que sea real:");
				num11 = sc.nextFloat();
			System.out.println("ELige el segundo numero que sea real:");
				num12 = sc.nextFloat();
			res2 = num11 + num12;
			System.out.println("El resultado de la suma es: " + res2);
			res2 = num11 - num12;
			System.out.println("El resultado de la resta es: " + res2);
			res2 = num11 * num12;
		    System.out.println("El resultado de la multiplicacion es: " + res2);
			res2 = num11 / num12;
			System.out.println("El resultado de la division es: " + res2);
			res2 = num11 % num12;
			System.out.println("El resultado del resto de la division  es: " + res2);
//Ejercicio 7
	//Declaracion e identificación de variables
		int num21 = 0;
		int num22 = 0;
	//Solución del pogramacion
			System.out.println("Escribe el primer numero en la siguiente linea:");
		num21 = sc.nextInt();
			System.out.println("Escribe el segundo numero de la siguiente linea:");
		num22 = sc.nextInt();
			System.out.println("¿Es igual? -> ");
			System.out.println(num21==num22);
			System.out.println("¿Son diferentes? -> ");
			System.out.println(num21!=num22);
			System.out.println("¿Es menor? -> ");
			System.out.println(num21<num22);
			System.out.println("¿Es mayor? -> ");
			System.out.println(num21>num22);
			System.out.println("¿Es menor o igual? -> ");
			System.out.println(num21<=num22);
			System.out.println("¿Es mayor o igual? -> ");
			System.out.println(num21>=num22);
//Ejercicio 9
	//Declaración e identificacion de variables
		
	//Solucion del problema
			System.out.print("S\no\nl\n");
//Ejercicio 10
	//Declaración e identificación de variables
		int importe = 0;
		double importecondes = 0;
	//Solucion
			System.out.println("Digame su importe en la siguiente linea:");
				importe = sc.nextInt();	
				importecondes = importe * 0.9;
			System.out.println("Con el 10% de porciento de descuento:");
			System.out.println(importecondes);
//Ejercicio 11
	//Declaración e identificación de variables
		int importe1 = 0;
		int importecondes1 = 0;
	//Solucion
			System.out.println("Digame su importe en la siguiente linea:");
				importe1 = sc.nextInt();	
				importecondes1 = importe1 * (90 / 100);
			System.out.println("Con el 10% de porciento de descuento:");
			System.out.println(importecondes1);
			System.out.println("La solucion es la misma ya que primero hace el parentesis");
			System.out.println("que es igual a 0,9.");
//Ejercicio 12
	//Declaración e identificación de variables
		double importe3 = 0;
		double importecondes3 = 0;
	//Solucion
			System.out.println("Digame su importe en la siguiente linea:");
				importe3 = sc.nextInt();	
				importecondes3 = importe3 *(90f / 100);
			System.out.println("Con el 10% de porciento de descuento:");
			System.out.println(importecondes3);
			System.out.println("En este pograma al poner la f nos dara un numero más largo");
			System.out.println("por que el float es de 64bits y float es de 32 bits");
	}	
}