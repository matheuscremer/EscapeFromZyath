package Telas;

import java.io.IOException;
import java.util.Scanner;

import Jogabilidade.*;

public class TelaCasa implements Tela{

		@Override
		public void TelaPrincipal(Jogador jogador) {					// Tela de menu da casa para o jogador
			
			System.out.println("|///// Jogador: " + jogador.getNome() + " /////////////////////////////////////////////////// Sanidade: " + jogador.getSanidade() + " //////");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("| Voc� esta de frente para a mesa, nas suas costas esta sua cama, a sua direita tem a janela");
			System.out.println("| e a sua esquerda a porta do seu quarto.");
			System.out.println("| O que deseja fazer?");
			System.out.println("|");
			System.out.println("| 1 Janela");
			System.out.println("| 2 Cama");
			System.out.println("| 3 Mesa");
			System.out.println("| 4 Sair do Quarto");
			System.out.println("| 5 Inventario");
			System.out.println("|");
			  System.out.print("|: ");
		
		}
		
		public void TelaJanela() {											// Tela da janela
			
			System.out.println("| Voc� olha pela janela, Voc� da de frente com a floresta de Wyrn, se perguntando ");
			System.out.println("| porque nicolas j� foi sem voc�.");
			
		}
		
		public void TelaCamaOpcoes() {										// Tela das opcoes da cama
			
			System.out.println("| O sono lhe decai as palpebras, deseja voltar a durmir?");
			System.out.println("|");
			System.out.println("| 1 Sim");
			System.out.println("| 2 N�o");
			System.out.println("|");
			  System.out.print("|: ");
		}		
		
		public void TelaCamaDorme(ConfiguradorTextual configTextual) throws IOException { // Tela quando jogador dorme
			
			configTextual.LimpaTela();
			System.out.println("| Voc� se deita calmamente, sem preucupa��es pois sabe que amanha � mais um dia.");
			configTextual.AguardaTecla();
			configTextual.LimpaTela();
			System.out.println("| Voc� acorda aos poucos, com um desconfortavel liquido vermelho em seus olhos.");
			configTextual.AguardaTecla();
			configTextual.LimpaTela();
			System.out.println("| Voc� dormiu despreocupadamente e aceitou Zhyath.");
			System.exit(0);
			
		}

		public void TelaOpcoesMesa(Inventario inventario) { 				// Tela das opcoes da measa
			
			if(inventario.isPapel() == false) {				// Mostra se n�o tiver pego papel
				
				System.out.println("| Voc� se senta e observa a mesa, h� um papel com anota��es, uma pena e um tinteiro.");
				System.out.println("|");
				System.out.println("| 1 Papel");			
				
			}else {											// Mostra se tiver pego o papel
				
				System.out.println("| Em sua mesa h� apenas uma pena e um tinteiro vazio.");
				System.out.println("|");
				System.out.println("| 1 Mesa");					
				
			}
				System.out.println("| 2 Gaveta");
				System.out.println("| 3 Voltar");
				System.out.println("|");
				  System.out.print("|: ");
		}
		
																// Tela das opcoes do papel e da superficie da mesa
		public void TelaOpcoesPapelMesa(Inventario inventario, ConfiguradorTextual configTextual) throws IOException {	
			
			Scanner scanner = new Scanner(System.in);					
			
			configTextual.LimpaTela();
			
			if(inventario.isPapel() == false) {					//A tela modifica se o jogador ja tiver pego o papel
				
				System.out.println("| No papel h� um simbolo estranho com um conjunto de instru��es. Pegar?");
				System.out.println("|");
				System.out.println("| 1 Sim");
				System.out.println("| 2 N�o");
				System.out.println("|");
				  System.out.print("|: ");
				  
			}else {
						
				System.out.println("| Apenas uma pena e um tinteiro.");	//Se ja tiver pego o papel, ele nao esta mais la
			}
			  
		}
		
																		// M�todo das opcoes da chave
		public void TelaGaveta(ConfiguradorTextual configTextual, Inventario inventario) throws IOException {	

			Scanner scanner = new Scanner(System.in);
			
			configTextual.LimpaTela();
			
			if(inventario.isChaveCeleiro() == false) {					// Mostra se o jogador nao tiver pego a chave
				
				System.out.println("| Voc� encontra alguns objetos quebrados e uma chave. Pegar?");
				System.out.println("|");
				System.out.println("| 1 Sim");
				System.out.println("| 2 N�o");
				System.out.println("|");
				  System.out.print("|: ");
				  

			} else {
				
				System.out.println("| Voc� encontra alguns objetos quebrados."); // Se ja tiver pego a chave, nao esta la
				
			}
			  
		}
												// Tela se estiver na sala da casa
		public void TelaSala(Jogador jogador, ConfiguradorTextual configTextual, Inventario inventario, TelaCasa telaCasa) {
			System.out.println("|///// Jogador: " + jogador.getNome() + " /////////////////////////////////////////////////// Sanidade: " + jogador.getSanidade() + " //////");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("| Na sala principal de sua casa voc� escuta um som metalico, sua cozinha esta a sua direita, uma mesa");
			System.out.println("| de jantar a sua esquerda, atras de voc� esta a porta do seu quarto e a sua frente a porta da sua casa.");
			System.out.println("| O que deseja fazer?");
			System.out.println("|");
			System.out.println("| 1 Cozinha");
			System.out.println("| 2 Mesa Grande");
			System.out.println("| 3 Porta da casa");
			System.out.println("| 4 Voltar para o quarto");
			System.out.println("| 5 Inventario");
			System.out.println("|");
			  System.out.print("|: ");
		}
		
		public void TelaCozinha() {							 // Tela se olhar a cozinha
			System.out.println("| A lou�a esta cheia e a geladeira esta aberta com alguns alimentos apodrecendo.");
		
		}
		
		public void TelaOpcaoCadaver(ConfiguradorTextual configTextual) throws IOException { // Tela de opcoes do cadaver
			
			configTextual.LimpaTela();
			System.out.println("| Voc� se depara com um cadaver intacto sentado em uma das cadeiras.");
			System.out.println("| Analisar melhor?");
			System.out.println("|");
			System.out.println("| 1 Sim");
			System.out.println("| 2 N�o");
			System.out.println("|");
			  System.out.print("|: ");

		}
		
		public void TelaCadaver(ConfiguradorTextual configTextual) throws IOException { // Tela se analisar o cadaver
			
			configTextual.LimpaTela();
			System.out.println("| N�o a nada em seu rosto, apenas um buraco que emite um som metalico.");
			configTextual.AguardaTecla();											
			configTextual.LimpaTela();
			System.out.println("| Olhar para o buraco escuro � como olhar para o ceu a noite.");
			
			configTextual.AguardaTecla();											
			configTextual.LimpaTela();
			System.out.println("| T�o vazio e profundo que da a sensa��o de queda para dentro.");
			
			System.out.println("| Essa cena mexe com seu psicologico e");
			System.out.println("| sua sanidade n�o � mais a mesma");
			
		}
}





