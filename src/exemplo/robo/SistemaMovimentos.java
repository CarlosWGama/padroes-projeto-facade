package exemplo.robo;

public class SistemaMovimentos {
	
	private int destinoX = 0;
	private int destinoY = 0;

	private int x = 0;
	private int y = 0;
	
	public void testaHarwares() throws Exception {
		System.out.println("Testando Hardwares de Movimento");
		if (!Memoria.ativa)
			throw new Exception("Memoria não reservada para movimento");
		System.out.println("Movimento OK");
	}
	
	public void setDestino(int x, int y) {
		this.destinoX = x;
		this.destinoY = y;
	}	
	
	public void moveRobo() throws Exception {
		if (Memoria.tipoReservado != Memoria.Tipo.Movimento) 
			throw new Exception("Memoria não reservada para movimento");
		
		System.out.println("Movendo Robo para posições " + x + ", " + y);
		
		if (x > destinoX)
			x--;
		else if (x < destinoX)
			x++;
		
		if (y > destinoY)
			y--;
		else if (y < destinoY)
			y++;
	}
	
	public void desativa() {
		System.out.println("Desativando movimento");
	}
	
	
}
