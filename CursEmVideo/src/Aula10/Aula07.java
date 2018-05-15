package Aula07;

import java.util.Scanner;

public class Aula07 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome(sc.nextLine());
		p2.setNome(sc.nextLine());
		p3.setNome(sc.nextLine());
		p4.setNome(sc.nextLine());
		
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
		System.out.println(p3.getNome());
		System.out.println(p4.getNome());
	}

}
