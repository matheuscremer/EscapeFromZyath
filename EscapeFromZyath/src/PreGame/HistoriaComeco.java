package PreGame;

import java.io.IOException;
import java.util.Scanner;

import Jogabilidade.Jogador;
import Jogabilidade.ServicosDoJogador;
import Telas.*;

public class HistoriaComeco implements Historia{
	
								// Método que mostra o começo da historia	
	public void Historia(Jogador jogador, ConfiguradorTextual configTextual, ServicosDoJogador serviçosDoJogador) throws IOException { 
		
		serviçosDoJogador.AlteraNomeJogador(jogador);											// Método para nomear o jogador		
		configTextual.LimpaTela(); 													// Método para limpar o console	
		
		System.out.println("| 24/03/17XX ");									// Historia sendo contada em prints 
		
		configTextual.AguardaTecla(); 												// Método que aguarda a tecla enter
		configTextual.PulaLinha(); 
		
		System.out.println("| Nicolas: acorda " + jogador.getNome() + "!");
		
		configTextual.AguardaTecla();
		configTextual.PulaLinha();
		
		System.out.println("| " + jogador.getNome() + " se levanta com uma estranha sensação de dejavu como se ja tivesse");
		System.out.println("| passado por esse momento.");
		
		configTextual.AguardaTecla();
		configTextual.PulaLinha();
		
		System.out.println("| " + jogador.getNome()+": Nicolas?... É muito tarde... o que esta fazendo ai na janela?"); 
		
		configTextual.AguardaTecla();
		configTextual.PulaLinha();
		
		System.out.println("| Nicolas: A lua Sangrou denovo, ele esta vindo!");
		
		configTextual.AguardaTecla();
		configTextual.PulaLinha();
		
		System.out.println("| " + jogador.getNome()+": Espere Nicolas!");
		
		configTextual.AguardaTecla();
		configTextual.PulaLinha();
		
		System.out.println("| ...");
		
		configTextual.AguardaTecla();
		configTextual.PulaLinha();
		
		System.out.println("| Ao se aproximar da janela, Os gritos do silencio ecoam pela floresta.");
		
		configTextual.AguardaTecla();
		configTextual.PulaLinha();
		
		System.out.println("| Você pega seu Lampião em cima da mesa.");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		}

}
