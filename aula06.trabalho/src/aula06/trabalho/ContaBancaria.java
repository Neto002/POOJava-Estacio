/*
 * Aluno: Antonio Gomes Ferreira Neto
 * Matr�cula: 202102570735
 */
package aula06.trabalho;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class ContaBancaria {
	//Atributos
	private double saldo;
	private final Date dataAbertura;
	
	//Construtor
	ContaBancaria() {
		this.saldo = 0.00;
		this.dataAbertura = new Date(System.currentTimeMillis());
	}
	
	//M�todo para dep�sitos
	public void depositar(double deposito) {
		this.setSaldo(this.getSaldo() + deposito);
		System.out.println("Saldo ap�s dep�sito: " + this.getSaldoFormatado());
	}
	
	//M�todo para saques
	public void sacar(double saque) {
		while (true) {
			if (saque > this.getSaldo()) {
				Scanner teclado = new Scanner(System.in);
				System.out.println("N�o � poss�vel sacar o valor desejado pois n�o h� saldo suficiente para a opera��o. Saldo dispon�vel: " + 
									this.getSaldoFormatado());
				System.out.println("Por favor, digite um valor v�lido: ");
				saque = teclado.nextDouble();
			} else {
				this.setSaldo(this.getSaldo() - saque);
				System.out.println("Saque efetivado com sucesso. Saldo dispon�vel: " + this.getSaldoFormatado());
				break;
			}
		}
	}
	
	//Getters e Setters
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public Date getDataAbertura() {
		return this.dataAbertura;
	}
	
	//M�todo de Retorno do Saldo formatado
	public String getSaldoFormatado() {
		String saldoFormatado = new DecimalFormat("R$ #,##0.00").format(this.getSaldo());
		return saldoFormatado;
	}
	
	//M�todo de Retorno da Data de Abertura formatada
	public String getDataAberturaFormatada() {
		SimpleDateFormat dataAberturaFormatada = new SimpleDateFormat("dd/MM/yyyy");
		//return DateFormat.getDateInstance(DateFormat.SHORT).format(dataAbertura); ou
		return dataAberturaFormatada.format(this.dataAbertura);
	}
	
}
