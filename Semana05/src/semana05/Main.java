package semana05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//ArrayList<String> alunos = new ArrayList<>(); // métodos para buscar dados são mais rápidos é o + usado
		//LinkedList<String> alunos = new LinkedList<>(); // métodos add e remover são melhores
		List<String> alunos = new ArrayList<>();
		
		String aluno1 = "José da Silva";
		String aluno2 = "Maria Clara";
		String aluno3 = "João Roberto";
		String aluno4 = "Ana Lima";
		
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		
		
		System.out.println(alunos.isEmpty()); // verifica se a lista esta vazia
	    alunos.remove(2); // remove o aluno na posição 2
	    alunos.remove(aluno4); //remove o aluno na posição 4 
	    
		System.out.println(alunos.size()); // exibe o tamanho da lista
		System.out.println(alunos);
		System.out.println(alunos.get(1)); // pega posição

	}

}
