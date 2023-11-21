package Locais;

import java.io.IOException;
import java.util.Scanner;

import Jogabilidade.*;
import PreGame.ThreadZyath;
import Telas.*;

public class Casa implements LocalJogo{
								
		@Override
		public void Local(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, ThreadZyath threadZyath, ServicosDoJogador servicosDoJogador) throws IOException {
						
			Scanner scanner = new Scanner(System.in);								 
			TelaCasa telaCasa = new TelaCasa();										// Cria o visor da casa para o jogador
			
			threadZyath.start();													// Ativa a thread que encerra o programa
			
			inventario.AddItem("Lampi�o");											// Adiciona o lampi�o aos itens
			
			while(true) {															// While para se manter no menu 
				
			telaCasa.TelaPrincipal(jogador);										// Mostra Tela da casa para o jogador 
			  
			int opcao = scanner.nextInt();											// Pega a opcao do jogador
			
			switch(opcao){															
				case 1:
					
					configTextual.LimpaTela();
					
					telaCasa.TelaJanela();													// Chama o m�todo da janela				
					
					break;	
					
				case 2:
					
					configTextual.LimpaTela();												
					
					Cama(jogador, configTextual, telaCasa);									// Chama o m�todo da cama
					
					break;
					
				case 3:
					
					configTextual.LimpaTela();
					
					Mesa(jogador, configTextual, inventario, telaCasa);						// Chama o m�todo da mesa
					
					break;
					
				case 4:
					
					configTextual.LimpaTela();
					
					Sala(jogador, configTextual, inventario, telaCasa, threadZyath, servicosDoJogador);			// Chama m�todo da sala
					
					break;
					
				case 5:
					
					configTextual.LimpaTela();
					
					inventario.MostraItens(inventario);								// Chama o m�todo que mostra os itens
					
					break;
					
				default:
					
					System.out.println("|");
					System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");
					
					break;
			}
			
			configTextual.AguardaTecla();											// Sempre que finalizar uma opcao,
			configTextual.LimpaTela();												// Ira aguardar enter e limpar a tela
			
			}
		}
		
							//M�todo para a cama
		public void Cama(Jogador jogador, ConfiguradorTextual configTextual, TelaCasa telaCasa) throws IOException {
			
			Scanner scanner = new Scanner(System.in);								
			
			telaCasa.TelaCamaOpcoes();												// M�todo que chama as opcoes da cama
			  
			int opcaoCama = scanner.nextInt();										// Armazena o proximo int do scanner
			switch(opcaoCama) {														// Abre o switch da cama
			
				case 1:
					
				telaCasa.TelaCamaDorme(configTextual);								// Chama o m�todo que mata o jogador ao durmir
					
				case 2:
					
					configTextual.LimpaTela();
					System.out.println("| Voc� decidiu que tinha mais o que fazer.");
					
					break;
				
				default:
					
					configTextual.LimpaTela();
					System.out.println("|");
					System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");
					
					break;
				
			}			
		}		
		
							//M�todo para a mesa
		public void Mesa(Jogador jogador, ConfiguradorTextual configTextual, Inventario inventario, TelaCasa telaCasa) throws IOException { 
			
			Scanner scanner = new Scanner(System.in);								// Cria um novo scanner
			
			boolean voltar = false;													// Variavel para voltar
			
			while(voltar == false) {												// While que o mantem na mesa
				
				telaCasa.TelaOpcoesMesa(inventario);								// Chama o m�todo para mostrar opcoes
					  
				int opcao = scanner.nextInt();										// Seleciona a opcao que o usu�rio digitar
				
					switch(opcao) {
						case 1:
							
							configTextual.LimpaTela();
							
							OpcoesMesa(inventario, configTextual, telaCasa);			// Chama o m�todo das opcoes do papel
							
							configTextual.AguardaTecla();
							configTextual.LimpaTela();
							
							break;
							
						case 2:
							
							configTextual.LimpaTela();	
							
							OpcoesGaveta(jogador, configTextual, inventario, telaCasa); // Chama o m�todo das opcoes da gaveta
							
							configTextual.AguardaTecla();
							configTextual.LimpaTela();
							
							break;
						
						case 3:
							
							voltar = true;												// Muda a variavel para sair do loop
							
							configTextual.LimpaTela();
							
							System.out.println("| Voc� se levanta da cadeira.");
							
							break;
							
						default:
							configTextual.LimpaTela();
							
							System.out.println("|");
							System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");

							configTextual.AguardaTecla();
							configTextual.LimpaTela();
							break;
							
					}
			}
			
		}	
		
		public void OpcoesMesa(Inventario inventario, ConfiguradorTextual configTextual, TelaCasa telaCasa) throws IOException {
			
			Scanner scanner = new Scanner(System.in);	
			
			telaCasa.TelaOpcoesPapelMesa(inventario, configTextual);	// Chama
			
			if(inventario.isPapel() == false) {							// A tela modifica se o jogador ja tiver pego o papel
								  
				int opcaopapel = scanner.nextInt();
				
				switch(opcaopapel) {									// Switch para decidir se pega o papel ou n�o
					case 1:
						
						configTextual.LimpaTela();
						
						System.out.println("| Voc� o guarda no bolso direito.");
						
						inventario.AddItem("Papel:" + "\n" + " *Chave do celeiro" + "\n" + " *P� de cabra com Nicolas" + "\n" + " *Al�ap�o" + "\n");
						inventario.setPapel(true);						// Adiciona o papel ao seu inventario
						
						break;
						
					case 2:
						
						configTextual.LimpaTela();
						System.out.println("| Voc� decidiu n�o pega-lo.");
						
						break;
						
					default:
						
						System.out.println("|");
						System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");
						
						break;
				}
				
			}
		}
		

		public void OpcoesGaveta(Jogador jogador, ConfiguradorTextual configTextual, Inventario inventario, TelaCasa telaCasa) throws IOException {
			Scanner scanner = new Scanner(System.in);
			
			telaCasa.TelaGaveta(configTextual, inventario);  			// Mostra a tela da gaveta
			
			if(inventario.isChaveCeleiro() == false) {					// Mostra se o jogador nao tiver pego a chave
				
				int opcaoChave = scanner.nextInt();
				
				switch(opcaoChave) {									// Switch para pegar a chave
					case 1:
						
						configTextual.LimpaTela();
						
						System.out.println("| Voc� guardou a chave consigo.");
						
						inventario.AddItem("Chave do celeiro");					// Adiciona a chave ao inventario
						inventario.setChaveCeleiro(true);
						
						break;
						
					case 2:
						
						configTextual.LimpaTela();
	
						System.out.println("| Voc� decidiu n�o pega-la.");
						
						break;
						
					default:
						
						System.out.println("|");
						System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");
						
						break;
						
				}
			}
		}
									// M�todo para ir para a sala
		public void Sala(Jogador jogador, ConfiguradorTextual configTextual, Inventario inventario, TelaCasa telaCasa, ThreadZyath threadZyath, ServicosDoJogador servicosDoJogador) throws IOException {
			Scanner scanner = new Scanner(System.in);
			Estrada estrada = new Estrada();
			
			boolean voltar = false;
			
			while(voltar == false) {
				
			telaCasa.TelaSala(jogador, configTextual, inventario, telaCasa);		// Mostra a tela da sala pro jogador
				
				int opcao = scanner.nextInt();
				
				switch(opcao) {														
				
					case 1:
						
						configTextual.LimpaTela();
						
						telaCasa.TelaCozinha();
						
						configTextual.AguardaTecla();								
						configTextual.LimpaTela();	
						
						break;
						
					case 2:
						
						configTextual.LimpaTela();
						
						MesaSala(jogador, configTextual, telaCasa, servicosDoJogador);					// Chama m�todo da mesa da sala
						
						configTextual.AguardaTecla();								
						configTextual.LimpaTela();	
						
						break;
						
					case 3:
						
						configTextual.LimpaTela();
						
						estrada.Local(jogador, inventario, configTextual, threadZyath, servicosDoJogador);			// Chama o m�todo entrada
						
						configTextual.AguardaTecla();											
						configTextual.LimpaTela();	
						
						break;
						
					case 4:
						
						voltar = true;
						
						configTextual.LimpaTela();
						System.out.println("| Voc� retorna para seu quarto");				// Sai do while para o quarto
						
						break;
						
					case 5:
						
						configTextual.LimpaTela();
						
						inventario.MostraItens(inventario);									// Mostra os itens
						
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

							//M�todo para ir a mesa da sala
		public void MesaSala(Jogador jogador, ConfiguradorTextual configTextual, TelaCasa telaCasa, ServicosDoJogador servicosDoJogador) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
			
			if(jogador.isOlharMorto() == false) {									// If se o jogador ja viu o cadaver
				
				telaCasa.TelaOpcaoCadaver(configTextual);							// Chama a tela de opcoes do cadaver
				  
				int opcao = scanner.nextInt();
				
					switch(opcao){
						case 1:
							
							telaCasa.TelaCadaver(configTextual);					// Chama a tela do cadaver
							
							servicosDoJogador.DiminuiSanidade(jogador);								// diminui sanidade
							
							break;
							
						case 2:
							
							configTextual.LimpaTela();
							System.out.println("| Voc� se afasta daquela coisa.");
							
							break;
							
						default:
							
							System.out.println("|");
							System.out.println("| Selecione uma das op��es apertando o numero e depois enter...");
							
							break;
					}
				
					jogador.setOlharMorto(true);
			
			} else {																		// mostra se ja viu cadaver
				
				System.out.println("| A cena ainda � desagrad�vel, mas voc� ja se acustumou...");
				
		}																						
	}
}


