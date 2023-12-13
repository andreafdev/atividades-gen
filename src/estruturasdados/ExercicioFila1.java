package estruturasdados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
import java.util.Scanner;

public class ExercicioFila1 {

	public static void main(String[] args) {
		Queue<String> nomes = new LinkedList<String>();
		int menu;
		Scanner leia = new Scanner(System.in);
		String nomeCliente;
		Iterator<String> iNomes = nomes.iterator();

		do {
			System.out.println("\n************************************************");
			System.out.println("                       MENU                     ");
			System.out.println("\nOpção 1 - Adicionar cliente a fila.");
		    System.out.println("Opção 2 - Listar todos Clientes");
		    System.out.println("Opção 3 - Chamar (retirar) uma pessoa da fila");
		    System.out.println("Opção 0 - Finalizar programa.");
		    System.out.println("\n ***********************************");
		   
		    System.out.print("Digite a opção desejada: ");
			menu = leia.nextInt();
			leia.nextLine();

			switch (menu) {

			case 1:
				System.out.println("Digite o nome: ");
				nomeCliente = leia.nextLine();
				nomes.add(nomeCliente);
				System.out.println("Fila: \n");
				for (String n : nomes) {
					System.out.println(n);
				}
				System.out.println("\nCliente adicionado!");
				break;

			case 2:
				System.out.println("Lista de clientes na fila: \n");
				for (String n : nomes) {
					System.out.println(n);
				}
				break;

			case 3:
				if (nomes.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					iNomes = nomes.iterator();
					iNomes.next();
					iNomes.remove();
					System.out.println("Fila:\n ");
					while(iNomes.hasNext()){
						System.out.println(iNomes.next());
					}
					System.out.println("\nO cliente foi chamado e retirado da fila! ");
				}			
				break;

			}

		} while (menu != 0);
		System.out.println("O programa foi finalizado");
		leia.close();
	}

}