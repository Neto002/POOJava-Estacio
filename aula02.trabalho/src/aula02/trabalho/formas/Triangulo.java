package aula02.trabalho.formas;

import javax.swing.JOptionPane;

public class Triangulo extends Forma2D { //SubClasse de Forma2D
	
	Triangulo() {
		
	}
	
	//Sobreposi��o de M�todo
	@Override
	public void area() {
		double area = (this.getDimensao1() * this.getDimensao2()) / 2;
		JOptionPane.showMessageDialog(null, "�rea: " + area, "�REA DO TRI�NGULO - GRUPO 1", JOptionPane.PLAIN_MESSAGE);
	}

}
