package semana02;

public class Imc {
	
	private double peso;
	private double altura;
	protected double imc;
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public Imc(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public void calculaImc() {
		this.imc = (this.peso/(this.altura * this.altura));
	}
	
	public String classificacao() {
		this.calculaImc();
		
		if(this.imc < 18.5) return "magreza";
		if(this.imc < 24.9) return "normal";
		if(this.imc < 29.9) return "sobrepeso";
		if(this.imc < 39.9) return "obesidade";
		return "obesidade grave";
	}

}
