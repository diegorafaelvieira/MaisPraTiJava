package semana01;

import java.util.Scanner;

public class Aula06_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double peso = 0;
		double altura = 0;
		int teste = 1;
		
		
		while(teste == 1) {
			System.out.println("Calcular novo IMC? (1=sim, 0=não)");
			teste = entrada.nextInt();
			if (teste == 1) {
				System.out.println("Entre com o peso em kg:");
				peso = entrada.nextDouble();
				System.out.println("Entre com a altura em metros:");
				altura = entrada.nextDouble();
				
				
				double imc = peso / (altura * altura);
				System.out.println("O IMC é: "+imc);
				
				String classificacao = "";
				
				if(imc < 18.5) classificacao = "Magreza";
				else if(imc < 24.9) classificacao = "Normal";
				else if(imc < 29.9) classificacao = "Sobrepeso";
				else if(imc < 39.9) classificacao = "Obsidade";
				else classificacao = "Obesidade Grave";
				System.out.println("A classificação é: " + classificacao);
			}		
		}

	}

}
