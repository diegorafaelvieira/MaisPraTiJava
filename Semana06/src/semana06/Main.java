package semana06;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Maria");
		nomes.add("Ana");
		nomes.add("José");
		nomes.add("João");
		
		System.out.println(nomes);
		
		

		nomes.forEach(nome -> System.out.println(nome));
		//nomes.removeIf(nome -> compara(nome, "Ana"));
		nomes.removeIf(nome -> nome.equals("Ana"));
		nomes.removeIf(nome -> nome.startsWith("J"));
		
		
		System.out.println(nomes);
		
		
		}
	
		public static boolean compara(String nome, String param) {
			return nome.equals(param);

	}

}
