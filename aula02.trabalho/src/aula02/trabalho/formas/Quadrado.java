package aula02.trabalho.formas;

import javax.swing.JOptionPane;

public class Quadrado extends Forma2D { //SubClasse de Forma2D
	
	Quadrado() {
		
	}
	
	//Sobreposi��o de M�todo
	@Override
	public void area() {
		double area = this.getDimensao1() * this.getDimensao2();
		JOptionPane.showMessageDialog(null, "�rea: " + area, "�REA DO QUADRADO - GRUPO 1", JOptionPane.PLAIN_MESSAGE);
	}

}
