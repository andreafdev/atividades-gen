package estruturasdados;

import java.util.Iterator;
import java.util.Stack;

public class ExemploPilhas {

	public static void main(String[] args) {
		
		//LIFO - Last In - First Out --- Ultiumo que entra, primeiro que sai.
		
		
		Stack<String> pilha = new Stack<String>(); 
		
		pilha.push("prato verde");
		pilha.push("prato azul");
		pilha.push("prato branco");
		pilha.push("prato vermelho");
		pilha.push("prato amarelo");
		
		System.out.println("\nElementos da pilha: "+ pilha);
		
		System.out.println("\nRetirar elementos da pilha: " + pilha.pop());
		 
		System.out.println("\nElementos no topo da pilha: " + pilha.peek());
		
		System.out.println("\nAdicionar elemento na pilha: " + pilha.push("prato roxo"));
		
		System.out.println("\nElementos da pilha: "+pilha);
		
		
		System.out.println("\nTamanhos da pilha: "+pilha.size());
		
		System.out.println("\nVer elementos específicos dentro da pilha: " + pilha.contains("prato verde"));
		
		
		
		System.out.println("\n");
		Iterator<String> iterator = pilha.iterator();
		
	 	while(iterator.hasNext()) {
	 		System.out.println(iterator.next());
	 	}
	 	
	 		
	 		pilha.clear();
	 		System.out.println("\nA pilha está vazia? " + pilha.isEmpty());
	 		
		
		
	 	}
		
	}


