package semana04;

import java.util.Random;

public class Pecas {

	private int x;
	private int y;
	
	private boolean vivo;
	
	public boolean isVivo() {
		return vivo;
	}
	
	public Pecas() {
		Random aleatorio = new Random();
		this.x = aleatorio.nextInt(10);
		this.y = aleatorio.nextInt(10);
		this.vivo = true;
	}
	
	public double disparo(int x, int y) {
		double distancia = Math.sqrt( (x-this.x) * (x-this.x) + (y-this.y) * (y-this.y) );
		if(distancia == 0) this.vivo = false;
		return distancia;
	}
	
}
