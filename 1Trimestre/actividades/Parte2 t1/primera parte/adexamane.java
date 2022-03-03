import java.util.Scanner;	
public class adexamane{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double horas = 0;
		double tiempo = 0;
		System.out.println("Dime la variable hora");
		horas = sc.nextFloat();
		horas = horas * 2;
		horas = horas / 9.81;	
		tiempo = Math.sqrt(horas);
		System.out.println(tiempo);
	}
}