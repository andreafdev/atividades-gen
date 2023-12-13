package estruturasdados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class ExemploQueue1 {


	public static void main(String[] args) {
		
		// Queue é a unica que pode se misturar com outras collections. 
		// FIFO:  First in and First Out - primeiro que entra - primeiro que sai.
		
		
		Queue <Integer> fila = new LinkedList<Integer>();
		
		for (int indice =0; indice <10; indice++) {
			fila.add(indice);
		}
			System.out.println("\nElementos da fila" + fila);
			
			System.out.println("\nRemover da fila" + fila.remove());
			System.out.println("\nElementos da fila" + fila); //depois do remove.
			
			
			System.out.println("\nAdicionar elementos na fila " + fila.add(10));
			System.out.println("\nElementos da fila" + fila); //depois de add o 10.
			
			
			System.out.println("\nExibir o primeiro item da fila é: " + fila.peek()); 
			
			System.out.println("\nExibir o tamanho da fila: " + fila.size());
			
			System.out.println("\nExibir um elemento específico da fila  " + fila.contains(12));
			
			System.out.println("\nExibir e retirar o primeiro item da fila (HEAD): "+ fila.poll());
			System.out.println("Elementos atual " +fila);
			
			
			System.out.println("\nExibir os itens com interator");
			
				Iterator <Integer> iterator = fila.iterator();
			 	while(iterator.hasNext()) {
			 		System.out.println(iterator.next());
			 		
			 	}
			 	
			 	System.out.println("\nLimpar a fila ");
			 	fila.clear();
			 	
			 	System.out.println("\nA fila está vazia?" + fila.isEmpty());
			 	
			 	System.out.println("\nA Fila atualizada " + fila);
			 	
			 	
			 	//LIFO - Last In - First Out --- Ultiumo que entra, primeiro que sai.
			 	
			 	
			 	
			 	
			 	
			 	
		}	
			
	}

