package exemplo.robo;

public class RoboFacade {

	private CPU cpu = new CPU();
	private DiscoRigido disco = new DiscoRigido();
	private Memoria memoria = new Memoria();
	private SistemaAudio audio = new SistemaAudio();
	private SistemaMovimentos movimento = new SistemaMovimentos();

	
	public boolean ligarRobo() {
		memoria.ativaMemoria();
		memoria.reservaMemoria(Memoria.Tipo.CPU);
		disco.lerRegistro();
		cpu.iniciarProcessos();
		try {
			audio.testaHarwares();
			movimento.testaHarwares();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	
	public boolean moverRobo(int x, int y) {
		try {
			memoria.reservaMemoria(Memoria.Tipo.Movimento);
			movimento.setDestino(x, y);
			do {
				movimento.moveRobo();
				audio.reproduzSom(SistemaAudio.Audios.Movimento);
				disco.registraPosicaoAtual();
			} while(!movimento.chegouDestino());
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}
