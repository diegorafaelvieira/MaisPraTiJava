package semana03;

public class ObjetosTriangulares extends Objetos2 {
	
	public int v3;

	public ObjetosTriangulares(int v1, int v2, int v3) {
		super(v1, v2);
		this.v3 = v3;
	}
	
	
	public String toString() {
		return "(" + this.v1 + "," + this.v2 + "," + this.v3 + ")";
	}
	
	

}
