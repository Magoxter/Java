package Aula08;

import java.util.Random;
import Aula07.Lutador;

public class Luta {
	Lutador desafiado;
	Lutador desafiante;
	private boolean aprovada;
	
	public void marcarLuta (Lutador l1,Lutador l2) {
		this.setAprovada(false);
		if (l1.getCategoria() == l2.getCategoria()) {
			if (l1 != l2) {
				setAprovada(true);
				this.setDesafiado(l1);
				this.setDesafiante(l2);
				return;
			}
		}
		this.setDesafiante(null);
		this.setDesafiado(null);
	}
	
	public void lutar() {
		if (this.isAprovada()) {
			System.out.println("###DESAFIADO###");
			this.desafiado.apresentar();
			System.out.println("###DESAFIANTE###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			
			int winner = aleatorio.nextInt(3);
			
			switch (winner)	{
			case 0:
				System.out.println("Empate!!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("Vitoria: " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:
				System.out.println("Vitoria: " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
		} else {
			System.out.println("Luta nao pode Acontecer!");
		}
	}

// Getter and Setter
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public boolean isAprovada() {
		return aprovada;
	}
	
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
