package semana03;

public class Desafio1 {

	public static void main(String[] args) {
		
		/*
		Objetos2[] arrayObjetos = new Objetos2[4];
		arrayObjetos[0] = new Objetos2(10, 20);
		arrayObjetos[1] = new Objetos2(30, 40);
		arrayObjetos[2] = new Objetos2(50, 60);
		arrayObjetos[3] = new Objetos2(100, 200);
		
		
		for(Objetos2 elemento: arrayObjetos) {
			elemento.exibir();
		}
		*/
		
		Objetos2[] arrayObjetos = new Objetos2[4];
		arrayObjetos[0] = new ObjetosTriangulares(10, 20, 100);
		arrayObjetos[1] = new Objetos2(30, 40);
		arrayObjetos[2] = new Objetos2(50, 60);
		arrayObjetos[3] = new ObjetosTriangulares(100, 200, 103);
	
		
		for(Objetos2 elemento: arrayObjetos) {
			elemento.exibir();
		}

	}

}
