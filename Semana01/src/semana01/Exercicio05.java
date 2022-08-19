package semana01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		int maior = 0;
		int menor = 0;
		int i = 0;

		Scanner entrada = new Scanner(System.in);

		while (i < 10) {

			System.out.println("Informe o " + (i + 1) + " valor:");
			int valor = entrada.nextInt();

			if (menor > valor) {
				menor = valor;
			}
			if (maior < valor) {
				maior = valor;
			}

			i++;

		}

		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);

	}

}
