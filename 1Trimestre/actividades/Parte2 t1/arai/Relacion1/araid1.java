package arai.Relacion1;

public class araid1{
    public static void main(String[] args) {
        //Declaracion
        int[] numeros = new int[100];
        //Solucion
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        for (int index = 0; index < numeros.length; index++) {
            System.out.println(numeros[index]);
        }
    }
}