package semana06;

public class Pratica {

	public static void main(String[] args) {
		
		Repository<Professor> profRepository = new Repository<>();
		Repository<Aluno> alunoRepository = new Repository<>();
		
		Professor professor = new Professor("João", "Geografia");
		
		profRepository.salvar(new Professor("José", "Matemática"));
		profRepository.salvar(new Professor("Maria", "História"));
		profRepository.salvar(professor);
		
		System.out.println(profRepository.buscarTodos());
		System.out.println(profRepository.buscar(professor));
		
		profRepository.remover(professor);
		
		System.out.println(profRepository.buscarTodos());
	
		
		Aluno aluno = new Aluno("Fátima", 12345);
		Aluno aluno2 = new Aluno("Cláudio", 1234567);
		
		alunoRepository.salvar(aluno);
		alunoRepository.salvar(aluno2);
		
		System.out.println(alunoRepository.buscarTodos());
		
		alunoRepository.remover(aluno2);
		System.out.println(alunoRepository.buscarTodos());
		
		

	}

}
