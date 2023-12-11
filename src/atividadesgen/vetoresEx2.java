package atividadesgen;

import java.util.Scanner;

public class vetoresEx2 {

	public static void main(String[] args) {
				
		
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int num; 
		boolean encontrado = false;
		
			Scanner leia = new Scanner (System.in);
			
			
			System.out.println("Digite o número que você deseja encontrar: ");
			num = leia.nextInt();
			
			while (encontrado == false) {
				

				for(int indice = 0; indice < 10; indice++) {
					
					if (vetorInteiros [indice] == num) { 
						encontrado = true;
						System.out.println("O número "+ num + " está na posição: "+ indice);
					} 
			}
				if (encontrado == false) {
				System.out.println("O número não foi encontrado.");
				System.exit(0); 
				
				//break;
			}
			
			
		}
		
		

	}

}
