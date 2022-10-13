package incubacao;

public class Aluno extends Pessoa {

	//Propriedades
	private double notaFinal;
	
	
	//Construtor sem Data Alteração 
	public Aluno(String nome, String telefone, String dataNasc, String dataCad, double notaFinal) {
		super(nome, telefone, dataNasc, dataCad);
		this.notaFinal = notaFinal;
	}
	
	//Construtor
	public Aluno(String nome, String telefone, String dataNasc, String dataCad, String dataAlt, double notaFinal) {
		super(nome, telefone, dataNasc, dataCad, dataAlt);
		this.notaFinal = notaFinal;
	}

	//GET e SET
	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	
	
	

}
