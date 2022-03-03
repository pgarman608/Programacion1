import java.util.Scanner;
public class ejerciciomatricesstring{
	public static void main(String[] args) {
		//Declaracion de variables
		
		Scanner sc = new Scanner(System.in);
		String fraseS = null;
		int contador = 0;
		int numletras=0;
		char contletras=' ';
		String estrella= " ";
		//Solucion
		
		System.out.println("Introduceme una frase o oracion");
		fraseS = sc.nextLine();
		numletras = fraseS.length();
		//Array
		char[] fraseA = new char[numletras];
		
		System.out.println(fraseA.length);
		for (int i = 0; i < numletras; i++) {
			fraseA[i] = fraseS.charAt(i);
		}
		for (int i = 0; i < fraseA.length; i++) {
			if (fraseA[i] != ' ') {
				contletras = fraseA[i];
			}
			for (int j = 0; j < fraseA.length; j++) {
				if(contletras != ' '){
					if (contletras == fraseA[j]) {
						contador++;
						fraseA[j]= ' ';		
					}
				}
			}
			for (int j = 0; j < contador; j++) {
				estrella += "*";
			}
			if (contletras != ' ') {
				System.out.println(contletras + " = " + estrella);
			}
			contador = 0;
			estrella = " ";
			contletras = ' ';
		}
	}
}