package aula02;

import javax.swing.JOptionPane;

public class Aula {

	public static void main(String[] args) {

		Tecnico tecnico = new Tecnico();
		
		tecnico.setMatricula(Long.parseLong(JOptionPane.showInputDialog(null, "Digite a matr�cula: ", "Informe os dados: ", JOptionPane.INFORMATION_MESSAGE)));
		tecnico.setNome(JOptionPane.showInputDialog(null, "Digite o nome: ", "Informe os dados: ", JOptionPane.INFORMATION_MESSAGE));
		tecnico.setTitulo(JOptionPane.showInputDialog(null, "Digite o titulo: ", "Informe os dados: ", JOptionPane.INFORMATION_MESSAGE));
		
		mostraTecnico(tecnico.getMatricula(), tecnico.getNome(), tecnico.getTitulo());
		
	}
	
	public static void mostraTecnico(Long m, String n, String t) {
		JOptionPane.showMessageDialog(null, "Matr�cula: " + m +
				"\nNome: " + n +
				"\nT�tulo: " + t, "DADOS DO T�CNICO", JOptionPane.INFORMATION_MESSAGE, null);
	}

}
