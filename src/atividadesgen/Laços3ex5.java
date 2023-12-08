package atividadesgen;

import java.util.Scanner;

public class Laços3ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia= new Scanner(System.in);
		
		int numero;
		int total = 0;
		
		System.out.println("Digite um valor para somar, ou digite 0 para finalizar o programa.");
		
		while (true) {
            numero = leia.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo detectado. Não será somado.");
            } else {
                total += numero;
            }

            if (numero == 0) {
                System.out.println("Total: " + total);
                System.out.println("Programa encerrado!");
                break;
            } else {
                System.out.println("Digite outro valor (ou '0' para encerrar):");
            }
      
		}
	}

}
