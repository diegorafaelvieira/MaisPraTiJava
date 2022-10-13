package incubacao;

public class Pessoa {
	
	//Propriedades
	private String nome;
	private String telefone;
	private String dataNasc;
	private String dataCad;
	private String dataAlt;
	
	
	//Construtor sem Data Alteração 
		public Pessoa(String nome, String telefone, String dataNasc, String dataCad) {
			this.nome = nome;
			this.telefone = telefone;
			this.dataNasc = dataNasc;
			this.dataCad = dataCad;
		}
	
	
	//Construtor 
	public Pessoa(String nome, String telefone, String dataNasc, String dataCad, String dataAlt) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.dataCad = dataCad;
		this.dataAlt = dataAlt;
	}

	//GET e SET
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getDataCad() {
		return dataCad;
	}


	public void setDataCad(String dataCad) {
		this.dataCad = dataCad;
	}


	public String getDataAlt() {
		return dataAlt;
	}


	public void setDataAlt(String dataAlt) {
		this.dataAlt = dataAlt;
	}
	
	
	
	public void exibir() {
		System.out.println(this);
	}

	
	
	
	
}
