package Locais;

import java.io.IOException;
import java.util.Scanner;

import Jogabilidade.*;
import PreGame.ThreadZyath;
import Telas.*;

public class Floresta implements LocalJogo{

	@Override
	public void Local(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, ThreadZyath threadZyath, ServicosDoJogador servicosDoJogador) throws IOException{
		
		TelaFloresta telaFloresta = new TelaFloresta();
		
		Scanner scanner = new Scanner(System.in);
		
		boolean voltar = false;													// Variavel para sair do while
		
		while(voltar == false) {												// While para as opcoes da floresta

			telaFloresta.TelaPrincipal(jogador);								// M�todo que chama a tela da floresta
			
			int opcoes = scanner.nextInt();
			
			switch(opcoes) {													// Switch para as opcoes da floresta
				
				case 1:

					configTextual.LimpaTela();
					
					telaFloresta.TelaCabana(configTextual);								// Mostra a tela da cabana
					
					configTextual.AguardaTecla();
					
					configTextual.LimpaTela();			
					
					break;
					
				case 2:
				
					configTextual.LimpaTela();
					
					Lago(jogador, inventario, configTextual, telaFloresta, servicosDoJogador);				// Chama o m�todo lago
					
					configTextual.AguardaTecla();
					
					configTextual.LimpaTela();		
				
					break;
					
				case 3:
					
					configTextual.LimpaTela();
					
					Nicolas(jogador, inventario, configTextual, telaFloresta, servicosDoJogador);			// Chama o m�todo nicolas
					
					configTextual.AguardaTecla();	
					configTextual.LimpaTela();		
					
					break;
					
				case 4:
					
					voltar = true;														// Sai do while
					
					configTextual.LimpaTela();
					
					System.out.println("| Voc� retorna para a estrada de terra.");
					
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

	public void Nicolas(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, TelaFloresta telaFloresta, ServicosDoJogador servicosDoJogador) throws IOException{
		Scanner scanner = new Scanner(System.in);

		if( jogador.isOlhaNicolas() == false) {
			
			jogador.setOlhaNicolas(true);
			servicosDoJogador.DiminuiSanidade(jogador);					// Perde sanidade por ver nicolas morto
		
		}
		
		boolean voltar = false;
		
		while(voltar == false) {
		
			telaFloresta.TelaNicolas(jogador, inventario, configTextual);

			int opcao = scanner.nextInt();
			
				switch(opcao){														// Switch para as opcoes do nicolas
					case 1:  
						
						configTextual.LimpaTela();
						
						System.out.println("| Voc� o sacode e diz seu nome, mas ele parece n�o responder ao seu chamado.");
						
						configTextual.AguardaTecla();											
						configTextual.LimpaTela();
						
						break;
						
					case 2:
						
						configTextual.LimpaTela();
						
						if(inventario.isPeCabra() == false) {					// se n�o tiver o p� de cabra aparece
						
							System.out.println("| Voc� o mantem em suas m�os");
							inventario.AddItem("P� de cabra");					// Adiciona o p� de cabra ao inventario
							
							inventario.setPeCabra(true);						// Confirma que possui o p� de cabra
						
						} else {
							
							System.out.println("| Talvez ele ja tenha acordado...");	// se tentar olhar o corpo
						
						}
						
						configTextual.AguardaTecla();											
						configTextual.LimpaTela();
						
						break;
					
					case 3:
						
						voltar = true;										// M�todo para sair do while
						
						configTextual.LimpaTela();
						System.out.println("| Voc� sai dos arbustos.");
						
						break;
						
					default:
						
						System.out.println("|");
						System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");
						
						break;
				}
		}
	}
										// M�todo para o lago
	public void Lago(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, TelaFloresta telaFloresta, ServicosDoJogador servicosDoJogador) throws IOException{
	
		Scanner scanner = new Scanner(System.in);

		if(jogador.isOlhaLago() == false) {											
		
			telaFloresta.TelaOpcoesLago(jogador);								// Tela para as opcoes do lago

			int opcao = scanner.nextInt();
			
				switch(opcao){													// switch para o jogador ver Zyath
					case 1:  
						
						telaFloresta.TelaZyath(jogador, inventario, configTextual, servicosDoJogador);		// Chama m�todo do Zyath
						
						break;
						
					case 2:
						
						configTextual.LimpaTela();
						System.out.println("| Voc� se afasta da beira do lago.");	
						
						break;
						
					default:
						
						System.out.println("|");
						System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");
						
						break;
				}
				
			
		} else {
			
			System.out.println("| O lago Esta refletindo a verdade.");	// Se ja tiver visto o lago mostra isso
			
		}
	}
}
