package PreGame;

import java.io.IOException;

import Jogabilidade.Jogador;
import Jogabilidade.ServicosDoJogador;
import Telas.ConfiguradorTextual;

public interface Historia {
									// M�todo da historia do jogo
	public void Historia(Jogador jogador, ConfiguradorTextual textual, ServicosDoJogador servicosDoJogador) throws IOException;

}
