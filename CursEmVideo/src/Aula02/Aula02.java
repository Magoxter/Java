package Aula02;

public class Main {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;

		c1.Status();
		System.out.println("====");
		c1.Rabiscar();
		
		System.out.println();

		c1.Tampar();
		c1.Status();
		System.out.println("====");
		c1.Rabiscar();
		
		System.out.println();

		c1.Destampar();
		c1.Status();
		System.out.println("====");
		c1.Rabiscar();
	}
}
