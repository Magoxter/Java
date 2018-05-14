package Aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void Status () {
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamp: " + this.tampada);
		System.out.println("Carga: " + this.carga);
	}
	
	void Rabiscar () {
		if (this.tampada == true) {
			System.out.println("ERR0R");
		}
		else
			System.out.println("Rabiscar");
	}
	
	void Tampar () {
		this.tampada = true;
	}
	
	void Destampar () {
		this.tampada = false;
	}
}
