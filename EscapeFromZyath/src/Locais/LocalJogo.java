package Locais;

import java.io.IOException;

import Jogabilidade.*;
import PreGame.ThreadZyath;
import Telas.*;

public interface LocalJogo {
								//M�todo para as opcoes gerais do local
	void Local(Jogador jogador, Inventario inventario, ConfiguradorTextual configTextual, ThreadZyath threadZyath, ServicosDoJogador servicosDoJogador) throws IOException;

}
