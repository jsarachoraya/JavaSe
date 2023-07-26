package com_eduit;

import java.util.Scanner;

public class Jsonify {

	public static void main(String[] args) {
		int chac, zam, carn;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese 3 estilos de musica:\n 1)Chacarera \n 2)Zamba \n 3)Carnavalito");
			chac = scanner.nextInt();
			System.out.println("Chacarera: " + chac);
			zam = scanner.nextInt();
			System.out.println("Zamba: " + zam);
			carn = scanner.nextInt();
			System.out.println("Carnavalito: " + carn);
		}
		
		System.out.println();
		
		if(chac==1 & zam==2 & carn==3) {
			System.out.println("Estilos: Chacarera, Zamba, Carnavalito");
		}else {
			System.out.println("Error");
		}
	}

}
