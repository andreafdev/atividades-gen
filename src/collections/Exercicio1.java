package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Exercício 1 
		
		ArrayList<String> coresArrayList = new ArrayList<>();
			Scanner leia = new Scanner (System.in);
			String cor; 
			String cores;
			
			
			 for (int i = 0; i < 5; i++) {
		            System.out.print("Digite a cor " + (i + 1) + ": " );
		            String cor1 = leia.nextLine();
		            coresArrayList.add(cor1);
		        }
	
			 
			System.out.println("\nListar todas as cores:" + coresArrayList);
		        
			List<String> listaCores = new ArrayList<>(coresArrayList); 
			Collections.sort(listaCores);  //sort faz a correção em ordem alfabética. 

			System.out.println("\nCores da lista ordenadas: ");
			for (String corOrdenada : listaCores) {
				System.out.println(corOrdenada);
			}
			 
		}


	}
		
			



