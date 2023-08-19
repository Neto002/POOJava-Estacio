package trabalho_aula10;

import java.util.Scanner;

//Programa para simular inser��es de produtos em um vetor de 10 posi��es (0 a 9), com tratamento de exce��es para situa��es em que o �ndice informado n�o existe.

public class Principal {

	public static void main(String[] args) {

		Produto[] vetor = new Produto[10];
		Scanner scanner = new Scanner(System.in);
		int posicaoProduto = 0;
		
		for (int i = 0; i < 10; i++) {
			vetor[i] = new Produto();
		}
		
		//Coleta de dados para o produto
		
		System.out.println("Nome do produto: ");
		String nomeProduto = scanner.nextLine();
		
		System.out.println("Descri��o do produto: ");
		String descricaoProduto = scanner.nextLine();
		
		System.out.println("Pre�o do produto: ");
		float precoProduto = scanner.nextFloat();
		
		//Verifica��o do �ndice informado
		try {
			
			System.out.println("Posi��o do produto no vetor (0 a 9): ");
			posicaoProduto = scanner.nextInt();
			
			if (posicaoProduto < 0 || posicaoProduto > 9) {
				
				scanner.close();
				throw new ArrayIndexOutOfBoundsException();
				
			}
			
		} catch (ArrayIndexOutOfBoundsException e) { //Tratamento da exce��o
			
			System.out.println("Voc� digitou um valor inv�lido, por favor digite um valor de 0 a 9:");
			posicaoProduto = scanner.nextInt();
			
			while (posicaoProduto < 0 || posicaoProduto > 9) {
				
				System.out.println("Voc� digitou um valor inv�lido, por favor digite um valor de 0 a 9:");
				posicaoProduto = scanner.nextInt();
				
			}
			
		} finally { //Atribui��o dos valores informados ao produto
			
			vetor[posicaoProduto].setNome(nomeProduto);
			vetor[posicaoProduto].setDescricao(descricaoProduto);
			vetor[posicaoProduto].setPreco(precoProduto);
			
		}
		
		try {
			
			System.out.println("Posi��o do vetor que deseja visualizar: ");
			posicaoProduto = scanner.nextInt();
			
			
			if (posicaoProduto < 0 || posicaoProduto > 9) {
				
				scanner.close();
				throw new ArrayIndexOutOfBoundsException();
				
			}
			
		} catch (ArrayIndexOutOfBoundsException e) { //Tratamento da exce��o
			
			System.out.println("Voc� digitou um valor inv�lido, por favor digite um valor de 0 a 9:");
			posicaoProduto = scanner.nextInt();
			
			while (posicaoProduto < 0 || posicaoProduto > 9) {
				
				System.out.println("Voc� digitou um valor inv�lido, por favor digite um valor de 0 a 9:");
				posicaoProduto = scanner.nextInt();
				
			}
			
		} finally { //Exibi��o dos dados do produto selecionado
			
			System.out.println("Nome: " + vetor[posicaoProduto].getNome() + "\nDescri��o: " + vetor[posicaoProduto].getDescricao() + "\nPre�o: " + 
		    String.format("R$%.2f", vetor[posicaoProduto].getPreco()));
			
		}
		
		scanner.close();
		
	}
}
