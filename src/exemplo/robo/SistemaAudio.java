package exemplo.robo;

public class SistemaAudio {

	public enum Audios { Movimento }
	
	public void testaHarwares() throws Exception {
		System.out.println("Testando Hardwares de �udio");
		if (!Memoria.ativa)
			throw new Exception("Memoria n�o reservada para �udio");
		System.out.println("Audio OK");
	}
	
	public void reproduzSom(Audios tipo) {
		if (tipo == Audios.Movimento)
			System.out.println("Reproduzindo som de movimento");
	}
	
	public void desativa() {
		System.out.println("Desativando �udio");
	}
}
