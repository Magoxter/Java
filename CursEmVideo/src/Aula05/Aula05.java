package Aula05;

import java.util.Scanner;

public class Aula05 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int op;
		
		do {
		System.out.println("MENU:");
		System.out.println("1> Abrir Conta");
		System.out.println("2> Fechar Conta");
		System.out.println("3> Depositar");
		System.out.println("4> Sacar");
		System.out.println("5> Saldo");
		System.out.println("0> SAIR");
		System.out.println();
		System.out.print(": ");
		
		op = sc.nextInt();

		ContaBanco conta = new ContaBanco();
		
		switch (op) {
		case 1:
			conta.abrirConta(sc.next());
			conta.numConta = sc.nextInt();
			conta.dono = sc.nextLine();
			conta.setTipo(sc.next());
			
		case 2:
			conta.fecharConta();
			
		case 3:
			conta.depositar(sc.nextFloat());
			
		case 4:
			conta.depositar(sc.nextFloat());
			
		case 5:
			conta.estadoAtual();
		}
		} while (op > 0 && op <= 5);
		System.out.println("Operacao Encerrada!!");


		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco();		
		p2.setDono("Creuza");
		p2.setNumConta(2222);
		p2.abrirConta("CP");
		
		System.out.println();
		
		p1.depositar(100);
		p1.estadoAtual();
		
		System.out.println();
		
		p2.depositar(500);
		p2.estadoAtual();
		
		System.out.println();
		
		p1.fecharConta();
		
		System.out.println();
		
		p2.sacar(1000);
		p2.estadoAtual();
	}
}
