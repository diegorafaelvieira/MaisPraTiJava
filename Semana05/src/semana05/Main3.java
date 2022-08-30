package semana05;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main3 {

	public static void main(String[] args) {
		
		//HashMap<Integer, String> alunos = new HashMap<>(); // não garante ordenação
		//TreeMap<Integer, String> alunos = new TreeMap<>(); // garante ordenação
		Map<Integer, String> alunos = new TreeMap<>(); 
		
		
		String aluno1 = "José da Silva";
		String aluno2 = "Maria Rodrigues";
		String aluno3 = "João Mello";
		String aluno4 = "Rodrigo Lopes";
		
		alunos.put(04, aluno1);
		alunos.put(03, aluno2);
		alunos.put(02, aluno3);
		alunos.put(01, aluno4);
		
		System.out.println(alunos);
		System.out.println(alunos.get(3));
		
		
		alunos.remove(02);
		System.out.println(alunos);
		

	}

}
