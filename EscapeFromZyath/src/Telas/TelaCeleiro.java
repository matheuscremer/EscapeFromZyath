package Telas;

import java.io.IOException;

import Jogabilidade.*;

public class TelaCeleiro implements Tela{

	@Override
	public void TelaPrincipal(Jogador jogador) { // Tela principal do celeiro
		
		System.out.println("|///// Jogador: " + jogador.getNome() + " /////////////////////////////////////////////////// Sanidade: " + jogador.getSanidade() + " //////");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("| Voc� esta de frente ao celeiro, h� animais mortos por toda parte.");
		System.out.println("| Uma vaca pr�xima a voc� exala um cheiro de sangue nauseante.");
		System.out.println("| O que deseja fazer?");
		System.out.println("|");
		System.out.println("| 1 Port�o do celeiro");
		System.out.println("| 2 Vaca");
		System.out.println("| 3 Voltar");
		System.out.println("| 4 Inventario");
		System.out.println("|");
		  System.out.print("|: ");
	}
	
	public void TelaVaca(Jogador jogador, ConfiguradorTextual configTextual, ServicosDoJogador servicosDoJogador) throws IOException { // Tela da vaca
		
		if(jogador.isOlhaVaca() == false) {										// Confirma se ja viu a vaca
			
			System.out.println("| O animal esta apodrecendo com o estomago de fora, h� larvas por toda parte.");
			configTextual.AguardaTecla();
			configTextual.LimpaTela();	
			System.out.println("| A cena � esgormitante, voc� acaba vomitando.");
			configTextual.AguardaTecla();
			configTextual.LimpaTela();
			System.out.println("| Voc� se limpa e vira para o outro lado.");
			servicosDoJogador.DiminuiSanidade(jogador);
			jogador.setOlhaVaca(true);
			
		} else {
			
			System.out.println("| Voc� se nega a olhar aquilo novamente."); 	// Tela se ja tiver olhado a vaca
			
		}
	}
	
	public void TelaPortao() {													// Tela do port�o
		
		System.out.println("| Abrir?");
		System.out.println("|");
		System.out.println("| 1 Sim");
		System.out.println("| 1 N�o");
		  System.out.print("|: ");
		  
	}
	
	
	public void TelaDentroCeleiro(Jogador jogador) {							// Tela quando entra no celeiro
		
		System.out.println("|///// Jogador: " + jogador.getNome() + " /////////////////////////////////////////////////// Sanidade: " + jogador.getSanidade() + " //////");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("| Voc� adentra o celeiro com o port�o aberto, pois sabe que um cadeado e um port�o");
		System.out.println("| de maneira n�o o impedir�o.");
		System.out.println("| O que deseja fazer?");
		System.out.println("|");
		
		if(jogador.isAchaAlcapao() == true) {
			
			System.out.println("| 1 Al�ap�o");
			
		} else {
			
			System.out.println("| 1 Vasculhar a volta");
			
		}
		
		System.out.println("| 2 Sair do celeiro");
		System.out.println("| 3 Inventario");
		System.out.println("|");
		  System.out.print("|: ");
	}
	
	public void TelaVasculha(Jogador jogador, ConfiguradorTextual configTextual) throws IOException{ // Tela para vasculhar
		System.out.println("| Voc� vasculha a volta. ");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		
		System.out.println("| Encontra Muito feno...");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		
		System.out.println("| Em um canto do celeiro abaixo dos fenos, voc� descobre um Al�ap�o.");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		
		jogador.setAchaAlcapao(true);											// Setta o acha al�apao
	}
										// Tela do al�adao
	public void TelaAlcapao(Inventario inventario, ConfiguradorTextual configTextual) throws IOException{ 
		
		System.out.println("| O Al�ap�o � de madeira, Parece emperrado e pesado demais");
		System.out.println("| para se abrir de m�os nuas.");
		
		if(inventario.isPeCabra() == true) {	// Se tiver p� de cabra abre a op��o pra abrir al�apao
			
			configTextual.AguardaTecla();
			configTextual.LimpaTela();
			
			System.out.println("| Usar P� de cabra para for�ar o al�ap�o e entrar?");
			System.out.println("| 1 Sim");
			System.out.println("| 2 N�o");
			System.out.println("|");
			  System.out.print("|: ");
			
		}	
	}

}

