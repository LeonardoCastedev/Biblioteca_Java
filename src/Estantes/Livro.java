package Estantes;

public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private boolean disponivel;
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	Livro(String titulo, String autor, int ano, boolean disponivel){
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.disponivel = disponivel;
	}
	
	
	public void info() {
		System.out.println("Titulo: " + getTitulo()); 
		System.out.println("Autor: " + getAutor());  
		System.out.println("Ano: " + getAno());  
		System.out.println("Disponibilidade: "+ (isDisponivel() ? "Sim" : "Não"));
	}
	
	void emprestar() {
		if(disponivel) {
			this.disponivel = false;
			System.out.println("Livro emprestado..");
			System.out.println();
		}else {
			System.out.println("Este Livro não esta disponivel.");
			System.out.println();
		}
	}
	
	public void devolver() {
		if(disponivel == false) {
			this.disponivel = true;
			System.out.println("Livro devolvido..");
			System.out.println();
		}
	}
}
