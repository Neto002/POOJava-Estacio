package aula02.trabalho.formas;

import javax.swing.JOptionPane;

public class Main { //Classe Instanciadora

	public static void main(String[] args) {
		
		//Inst�ncias
		Forma2D forma = new Forma2D();
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo();
		
		//Input dos valores das dimens�es
		double d1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Primeira dimens�o:"));
		double d2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Segunda dimens�o:"));
		
		//Atribui��o dos valores das dimens�es
		forma.setDimensao1(d1);
		forma.setDimensao2(d2);
		
		quadrado.setDimensao1(d1);
		quadrado.setDimensao2(d2);
		
		triangulo.setDimensao1(d1);
		triangulo.setDimensao2(d2);
		
		//Exibi��o dos dados
		forma.mostraDados();
		quadrado.area();
		triangulo.area();
		
	}

}
