package semana01;

import java.util.Scanner;

public class Aula06_2 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
			
			double peso = 0;
			double altura = 0;
			String teste = "s";
			
			
			while(teste.equals("s")) {
				System.out.println("Calcular novo IMC? (s/n)");
				teste = entrada.nextLine();
				
				if (teste.equals("s")) {
					System.out.println("Entre com o peso em kg:");
					peso = entrada.nextDouble();
					entrada.nextLine();
					System.out.println("Entre com a altura em metros:");
					altura = entrada.nextDouble();
					entrada.nextLine();
					
					
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
