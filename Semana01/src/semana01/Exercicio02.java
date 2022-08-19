package semana01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int macas = 0;
		float total = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informa a quantidade de maçãs: ");
		macas = entrada.nextInt();
		
		if(macas < 12) {
			total = macas * 0.30f;
		} else {
			total = macas * 0.25f;
		}
		
		
		System.out.println("Foram compradas "+macas+" maças e e custou R$"+total+".");

	}

}
