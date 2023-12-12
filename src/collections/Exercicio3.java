package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Set<Integer> integerSet = new HashSet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 valores inteiros não repetidos:");

        for (int i = 0; i < 10; i++) {
            try {
                System.out.print("Digite o valor " + (i + 1) + ": ");
                int valor = Integer.parseInt(scanner.nextLine());
                
                if (integerSet.contains(valor)) {
                    System.out.println("Valor repetido. Digite novamente.");
                    i--;
                } else {
                    integerSet.add(valor);
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um valor inteiro válido. Tente novamente.");
                i--;
            }
        }

        System.out.println("\nElementos na Collection Set:");

        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

	}

}
