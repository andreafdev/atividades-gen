package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class exemplosList1 {

	public static void main(String[] args) {
		//Uso de List
		
		Scanner leia = new Scanner(System.in); 
		String nome = "Gabriele";
		
		String nome2;
		System.out.println("Digite um nome: ");
		nome2 = leia.nextLine();
		
		
		ArrayList<String> nomes = new ArrayList <String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Double> valor = new ArrayList<Double>();
		ArrayList<Long> codigo = new ArrayList<Long>();
		
		
		nomes.add("Andrea");
		nomes.add("Jacqueline");
		nomes.add("Liza");
		nomes.add("Aline");
		nomes.add("Yury");
		
		
		System.out.println(nomes);
		
		System.out.println(nomes.indexOf("Nath"));	 //IndexOf diz a posição encontrada na lista
		
		System.out.println(nomes.contains("Liza")); //Contains: "true" se existir o elemento na lista, e "false" não encontrado la lista.
		
		System.out.println(nomes.get(0));  //Get: encontra o nome na lista conforme o indice pedido.(apenas um)
			
		nomes.set(2, "Carlos"); //Trocar a informação (ex: trocar o nome de alguem da lista)
		System.out.println(nomes);
		
		
		System.out.println(nomes.isEmpty());   //Retorna se é verdadeiro ou não se a List está vazia
		
		System.out.println(codigo.isEmpty());   //
		//nomes.clear();  // Limpa toda a lista
		
		System.out.println(nomes);
		
		nomes.remove(3); //Limpa um dado especifico da lista
		System.out.println(nomes);
		
		
		 // Nova lista com nome novo inserido
		nomes.add(nome2);
		for (String n : nomes) {
			System.out.println("Estamos vendo agora o nome: " + n);
			
			for (int contador = 1; contador <3; contador++) {
				System.out.println("Digite outro nome: ");
				nome2 = leia.nextLine();
				nomes.add(nome2);
			}
		}
//		nomes.add("Theo");
//		nomes.add("Andressa");
//		nomes.add("Luiza");
//		nomes.add("Aline");
//		nomes.add("Yury");
		
		
		
		//Iterator <String> iNomes = nomes.iterator(); 
		
			//while (iNomes.hasNext()) {
				//System.out.println(iNomes.next());
				
				//System.out.println(numero++); //numero1
				
				
				
				
			}
		}
	