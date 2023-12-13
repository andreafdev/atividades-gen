package estruturasdados;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			Stack<String> pilhaLivros = new Stack<>();

			int menu;
			do {
			    System.out.println("\n **********************************");
			    System.out.println("\n              MENU ");
			    System.out.println("\nOpção 1 - Adicionar livro na pilha");
			    System.out.println("Opção 2 - Listar todos os livros");
			    System.out.println("Opção 3 - Retirar um livro da pilha");
			    System.out.println("Opção 0 - Encerrar programa.");
			    System.out.println("\n ***********************************");
			   
			    System.out.print("Digite a opção desejada: ");
			    menu = leia.nextInt();
			    leia.nextLine();

			    switch (menu) {
			        case 1:
			            System.out.print("Digite o nome do livro a ser adicionado: ");
			            String nomeLivro = leia.nextLine();
			            pilhaLivros.push(nomeLivro);
			            System.out.println("Livro Adicionado!");
			            break;
			        case 2:
			            System.out.println("Lista de livros adicionados na pilha: ");
			            for (String livro : pilhaLivros) {
			                System.out.println(livro);
			            }
			            break;
			        case 3:
			            if (!pilhaLivros.isEmpty()) {
			                String livroRetirado = pilhaLivros.pop();
			                System.out.println("Um livro foi retirado!");
			            } else {
			                System.out.println("A pilha está vazia!");
			            }
			            break;
			        case 0:
			            System.out.println("O programa foi encerrado!");
			            break;
			        default:
			            System.out.println("\nOpção não encontrada. Por favor, digite alguma das opções existentes!");
			            break;
			    }
			} while (menu != 0);
		}
	}

}