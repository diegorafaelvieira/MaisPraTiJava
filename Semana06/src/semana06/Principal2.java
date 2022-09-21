package semana06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(5, 10, 20, 30, 30);
		
		//Stream<Integer> stream = lista.stream().distinct(); //remove elementos duplicados da lista
		//Stream<Integer> stream = lista.stream().filter(x -> x == 30); //filtra o que for igual a 30 
		//Stream<Integer> stream = lista.stream().limit(3); // retorna os 3 primeiros
		//Stream<Integer> stream = lista.stream().map(x -> x + 10); //retorna x + 10
		
		int y = lista.stream().filter(x -> x == 10).findFirst().get(); //pega lista filtra onde x=10 e pega o 1º resultado
		System.out.println(y);

		//stream.forEach(x -> System.out.println(x));
		//stream.forEach(System.out::println);
	}

}
