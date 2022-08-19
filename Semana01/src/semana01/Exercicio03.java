package semana01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double salBruto = 0;
		double salLiquido = 0;
		
		
		System.out.println("Salário Bruto R$");
		salBruto = entrada.nextDouble();
		
		if(salBruto < 1100) {
			salLiquido = salBruto - (0.06 * salBruto);
		} else if (salBruto <= 2500) {
			salLiquido = salBruto - (0.08 * salBruto);
		} else if (salBruto <= 4800) {
			salLiquido = salBruto - (0.10 * salBruto);
		} else {
			salLiquido = salBruto - (0.15 * salBruto);
		}
		
		System.out.println("O salário líquido é de R$"+salLiquido);

	}

}
