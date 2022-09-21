package semana06;

public class Impressora {
	
	public static <T extends Animal> T imprimi(T t) {
		System.out.println(t);
		return t;
	}

}
