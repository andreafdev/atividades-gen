package atividadesgen;

public class matrizEx3 {

	public static void main(String[] args) {
		int matrizInteiros[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int somaPrincipal = 0;
		int somaSecundaria = 0;
			
		System.out.println("Elementos da Diagonal Principal: \n"); 
				for (int linha = 0; linha < 3; linha++) {
					for (int coluna = 0; coluna < 3; coluna++) {
						if (linha==coluna) {
							System.out.print(matrizInteiros [linha][coluna]);
							somaPrincipal += matrizInteiros [linha][coluna];
							
					}
            	}
            }
		
			System.out.println("\nElementos da Diagonal Secundária: \n"); 
				for (int linha = 0; linha < 3; linha++) {
					for (int coluna = 0; coluna < 3; coluna++) {
						if (linha+coluna==2) {
							System.out.print(matrizInteiros [linha][coluna]);
							somaSecundaria += matrizInteiros [linha][coluna];
						}
					}
				}
				
				System.out.println("\nSoma dos Elementos da Diagonal Principal:"+ somaPrincipal);
				System.out.println("Soma dos Elementos da Diagonal Secundária:"+ somaSecundaria);
	}

}
