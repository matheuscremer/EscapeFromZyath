package Locais;

import java.io.IOException;
import java.util.Scanner;

import Jogabilidade.*;
import PreGame.HistoriaFinal;
import PreGame.ThreadZyath;
import Telas.*;

public class Celeiro implements LocalJogo{
	
	private boolean CeleiroAberto = false;
	
	@Override
	public void Local(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, ThreadZyath threadZyath, ServicosDoJogador servicosDoJogador) throws IOException {
		
		TelaCeleiro telaCeleiro = new TelaCeleiro();
		
		Scanner scanner = new Scanner(System.in);
	
		boolean voltar = false;												// boolean para sair do while
		
		while(voltar == false) {

			telaCeleiro.TelaPrincipal(jogador);								// Tela Principal do celeiro
			
			int opcoes = scanner.nextInt();
			
			switch(opcoes) {
			
				case 1:

					configTextual.LimpaTela();
					
					Portao(jogador, inventario, configTextual, telaCeleiro, threadZyath, servicosDoJogador);	// Chama M�todo do portao
					
					configTextual.AguardaTecla();
					configTextual.LimpaTela();			
					
					break;
					
				case 2:
				
					configTextual.LimpaTela();
					
					telaCeleiro.TelaVaca(jogador, configTextual, servicosDoJogador);							// Chama m�todo da vaca
					
					configTextual.AguardaTecla();
					configTextual.LimpaTela();		
					
					break;
					
				case 3:
					
					voltar = true;															// Sai do loop
					
					configTextual.LimpaTela();
					System.out.println("| Voc� retorna para a rua de terra.");
					
					break;
					
				case 4:
					
					configTextual.LimpaTela();		
					
					inventario.MostraItens(inventario);										// Mostra itens
					
					configTextual.AguardaTecla();											
					configTextual.LimpaTela();	
					
					break;
					
				default:
					
					System.out.println("|");
					System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");
					
					break;
						
			}		
		}
	}

	public void Portao(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, TelaCeleiro telaCeleiro, ThreadZyath threadZyath, ServicosDoJogador servicosDoJogador) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		
		if(CeleiroAberto == false) {									// If o portao estiver trancado
			
			System.out.println("| H� um grande cadeado com correntes que seguram o port�o do celeiro."); // Sem a chave
			
			if(inventario.isChaveCeleiro() == true) {					// If tiver a chave 
				
				telaCeleiro.TelaPortao();								// Tela para abrir o portao
				
				  int opcao = scanner.nextInt();
				  
				  switch(opcao) {
				  	
				  	case 1:
				  		
				  		configTextual.LimpaTela();
				  		
				  		System.out.println("| Voc� abre o port�o e passa por ele.");
				  		
				  		configTextual.AguardaTecla();											
						configTextual.LimpaTela();	
						
						CeleiroAberto = true;											// Abre o portao do celeiro
						
						DentroCeleiro(jogador, inventario, configTextual,telaCeleiro, threadZyath, servicosDoJogador);	// Entra no celeiro
						
						break;
						
				  	case 2:
				  		
				  		configTextual.LimpaTela();
				  		System.out.println("| Voc� se afasta do port�o");
				  		
				  		break;
				  	
				  	default:
	
						System.out.println("|");
						System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");
						
						break;	
				  }
			}
		
		} else {
			
			System.out.println("| Voc� passa pelo port�o...");		// Se o portao estiver aberto, passa direto
			
			configTextual.AguardaTecla();											
			configTextual.LimpaTela();	
			
			DentroCeleiro(jogador, inventario, configTextual,telaCeleiro, threadZyath, servicosDoJogador); // entra no celeiro
		}
	}
	
	public void DentroCeleiro(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, TelaCeleiro telaCeleiro, ThreadZyath threadZyath, ServicosDoJogador servicosDoJogador) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean voltar = false;											// Boolean para sair do while
		
		while(voltar == false) {

			telaCeleiro.TelaDentroCeleiro(jogador);						// Mostra tela dentro do celeiro
			
			int opcao = scanner.nextInt();
			switch(opcao) {
			
				case 1:
					
					configTextual.LimpaTela();
					
					VasculharAlcapao(jogador, inventario, configTextual, telaCeleiro, threadZyath, servicosDoJogador); // Tela vasculha alcapao
					
					configTextual.AguardaTecla();
					configTextual.LimpaTela();			
					
					break;
					
				case 2:
				
					configTextual.LimpaTela();												
						  								
					System.out.println("| Voc� passa pelo port�o e sai para o lado de fora do celeiro.");
					
					voltar = true;											// Sai do while saindo do celeiro
					
					break;
					
				case 3:
					
					configTextual.LimpaTela();
					
					inventario.MostraItens(inventario);						// Olha os itens
					
					configTextual.AguardaTecla();											
					configTextual.LimpaTela();	
					
					break;
					
				default:
					
					System.out.println("|");
					System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");
					
					break;
						
			}		
		}
	}
	
	public void VasculharAlcapao(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, TelaCeleiro telaCeleiro, ThreadZyath threadZyath, ServicosDoJogador servicosDoJogador) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		if(jogador.isAchaAlcapao() == false) {
			
			telaCeleiro.TelaVasculha(jogador, configTextual);						// Tela acha o al�ap�o
			
		} 
		
		telaCeleiro.TelaAlcapao(inventario, configTextual);							// Tela opcoes al�apao
		
		if(inventario.isPeCabra() == true) {										// Se tiver p� de cabra abre al�apao
			
			int alcapao = scanner.nextInt();
			
			if(alcapao == 1) {
				
				threadZyath.stop();													// Derrota Zyath
				
				HistoriaFinal historiaFinal = new HistoriaFinal();
				historiaFinal.Historia(jogador, configTextual, servicosDoJogador);						// Inicia o m�todo da historia final
				
			} else {
				
				configTextual.LimpaTela();
				
				System.out.println("| Voc� decidiu n�o abri-lo.");
				
			}
		}
			 		
	}
}

