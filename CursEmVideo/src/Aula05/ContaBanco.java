package Aula05;

public class ContaBanco {
	public int numConta;
	protected String dono;
	private String tipo;
	private float saldo;
	private boolean status;

	// Conta Corrente (CC) += 50$
	// Conta Poupanca (CP) += 150$
	
	public void estadoAtual () {
		System.out.println("-----------------------------");
		System.out.println("Conta:  " + this.getNumConta());
		System.out.println("Tipo:   " + this.getTipo());
		System.out.println("Dono:   " + this.getDono());
		System.out.println("Saldo:  " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void abrirConta (String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if (t == "CC") {
			this.saldo = 50;
		}
		else
		if (t == "CP") {
			this.saldo = 150;
		}
		System.out.println("Conta Aberta com Sucesso!");
	}
	
	public void fecharConta () {
		if (this.getSaldo() > 0) {
			System.out.println("Conta nao pode ser fechada porque ainda tem dinheiro");
		}
		else
		if (this.getSaldo() < 0) {
			System.out.println("Conta nao pode ser fechada pois tem debito");
		}
		else {
			this.setStatus(false);
			System.out.println("Conta Fechada com Sucesso!");
		}
	}
	
	public void depositar (float value) {
		if (this.getStatus()) {
//			this.saldo = this.saldo + value;
			this.setSaldo(this.getSaldo() + value);
			System.out.println(value + " Depositado na Conta de " + this.getDono());
		}
		else {
			System.out.println("Impossivel Depositar em uma Conta Fechada");
		}
	}
	
	public void sacar (float value) {
		if (this.getStatus()) {
			if (this.getSaldo() >= value) {
				this.setSaldo(this.getSaldo() - value);
				System.out.println(value + " Sacado da Conta de " + this.getDono());
			}
			else {
				System.out.println("Saldo Insuficiente para Saque!");
			}
		}
		else {
			System.out.println("Saldo Insuficiente para Saque");
		}
	}
	
	public void pagarMensal () {
		int value = 0;
		
		if (this.getTipo() == "CC") {
			value = 12;
		}
		else
		if (this.getTipo() == "CP") {
			value = 20;
		}
		
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - value);
			System.out.println("Mensalidade paga com Sucesso");
		}
		else {
			System.out.println("Impossivel Pagar uma Conta Fechada");
		}
	}
	
	/* Metodos Especiais */
	public ContaBanco () {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public int getNumConta () {
		return numConta;
	}
	
	public void setNumConta (int newNumConta) {
		this.numConta = newNumConta;
	}
	
	public String getDono () {
		return dono;
	}
	
	public void setDono (String newDono) {
		this.dono = newDono;
	}
	
	public String getTipo () {
		return tipo;
	}
	
	public void setTipo (String newTipo) {
		this.tipo = newTipo;
	}
	
	public float getSaldo () {
		return saldo;
	}
	
	public void setSaldo (float newSaldo) {
		this.saldo = newSaldo;
	}
	
	public boolean getStatus () {
		return status;
	}
	
	public void setStatus (boolean newStatus) {
		this.status = newStatus;
	}
}
