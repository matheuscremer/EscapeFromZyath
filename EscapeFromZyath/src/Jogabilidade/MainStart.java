package Jogabilidade;

import java.io.IOException;

import Jogabilidade.*;
import Locais.*;
import PreGame.*;
import Telas.*;

public class MainStart {
	
	public static void main(String[] args) throws IOException {				// M�todo Main
		
	Jogador jogador = new Jogador(); 										// Cria um novo jogador
	Inventario inventario = new Inventario();								// Cria o inventario do jogador
	Casa casa = new Casa();													// Cria a casa onde 
	HistoriaComeco historiaComeco = new HistoriaComeco();					// Cria uma nova historia
	ConfiguradorTextual configTextual = new ConfiguradorTextual();			// Cria um novo configurador de textos
	ThreadZyath threadZyath = new ThreadZyath();							// Cria a thread que encerra o programa
	ServicosDoJogador servicosDoJogador = new ServicosDoJogador();
	
	historiaComeco.Historia(jogador, configTextual, servicosDoJogador);						// Envia o jogador criado para o m�todo historia	
	
	casa.Local(jogador, inventario, configTextual, threadZyath, servicosDoJogador);			// Envia o jogador para o m�todo Game
	
	}
}
