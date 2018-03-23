package exemplo;

import exemplo.robo.CPU;
import exemplo.robo.DiscoRigido;
import exemplo.robo.Memoria;
import exemplo.robo.SistemaAudio;
import exemplo.robo.SistemaMovimentos;

public class Main {

	public static void main(String args[]) {
		//Ligar
		CPU cpu = new CPU();
		DiscoRigido disco = new DiscoRigido();
		Memoria memoria = new Memoria();
		SistemaAudio audio = new SistemaAudio();
		SistemaMovimentos movimento = new SistemaMovimentos();
		
		memoria.ativaMemoria();
		memoria.reservaMemoria(Memoria.Tipo.CPU);
		disco.lerRegistro();
		cpu.iniciarProcessos();
		try {
			audio.testaHarwares();
			movimento.testaHarwares();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Mover
		try {
			memoria.reservaMemoria(Memoria.Tipo.Movimento);
			movimento.setDestino(3, 2);
			do {
				movimento.moveRobo();
				audio.reproduzSom(SistemaAudio.Audios.Movimento);
				disco.registraPosicaoAtual();
			} while(!movimento.chegouDestino());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("FIM");
		
		
		//Desligar
	}
}
