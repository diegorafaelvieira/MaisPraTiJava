package semana03;

public class Main2 {

	public static void main(String[] args) {
		
		int[] arrayInteiros = {10,20,30,40,50};
		
		for(int i = 0; i < arrayInteiros.length; i++) {
			System.out.println(arrayInteiros[i]);
		}
		
		System.out.println("-----------------------");
		
		for(int elemento: arrayInteiros) {
			System.out.println(elemento);
		}
		
		
		
		
	}

}
