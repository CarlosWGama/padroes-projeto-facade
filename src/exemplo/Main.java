package exemplo;

import exemplo.robo.CPU;
import exemplo.robo.DiscoRigido;
import exemplo.robo.Memoria;
import exemplo.robo.RoboFacade;
import exemplo.robo.SistemaAudio;
import exemplo.robo.SistemaMovimentos;

public class Main {

	public static void main(String args[]) {
		RoboFacade robo = new RoboFacade();
		if (robo.ligarRobo()) {
			robo.moverRobo(3, 2);
		}
			
	}
}
