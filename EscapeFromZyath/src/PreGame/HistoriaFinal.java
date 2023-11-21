package PreGame;

import java.io.IOException;

import Jogabilidade.Jogador;
import Jogabilidade.ServicosDoJogador;
import Telas.ConfiguradorTextual;

public class HistoriaFinal implements Historia{

	@Override								// M�todo do final da historia
	public void Historia(Jogador jogador, ConfiguradorTextual configTextual, ServicosDoJogador servicosDoJogador) throws IOException {
		configTextual.LimpaTela();
		System.out.println("| Voc� desce o al�ap�o, sabendo que nada sobrevivera na superficie.");
		configTextual.AguardaTecla(); 												
		configTextual.PulaLinha(); 
		System.out.println("| Se encontra em meio ao escuro, com a vis�o limitada da luz de seu lampi�o.");
		configTextual.AguardaTecla(); 												
		configTextual.PulaLinha(); 
		System.out.println("| Voc� encontra uma porta e adentra a um seguro quarto com comida e cama para passar a noite.");
		configTextual.AguardaTecla(); 												
		configTextual.PulaLinha(); 
		
		if(jogador.isAchaAsi()== true) {										// If o jogador achar a si mesmo
			System.out.println("| Voc� encontrou " + jogador.getNome() + " e o salvou.");
			configTextual.AguardaTecla(); 												
			configTextual.PulaLinha(); 
			System.out.println("| Final Verdadeiro: acordei em uma cama de hospital");
		}else {																	// Else apenas sobreviver 
			System.out.println("| Final Normal: sobrevivendo a mais uma noite de Zyath");	
		}
		
		System.exit(0);															// Encerra o programa
		
	}

	

}
