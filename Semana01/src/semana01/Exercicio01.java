package semana01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int v1 = 0;
		int v2 = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Valor 1: ");
		v1 = entrada.nextInt();
		System.out.println("Valor 2: ");
		v2 = entrada.nextInt();
		
		if(v1 > v2) {
			System.out.println("Valor 1 é maior");		
		} else if (v1 < v2) {
			System.out.println("Valor 2 é maior");
		} else {
			System.out.println("Valor 1 e 2 são iguais");
		}
		
		

	}

}
