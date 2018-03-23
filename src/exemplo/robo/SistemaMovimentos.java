package exemplo.robo;

public class SistemaMovimentos {
	
	private int destinoX = 0;
	private int destinoY = 0;

	private int x = 0;
	private int y = 0;
	
	public void testaHarwares() throws Exception {
		System.out.println("Testando Hardwares de Movimento");
		if (!Memoria.ativa)
			throw new Exception("ERRO: Memoria não reservada para movimento");
		System.out.println("SUCESSO: Movimento OK");
	}
	
	public void setDestino(int x, int y) {
		this.destinoX = x;
		this.destinoY = y;
	}	
	
	public void moveRobo() throws Exception {
		if (Memoria.tipoReservado != Memoria.Tipo.Movimento) 
			throw new Exception("ERRO: Memoria não reservada para movimento");
		
		System.out.println("Movendo Robo de " + x + "," + y + " para " + destinoX + ", " + destinoY);
		
		if (x > destinoX)
			x--;
		else if (x < destinoX)
			x++;
		
		if (y > destinoY)
			y--;
		else if (y < destinoY)
			y++;
	}
	
	public boolean chegouDestino() {
		return (x == destinoX && y == destinoY);
	}
	
	public void desativa() {
		System.out.println("Desativando movimento");
	}
	
	
}
