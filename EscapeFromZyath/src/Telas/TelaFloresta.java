package Telas;

import java.io.IOException;

import Jogabilidade.Inventario;
import Jogabilidade.Jogador;
import Jogabilidade.ServicosDoJogador;

public class TelaFloresta implements Tela{


	@Override						// Tela principal da floresta
	public void TelaPrincipal(Jogador jogador) {
		
		System.out.println("|///// Jogador: " + jogador.getNome() + " /////////////////////////////////////////////////// Sanidade: " + jogador.getSanidade() + " //////");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("| Ao caminhar um pouco pela floresta voc� encontra uma cabana ao lado de um lago.");
		System.out.println("| Parece haver algo entre os arbustos a frente e atras de voc� esta a estrada de terra.");
		System.out.println("| O que deseja fazer?");
		System.out.println("|");
		System.out.println("| 1 Cabana");
		System.out.println("| 2 Lago");
		System.out.println("| 3 Arbustos");
		System.out.println("| 4 Voltar");
		System.out.println("| 5 Inventario");
		System.out.println("|");
		  System.out.print("|: ");
		  
	}
						// Tela da cabana
	public void TelaCabana(ConfiguradorTextual configTextual) throws IOException {
		
		System.out.println("| Parece ser a cabana de nicolas e esta totalmente escuro dentro.");
		
		configTextual.AguardaTecla();
		configTextual.LimpaTela();
		
		System.out.println("| A porta esta trancada.");
		
	}
				// Tela das opcoes do lago
	public void TelaOpcoesLago(Jogador jogador) {

		System.out.println("| Voc� ve um reflexo de sangue no lago, com um bra�o de esqueleto");
		System.out.println("| extendendido lhe oferece a verdade. aceitar?");
		System.out.println("|");
		System.out.println("| 1 Sim");
		System.out.println("| 2 N�o");
		System.out.println("|");
		  System.out.print("|: ");
		  
	}
														// Tela sobre o nicolas
	public void TelaNicolas(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual) throws IOException {

		System.out.println("| � o corpo do Nicolas! Ele esta com os olhos arregalados e totalmente paralisado.");
		System.out.println("| Ver um conhecido possivelmente morto lhe depressia profundamente.");
		
		
		if(inventario.isPeCabra() == false) {			// Se nao tiver p� de cabra, pode pega-lo
			
			System.out.println("| H� um p� de cabra em suas m�os.");
			System.out.println("|");
			System.out.println("| 1 Tentar acordar");
			System.out.println("| 2 Pegar p� de cabra");
		
		}else {										// se n�o nao ira mais mostra-lo
			
			System.out.println("|");
			System.out.println("| 1 Tentar acordar");
			System.out.println("| 2 Olhar p corpo");
		}
		
		System.out.println("| 3 Voltar");
		System.out.println("|");
		  System.out.print("|: ");
		
	}																// Tela quando ver a verdade do Zyath
	public void TelaZyath(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, ServicosDoJogador servicosDoJogador) throws IOException {
		
		configTextual.LimpaTela();
		System.out.println("| Ao segurar a m�o, voc� recebe a verdade nua e crua.");
		
		configTextual.AguardaTecla();											
		configTextual.LimpaTela();
		
		System.out.println("| Voc� ve a cena de Zyath chegando e causando o caos por onde passa");
		
		configTextual.AguardaTecla();											
		configTextual.LimpaTela();
		
		System.out.println("| Voc� presencia a forma fisica de Zyath.");
		
		configTextual.AguardaTecla();											
		configTextual.LimpaTela();
		
		System.out.println("| Isso abala o que voc� acredita.");
		
		servicosDoJogador.DiminuiSanidade(jogador);		// Perde sanidade
		
		jogador.setOlhaLago(true);										// Confirma que olhou o lago
	}
		
}
