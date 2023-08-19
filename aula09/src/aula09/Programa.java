//Aluno: Antonio Gomes Ferreira Neto
//Matr�cula: 202102570735

package aula09;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Produto[] produtos = new Produto[10];
				
		for (int i = 0; i < 10; i++) {
			
			produtos[i] = new Produto();
			
		}
		
		for (int i = 0; i < 10; i++) {
			
			try {
				
				System.out.print("Digite o �ndice no qual voc� deseja adicionar o produto: ");
				int posicao = scanner.nextInt();

				System.out.print("\nDigite um nome para o produto: ");
				produtos[posicao].setNome(scanner.next());
				
				System.out.print("\nDigite uma descri��o para o produto: ");
				produtos[posicao].setDescricao(scanner.next());
				
				System.out.print("\nDigite um pre�o para o produto: ");
				produtos[posicao].setPreco(scanner.nextDouble());
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println("\n�ndice especificado n�o existe no vetor, favor digitar um valor entre 0 e 9.");
				
			}
			
		}
		
		
		
		try {
			
			System.out.print("Digite um produto para visualizar a partir do �ndice: ");
			int posicao = scanner.nextInt();
			
			System.out.println(produtos[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("\n�ndice especificado n�o existe no vetor, favor digitar um valor entre 0 e 9.");
			
		}
		
		scanner.close();
		
	}

}
