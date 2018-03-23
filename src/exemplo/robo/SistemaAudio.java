package exemplo.robo;

public class SistemaAudio {

	public enum Audios { Movimento }
	
	public void testaHarwares() throws Exception {
		System.out.println("Testando Hardwares de Áudio");
		if (!Memoria.ativa)
			throw new Exception("Memoria não reservada para áudio");
		System.out.println("Audio OK");
	}
	
	public void reproduzSom(Audios tipo) {
		if (tipo == Audios.Movimento)
			System.out.println("Reproduzindo som de movimento");
	}
	
	public void desativa() {
		System.out.println("Desativando áudio");
	}
}
