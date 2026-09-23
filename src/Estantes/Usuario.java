package Estantes;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private int idade;
	private int iD;
	private ArrayList<Livro> meus_livros = new ArrayList();

	public Usuario(String nome, int idade, int iD, ArrayList<Livro> meus_livros) {
		this.nome = nome;
		this.idade = idade;
		this.iD = iD;
	}
	
	public void requisitarLivro(Livro livro, Biblioteca biblioteca) {
		if(biblioteca.getEstante().contains(livro)){
			biblioteca.getEstante().remove(livro);
			this.meus_livros.add(livro);
		}else {
			System.out.println("Livro indisponivel.");
		}
	}
	
	public void info() {
		System.out.println("Titulo: " + getNome()); 
		System.out.println("Autor: " + getIdade());  
		System.out.println("Ano: " + getID());
		if(getMeus_livros().isEmpty()) {
			System.out.println("Voce não possui livros");
		}else {
			for(Livro l : getMeus_livros()) {
				l.info();
				System.out.println();
			}
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getID() {
		return iD;
	}
	
	public void setID(int id ) {
		this.iD = id;
	}

	public ArrayList<Livro> getMeus_livros() {
		return meus_livros;
	}

	public void setMeus_livros(ArrayList<Livro> meus_livros) {
		this.meus_livros = meus_livros;
	}

}	