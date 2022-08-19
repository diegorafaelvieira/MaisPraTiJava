package semana02;

public class Imc_OO {

	public static void main(String[] args) {
		
		/*
		double peso = 80;
		double altura = 1.80;
		
		double imc = (peso / (altura*altura));
		System.out.println("O IMC é: " + imc);
		*/
		
		Imc imc1 = new Imc(80, 1.80);
		//imc1.calculaImc();
		//System.out.println("O IMC é: " + imc1.imc);
		System.out.println("A classificação é "+imc1.classificacao());
		
		ImcNovo imc2 = new ImcNovo(80, 1.80);
		System.out.println("A classificação é "+imc2.classificacao());
		
		ImcLeitura imc3 = new ImcLeitura();
		imc3.lerPeso();
		imc3.lerAltura();
		System.out.println("A classificação é "+imc3.classificacao());
	}

}
