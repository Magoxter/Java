package Aula07;

public class Professor extends Pessoa {
	private String especialidade;
	private boolean trabalhando;

	public void receberAumento () {
		
	}
	
// Getter and Setter
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public boolean isTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
}
