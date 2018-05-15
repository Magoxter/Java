package Aula07;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador (String no,String na,int id,float al,float pe,int vi,int de,int em) {
		setNome(no);
		setNacionalidade(na);
		setIdade(id);
		setAltura(al);
		setPeso(pe);
		setVitorias(vi);
		setDerrotas(de);
		setEmpates(em);
	}
	
	public void apresentar () {
		System.out.println("Nome:          " + this.nome);
		System.out.println("Nacionalidade: " + this.nacionalidade);
		System.out.println("Idade:         " + this.idade);
		System.out.println("Altura:        " + this.altura);
		System.out.println("Peso:          " + this.peso);
		System.out.println("Vitorias:      " + this.vitorias);
		System.out.println("Derrotas:      " + this.derrotas);
		System.out.println("Empates:       " + this.empates);
	}
	
	public void status () {
		System.out.println(this.nome);
		System.out.println("peso " + this.getCategoria());
		System.out.println("Ganhou:  " + this.getVitorias());
		System.out.println("Perdeu:  " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
	}
	
	public void ganharLuta () {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta () {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta () {
		this.setEmpates(this.getEmpates() + 1);
	}
	
// Getter and Setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.peso < 52.2)
			this.categoria = "Invalida";
		else
		if (this.peso <= 70.3)
			this.categoria = "Leve";
		else
		if (this.peso <= 83.9)
			this.categoria = "Medio";
		else
		if (this.peso <= 120.2)
			this.categoria = "Pesado";
		else
			this.categoria = "Invalida";
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
