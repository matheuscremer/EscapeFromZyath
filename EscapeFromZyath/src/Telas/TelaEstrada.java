package Telas;

import java.io.IOException;

import Jogabilidade.*;

public class TelaEstrada implements Tela{
	
	@Override
	public void TelaPrincipal(Jogador jogador) {				// Tela principal da Estrada
		
		System.out.println("|///// Jogador: " + jogador.getNome() + " /////////////////////////////////////////////////// Sanidade: " + jogador.getSanidade() + " //////");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("| Voc� esta em meio a uma rua de terra e do outro lado a uma casa abandonada. Ao longe de sua");
		System.out.println("| esquerda h� um celeiro, a direita a floresta de Wyrn e atras de voc� a sua casa.");
		System.out.println("| O que deseja fazer?");
		System.out.println("|");
		System.out.println("| 1 Celeiro");
		System.out.println("| 2 Floresta de Wyrn");
		System.out.println("| 3 Casa abandonada");
		System.out.println("| 4 Voltar");
		System.out.println("| 5 Inventario");
		System.out.println("|");
		  System.out.print("|: ");
	}
															// Tela de quando olhar pro ceu na rua
	public void TelaRua(Jogador jogador, ConfiguradorTextual configTextual, ServicosDoJogador servicosDoJogador) throws IOException {
		
		if(jogador.isOlhaCeu() == false) {
			
		System.out.println("| Voc� abre sua porta e da de frente com a rua e encontra");
		System.out.println("| pessoas caidas ao ch�o.");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		
		System.out.println("| A tempestade vermelha no ceu � mais um sinal de sua chegada.");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		
		System.out.println("| Isso mexe com sua mente e sua sanidade n�o � mais a mesma.");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		
		servicosDoJogador.DiminuiSanidade(jogador);
		
		jogador.setOlhaCeu(true);								// Confirma que olhou o ceu
		
		}
	}														// Tela para olhar casa abandonada
	
	public void TelaCasaAbandonada(Inventario inventario, ConfiguradorTextual configTextual) throws IOException {
		
		System.out.println("| A casa esta toda pregada com tabuas e com os vidros quebrados.");
		System.out.println("| Como se alguem estivesse se protegendo de algo.");
		
		if(inventario.isPeCabra() == true) {					// Se tiver P� de cabra, pode abrir
			
			configTextual.AguardaTecla();
			configTextual.LimpaTela();
			
			System.out.println("| Voc� pode despregar as tabuas da porta com o p� de cabra.");
			System.out.println("| Despregar?");
			System.out.println("|");
			System.out.println("| 1 Sim");
			System.out.println("| 2 N�o");
			  System.out.print("|: ");
			  
		}
	}
	
	public void TelaCrianca(ConfiguradorTextual configTextual, Jogador jogador) throws IOException { // Tela sobre a crian�a
		
		configTextual.LimpaTela();
		System.out.println("| Voc� desprega algumas tabuas em frente da porta.");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		
		System.out.println("| A porta estava totalmente destruida...");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		
		System.out.println("| Voc� adentra e encontra uma crian�a encolhida de frio.");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		
		System.out.println("| Voc� encontrou " + jogador.getNome() + ", que se levanta e segura sua m�o.");
		
	}
	
}
