package collections;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// 
			Scanner leia = new Scanner(System.in);
			
			int numbers[]= {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
			int number;
			boolean notfound = false;
			
			System.out.println("Digite o número que você deseja encontrar: ");
			number = leia.nextInt();
			for (int i= 0; i <numbers.length; i++) {
				if (numbers [i]==number) {
					System.out.println("O número está localizado na posição: " + i);
					notfound = true; 
					break; 
				} 
			}
			
			
			if (!notfound) {
				System.out.println("Número não encontrado.");
			}
			
	}

}
