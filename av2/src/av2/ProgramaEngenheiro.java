package av2;

public class ProgramaEngenheiro {

	public static void main(String[] args) {
		Engenheiro eg = new Engenheiro(202102570735L, "Antonio Gomes Ferreira Neto", "Engenheiro Civil");
		System.out.println("Nome: " + eg.nome + "\nMatr�cula: " + eg.matricula + "\nTitula��o: " + eg.titulacao);
	}

}
