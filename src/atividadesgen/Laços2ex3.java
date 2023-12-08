package atividadesgen;

import java.util.Scanner;

public class Laços2ex3 {
	
	 public static void main (String[] args) {
		 	Scanner leia = new Scanner (System.in);
		 	
		 	
		 int idade;
		 int menorque21 = 0;
		 int maiorque50 = 0;
		 
		 System.out.println("Digite a sua idade ou a leitura dos dados será finalizada ao digitar uma idade negativa");
		 
		 while (true) {
			 idade=leia.nextInt();
			 
			if (idade <0) {
				 System.out.println("A idade é negativa: "+idade);
		 }
		 
			if (idade<21) {
				menorque21++;
				//System.out.println("Pessoas com menos de 21 anos: "+menorque21);
				
			} else if (idade>50) {
				maiorque50++;
				//System.out.println("Pessoas com mais de 50 anos: "+maiorque50);
			}
			 System.out.println("Pessoas com menos de 21 anos: "+menorque21);
			 System.out.println("Pessoas com mais de 50 anos: "+maiorque50);
		 }
		 
	 }
}
