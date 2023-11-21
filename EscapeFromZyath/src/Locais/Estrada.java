package Locais;

import java.io.IOException;
import java.util.Scanner;

import Jogabilidade.Inventario;
import Jogabilidade.Jogador;
import Jogabilidade.ServicosDoJogador;
import PreGame.ThreadZyath;
import Telas.*;

public class Estrada implements LocalJogo{
	
	@Override						// M�todo principal da Estrada
	public void Local(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, ThreadZyath threadZyath, ServicosDoJogador servicosDoJogador) throws IOException {
		TelaEstrada telaEstrada = new TelaEstrada();
		Scanner scanner = new Scanner(System.in);
		
		telaEstrada.TelaRua(jogador, configTextual, servicosDoJogador);				// Chama m�todo da tela da rua
		
		int voltar = 0;												// Variavel para sair do while
		
		while(voltar == 0) {										// While de dentro da estrada

			telaEstrada.TelaPrincipal(jogador);						// Tela da estrada
			
			int opcoes = scanner.nextInt();
			
			switch(opcoes) {										// switch de opcoes da estrada
			
				case 1:
					
					Celeiro celeiro = new Celeiro();
					
					configTextual.LimpaTela();
					
					celeiro.Local(jogador, inventario, configTextual, threadZyath, servicosDoJogador);	// Chama o m�todo do celeiro
					
					configTextual.AguardaTecla();
					configTextual.LimpaTela();			
					
					break;
					
				case 2:
					
					Floresta floresta = new Floresta();
					
					configTextual.LimpaTela();
					
					floresta.Local(jogador, inventario, configTextual, threadZyath, servicosDoJogador);	// Chama o m�todo da floresta
					
					configTextual.AguardaTecla();	
					configTextual.LimpaTela();
							
					break;
					
				case 3:
					
					configTextual.LimpaTela();
					
					casaAbandonada(jogador, inventario, configTextual, telaEstrada);	// Chama o m�todo casa abandonada
					
					configTextual.AguardaTecla();	
					configTextual.LimpaTela();			
					
					break;
					
				case 4:
					
					configTextual.LimpaTela();
					System.out.println("| Voc� retorna para sua casa");
					
					voltar = 1;															// Sai do loop para a casa
					break;
					
				case 5:
					
					configTextual.LimpaTela();
					
					inventario.MostraItens(inventario);									// Mostra itens
					
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
																// M�todo da casa abandonada
	public void casaAbandonada(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, TelaEstrada telaEstrada) throws IOException{
		
		Scanner scanner = new Scanner(System.in);
		
		if(jogador.isAchaAsi() == false) {									// If para achar a si mesmo
			
			telaEstrada.TelaCasaAbandonada(inventario, configTextual);		// Tela da casa abandonada
			
			if(inventario.isPeCabra() == true) {							// If se tiver o p� de cabra
				
				int opcao = scanner.nextInt();
				
				if(opcao == 1) {											// if para a opcao se quer abrir a casa
					
					telaEstrada.TelaCrianca(configTextual, jogador);
					
					jogador.setAchaAsi(true);								// Set para achar a si mesmo
					
					inventario.AddItem("Voc� encontrou a si mesmo.");		// Adiciona o item
					
				} else {
					
					System.out.println("| Voc� decidiu n�o despregar");		// Se escolher nao abrir a casa
					
				}
			}
			
		} else {
			
			System.out.println("| Voc� encontrou a si mesmo.");				// Se quiser voltar para a casa, mostra isso
			
		}
	}
}