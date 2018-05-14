package Aula06;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto () {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
// Metodos Abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
		
		System.out.println("Sistema Ligado");
		System.out.println();
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
		System.out.println("Sistema Desligado");
		System.out.println();
	}

	@Override
	public void abrirMenu() {
		System.out.println("Ligado:  " + this.getLigado());
		System.out.println("Tocando: " + this.getTocando());
		System.out.println("Volume:  " + this.getVolume());
		
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print(i + " ");
		}	System.out.println();
			System.out.println();
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() +5);
		}
		else {
			System.out.println("Desligado");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() -5);
		}
		else {
			System.out.println("Desligado");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		else
		if (!(this.getLigado())) {
			System.out.println("Desligado");
		}
		else {
			System.out.println("Mudo");
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		else
		if (!(this.getLigado())) {
			System.out.println("Desligado");
		}
		else {
			System.out.println("Tocando");
		}
	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}

// Getter and Setter
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}	
}
