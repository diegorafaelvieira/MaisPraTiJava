package semana05;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {

	public static void main(String[] args) {
		
		//HashSet<String> alunos = new HashSet<>(); // não ordena / não permite inserir nomes duplicados
		//TreeSet<String> alunos = new TreeSet<>(); // ordena em ordem alfabética // não aceita objetos nulos
		Set<String> alunos = new HashSet<>();
		
		String aluno1 = "José da Silva";
		String aluno2 = "Maria Clara";
		String aluno3 = "João Oliveira";
		String aluno4 = "Ana da Silva";
		//String aluno5 = "Ana da Silva";
		String aluno5 = "Bruno Costa";
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		//alunos.add(aluno5); // HashSet não permite inserir nomes duplicados
		alunos.add(aluno5);
		//alunos.add(null); // TreeSet não aceita objetos nulos
		alunos.remove(aluno5); // remove o aluno5 
		alunos.remove("Ana da Silva"); // remove o aluno4 
		
		System.out.println(alunos.size()); // exibe o tamanho da lista
		
		alunos.clear(); //limpa a lista
		
		System.out.println(alunos);

	}

}
