package Estantes;

import java.util.ArrayList;


public class Biblioteca {
	private ArrayList<Livro> estante = new ArrayList<>();
	

	public ArrayList<Livro> getEstante() {
		return estante;
	}

	public void setEstante(ArrayList<Livro> estante) {
		this.estante = estante;
	}

	public void cadastrarLivros(Livro liv) {
		estante.add(liv);
		System.out.println("Livro cadastrado com sucesso!");
	}
	
	public void infoAllbooks() {
		for(Livro l: estante) {
			l.info();
			System.out.println();
		}
	}

	public Livro buscar_livro(String titulo) {
		for(Livro l : estante) {
			if(l.getTitulo().equals(titulo)) {
				System.out.println("livro Encontrado");
				l.info();
				System.out.println();
				return l;
			}
		}
		System.out.println("Livro não encontrado...");
		return null;	
		
	}
	
}
