package semana06;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> { //generics

	private List<T> banco; 
	
	public Repository() {
		banco = new ArrayList<>();
	}
	
	public void salvar(T t) {
		banco.add(t);
	}
	
	public List<T> buscarTodos() {
		return banco;
	}
	
	public T buscar(T t) { //Stream
		return banco.stream().filter(elemento -> elemento == t).findFirst().orElse(null);
	}
	
	public void remover(T t) {
		banco.remove(t);
	}
}
