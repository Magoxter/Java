package Aula06;

import java.util.Scanner;

public class Aula06 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		ControleRemoto c = new ControleRemoto();
		
		System.out.println("MENU");
		System.out.println("<1> Ligar");
		System.out.println("<2> Desligar");
		System.out.println("<3> Play");
		System.out.println("<4> Pause");
		System.out.println("<5> Mais volume");
		System.out.println("<6> Menos Volume");
		System.out.println("<7> Mutar");
		System.out.println("<8> Desmutar");
		
		int op = sc.nextInt();
		
		while (op > 0 && op < 9) {
			switch (op) {
				case 1:
					c.ligar();
					break;
				case 2:
					c.desligar();
					break;
				case 3:
					c.play();
					break;
				case 4:
					c.pause();
					break;
				case 5:
					c.maisVolume();
					break;
				case 6:
					c.menosVolume();
					break;
				case 7:
					c.ligarMudo();
					break;
				case 8:
					c.desligarMudo();
					break;
				} c.abrirMenu();
			op = sc.nextInt();
		}
	}
}
