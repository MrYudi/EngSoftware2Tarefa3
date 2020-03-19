package Testes;

import org.junit.Test;

public class Testes {
	
	//Gabriel Yudi Sanefugi
	@Test
	public void recompensaParaOPerdedor() 
	{
		//Obs.: O perdedor n�o deveria recebe uma recompensa
		
		Jogo jogo = new Jogo("Queda de bra�o");
		
		Jogador jog1 = new Jogador("Jos�");
		Jogador jog2 = new Jogador("Fernando");
		
		jogo.partida(jog1,jog2);
		jogo.vencedor(jog1);
		
		assertEquals(jogo.getVencedor, jog2); //Deveria ser o jogador 1
		
	}
}
