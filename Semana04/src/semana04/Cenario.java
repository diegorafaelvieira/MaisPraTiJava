package semana04;

public class Cenario {
	
	int[][] mapa;

	public Cenario() {
		this.mapa = new int[10][10];
		this.desenhaLinha(this.mapa[0]);
	}
	
	
	public void desenhaLinha(int[] linha) {
		
		String strLinha="";
		for(int celula: linha) {
			strLinha += celula;
		}
		
		System.out.println(strLinha);
	}
	
	public void desenhaCenario() {
		
		for(int[] linha: this.mapa) {
			this.desenhaLinha(linha);
		}
	}
	
	

}
