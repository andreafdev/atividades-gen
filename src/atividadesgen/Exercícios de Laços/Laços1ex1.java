package atividadesgen;

import java.util.Scanner;

public class Laços1ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	
		Scanner leia = new Scanner(System.in);
		
		        int pares = 0;
		        int impares = 0;

		        for (int i = 1; i <= 10; i++) {
		            System.out.print("Digite o " + i + "º número: ");
		            int numero = leia.nextInt();

		            if (numero % 2 == 0) {
		                pares++;
		            } else {
		                impares++;
		            }
		        }
		        
		        
		        System.out.println("\nTotal de números pares: " + pares);
		        System.out.println("Total de números ímpares: " + impares);
		        System.out.println("Total da soma: "+pares+impares);

			}
		}
	
