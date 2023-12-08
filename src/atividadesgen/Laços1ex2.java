package atividadesgen;

import java.util.Scanner;

public class Laços1ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
			
			int numero1;
			int numero2;
			
			System.out.println("Digite o primeiro número do intervalo: "); 
				numero1 = leia.nextInt();
			
				System.out.println("Digite o segundo número do intervalo: "); 
				numero2 = leia.nextInt();
				
				if (numero1<numero2) { 
						for (int i = numero1; i < numero2; i++) {
							if (i%3==0 && i%5==0) {
								System.out.println(i + " é múltiplo de 3 e 5.");
							}
							
						}
						
					} else {
						System.out.println("Intervalo inválido.");
					}
			
	}

}
