//Aluno: Antonio Gomes Ferreira Neto
//Matr�cula: 202102570735

package aula09;

public class Produto {
	
	private String nome;
	private String descricao;
	private double preco;
	
	Produto() {
		
	}
	
	Produto(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nDescri��o: " + this.descricao + "\nPre�o: " + String.format("R$%.2f", this.preco);
	}
	
}
