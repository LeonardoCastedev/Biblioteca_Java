package Estantes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int escolha;
		Scanner teclado = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		System.out.println("Biblioteca Digital");
		System.out.println();
		
		while(true) {
			System.out.println("1 - Adicionar Livro");
			System.out.println("2 - Ver Livros Disponiveis");
			System.out.println("3 - Emprestimo");
			System.out.println("4 - Devolver");
			System.out.println("5 - Fechar");
			
			escolha = teclado.nextInt();
			teclado.nextLine();
			
			switch (escolha){
				case 1:
					System.out.println("Digite o titulo do livro: ");
					String titulo_main = teclado.nextLine();
			
					System.out.println("Digite o autor do livro: ");
					String autor_main = teclado.nextLine();
					
					System.out.println("Digite o ano do livro");
					int ano_main = teclado.nextInt();
					
					Livro livro_to_estante = new Livro(titulo_main, autor_main, ano_main, true);
					biblioteca.cadastrarLivros(livro_to_estante);
					break;
					
				case 2:
					biblioteca.infoAllbooks();
					break;
				case 3:
					System.out.println("Digite o titulo do livro para o emprestimo:");
					titulo_main = teclado.nextLine();
					
					Livro livroEncontrar = biblioteca.buscar_livro(titulo_main);
					if(livroEncontrar == null) {
						break;
					}
					
					livroEncontrar.emprestar();
					break;
				case 4:
					System.out.println("Digite o titulo do livro para devolver:");
					titulo_main = teclado.nextLine();
					
					livroEncontrar = biblioteca.buscar_livro(titulo_main);
					if(livroEncontrar == null) {
						break;
					}
					
					livroEncontrar.devolver();
					break;
				case 5:
					System.out.println("encerrando..");
					teclado.close();
					return;
					
				default:
					System.out.println("Valor Invalido..");
					break;
			}
		}
	}
}
