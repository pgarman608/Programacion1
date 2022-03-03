import java.util.Scanner;
public class examen1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jugador1 = "";
		String jugador2 = "";
		System.out.print("Introduce piedra, papel y tijera (jugador1):");
		jugador1 = sc.nextLine();

		if ((jugador1 == "piedra")||( jugador1 =="papel")||( jugador1== "tijera")){
			System.out.print("Introduce piedra, papel y tijera (jugador2):");
			jugador1 = sc.nextLine();
			if (jugador2=="piedra"|| jugador2=="papel"|| jugador2=="tijera") {
				switch(jugador1){
					case "piedra":
						switch (jugador2) {
							case "piedra":
							System.out.println("Gana jugador2");
							break;
							case "papel":
							System.out.println("Empate");
							break;
							case "tijera":
							System.out.println("Gana jugador1");
							break;
						}
					break;
					case "papel":
						switch (jugador2) {
							case "piedra":
							System.out.println("Gana jugador1");
							break;
							case "papel":
							System.out.println("Gana jugador1");
							break;
							case "tijera":
							System.out.println("Gana jugador2");
							break;
						}
					break;
					case "tijera":
						switch (jugador2) {
							case "piedra":
							System.out.println("Gana jugador2");
							break;
							case "papel":
							System.out.println("Gana jugador2");
							break;
							case "tijera":
							System.out.println("Gana jugador1");
							break;
						}
					break;
				}	
				
			}else{

				System.out.println("El jugador2 no ha metido ni piedra ni papel ni tijera");
			}
		}else{
			System.out.println("El jugador1 no ha metido ni piedra ni papel ni tijera");
		}
	}
}
