package Jogabilidade;

import java.io.IOException;
import java.util.Scanner;

import Telas.ConfiguradorTextual;

public class ServicosDoJogador {

	int sanidadeReduzida = 2;
	
	public void AlteraNomeJogador(Jogador jogador) {				// M�todo para o jogador definir seu nome
		
		Scanner scanner = new Scanner(System.in);					
		
		System.out.print("| Seu nome: ");				
		
		jogador.setNome(scanner.next());							// Setta o nome do jogador com o que o usu�rio digitou
		
	}

	public void DiminuiSanidade(Jogador jogador) throws IOException {			// M�todo mudar a quantia de sanidade
		
		jogador.setSanidade(jogador.getSanidade() - sanidadeReduzida);			// A sanidade diminui 
		
		if(jogador.getSanidade() <= 0) {										// Se for menor que 0, morrera
			JogadorMorreDeInsanidade();																	
		
		}
	}
	
	public void JogadorMorreDeInsanidade() throws IOException {					// Mata o programa
			
			ConfiguradorTextual configTextual = new ConfiguradorTextual();	
			
			configTextual.AguardaTecla();
			configTextual.LimpaTela();
			
			System.out.println("| Voc� sucumbiu a insanidade...");
			
			configTextual.AguardaTecla();
			configTextual.LimpaTela();
			
			System.out.println("| E aceitou Zhyath");		
			
			configTextual.AguardaTecla(); 												
			configTextual.PulaLinha(); 
			
			System.out.println("| Final Ruim: Enlouqueceu");
			
			System.exit(0);																
		}
}
