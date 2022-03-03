import java.util.Scanner;
public class examen1{
    public static void main(String[] args) {
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        String jugador1= "";
        String jugador2= "";
        Boolean conparacio1 = null;



        //Solución

        System.out.println("Turno 1 j1:");
        jugador1 = sc.nextLine();
        conparacio1 = jugador1.equals("papel") || jugador1.equals("piedra") || jugador1.equals("tijera");
        if(conparacio1 == true){
            System.out.println("Turno 1 j2:");
            jugador2 = sc.nextLine();
            conparacio1 = jugador2.equals("papel") || jugador2.equals("piedra") || jugador2.equals("tijera");

            if (conparacio1 == true) {
                switch (jugador1) {
                    case "papel":
                        switch(jugador2){
                            case "papel":
                            System.out.println("Empate");
                            break;
                            case "tijera":
                            System.out.println("Gana el jugador 2");
                            break;
                            case "piedra":
                            System.out.println("Gana el jugador 1");    
                            break;
                        }

                        break;
                    case "tijera":

                        switch(jugador2){
                            case "papel":
                            System.out.println("Gana el jugador 1");
                            break;
                            case "tijera":
                            System.out.println("Empate");
                            break;
                            case "piedra":
                            System.out.println("Gana el jugador 2");
                            break;
                        }
                        break;
                    default:

                        switch(jugador2){
                            case "papel":
                            System.out.println("Gana el jugador 1");
                            break;
                            case "tijera":
                            System.out.println("Gana el jugador 2");
                            break;
                            case "piedra":
                            System.out.println("Empate");
                            break;
                        }            
                }
            }else{
                System.out.println("El jugador2 no ha metido ni papel ni piedra ni tijera"); 
            }
        }else{
            System.out.println("El jugador1 no ha metido ni papel ni piedra ni tijera");
        }
    }
}