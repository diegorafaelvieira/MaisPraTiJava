package semana01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int codigo = 1;
		double nota = 0;
		double total = 0;
		int i = 0;
		
		System.out.println("Código do aluno");
		codigo = entrada.nextInt();
		
		if(codigo != 0) {
			while(i < 3) {
				System.out.println("Informe a "+ (i+1) + " nota: ");
				nota = entrada.nextDouble();
				total += nota;
				i++;
			}
			
			double media = total / 3;
			System.out.println("A média do aluno é: " + media);
		}
		
		
	}

}
