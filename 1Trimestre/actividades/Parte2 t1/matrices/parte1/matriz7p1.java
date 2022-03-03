public class matriz7p1{
	public static void main(String[] args) {
		//Declaracion de variables
		final int vacio = 0;
		final int mina = 1;
		final int tesoro = 2;
		final int intento = 3;
		//Solucion
		int x;
		int y;
		int[][] cuadrante = new int[5][4];
		for(x=0;x<4;x++){
			for(y = 0;y < 3; y++){
				cuadrante[x][y] = vacio;
			}
		}
		int minaX = (int)(Math.random()*5);
		int minaY = (int)(Math.random()*4);
		cuadrante[minaX][minaY] = mina;
		int tesoroX = 0 ;
		int tesoroY = 0 ;
		do {
			tesoroX = (int)(Math.random()*5);
			tesoroY = (int)(Math.random()*4);
		} while ((minaX==tesoroX)&&(minaY == tesoroY));
		cuadrante[tesoroX][tesoroY] = tesoro;
		System.out.println("¡BUSCA EL TESORO!");
		boolean salir= false;
		String c = "";
		do {
			for(y=3 ;y >= 0; y--){
				for(x = 0 ;x< 5; x++){
					if (cuadrante[x][y] == intento) {
						System.out.print("X ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("--------------\n 0 1 2 3 4\n");
			// pide las coordenadas

			System.out.print("Coordenada x: ");
			x = Integer.parseInt(System.console().readLine());
			System.out.print("Coordenada y: ");
			y = Integer.parseInt(System.console().readLine());
			// mira lo que hay en las coordenadas indicadas por el usuario
			switch(cuadrante[x][y]) {
				case vacio:
				cuadrante[x][y] = intento;
				break;
				case mina:
				System.out.println("Lo siento, has perdido.");
				salir = true;
				break;
				case tesoro:
				System.out.println("¡Enhorabuen¡Has encontrado el tesoro!");
				salir = true;
				break;
				default:
			}
		} while (!salir);
		for(y=3; y>= 0; y--){
			System.out.print(y + " ");
			for(x=0; x<5; x++){
				switch (cuadrante[x][y]) {
					case vacio:
					c = " ";
					break;
					case mina:
					c = "€ ";
					break;
					case intento:
					c = "X ";
					break;
					default:
				}
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("-----------\n 0 1 2 3 4\n");
	}
}