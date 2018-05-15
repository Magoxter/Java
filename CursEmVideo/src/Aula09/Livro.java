package Aula09;

public class Livro implements Publicacao {
	private String titulo;
	private String author;
	private int totPaginas;
	private int pagAtual;
	private boolean open;
	private Pessoa leitor;
	
	public void detalhes () {
		System.out.println("LIVRO...");
		System.out.println("Title:   " + this.getTitulo());
		System.out.println("Author:  " + this.getAuthor());
		System.out.println("numPage: " + this.getTotPaginas());
		System.out.println("pagAt:   " + this.getPagAtual());
		System.out.println("Open:    " + this.isOpen());
		System.out.println("Leitor:  " + this.getLeitor());
		System.out.println();
	}

// Getter and Setter
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

// Abstracts Methods
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void folhear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avancarPagina() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voltarPagina() {
		// TODO Auto-generated method stub
		
	}
}
