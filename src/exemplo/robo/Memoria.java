package exemplo.robo;

public class Memoria {

	public enum Tipo { CPU, Movimento }
	
	public static Tipo tipoReservado;
	public static boolean ativa = false;
	
	
	public void ativaMemoria() {
		ativa = true;
		System.out.println("Memoria ativada");
	}
	
	public void reservaMemoria(Tipo tipo) {
		tipoReservado = tipo;
		System.out.println("Memória Reservada");
	}
	
	public void liberaTodaMemoria() {
		System.out.println("Memorias liberadas");
	}
	
	public void desliga() {
		System.out.println("Desativando memoria");
	}
	
}
