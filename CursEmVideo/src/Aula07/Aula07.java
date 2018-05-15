package Aula07;

import java.util.Scanner;

public class Aula07 {

	static Scanner sc;
	static final int MAX = 10;

	public static void main(String[] args) {		
		sc = new Scanner(System.in);
		
		Lutador[] l = new Lutador[MAX];

		System.out.print("Lutadores: ");
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			l[i] = new Lutador(sc.nextLine(),sc.next(),sc.nextInt(),sc.nextFloat(),sc.nextFloat(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		
		for (int i = 0; i <= n; i++) {
			l[i].apresentar();
		} 	System.out.println();
	}
}
