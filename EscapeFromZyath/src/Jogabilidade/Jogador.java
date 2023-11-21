package Jogabilidade;

import java.io.IOException;
import java.util.Scanner;

import Telas.ConfiguradorTextual;

public class Jogador {												// Classe do construtor jogador
	
	private String nome;											// Nome para o jogador
	private int sanidade = 10;										// Quantidade de sanidade do jogador at� 10
	private boolean olhaMorto = false;								// Armazena as escolhas do jogador
	private boolean olhaCeu = false;
	private boolean olhaLago = false;
	private boolean olhaVaca = false;
	private boolean escutaZyath = false;
	private boolean achaAlcapao = false;
	private boolean achaAsi = false;
	private boolean olhaNicolas = false;
	
	public String getNome() {										// Getter do nome do jogador
		return nome;
	}

	public void setNome(String next) {								// Setter do nome do jogador
		this.nome = next;
	}
	
	
	public int getSanidade() {										// Getter da quantia de sanidade
		return sanidade;
	}

	public void setSanidade(int sanidade) {
		this.sanidade = sanidade;
	}
	
	
	public boolean isOlharMorto() {													// Setter do cadaver
		return olhaMorto;
	}

	public void setOlharMorto(boolean olharMorto) {									// Getter do cadaver
		this.olhaMorto = olharMorto;
	}

	
	public boolean isOlhaCeu() {													// Getter de olhar pro ceu na estrada
		return olhaCeu;
	}

	public void setOlhaCeu(boolean olhaCeu) {										// Setter de olhar pro ceu na estrada
		this.olhaCeu = olhaCeu;
	}

	
	public boolean isOlhaLago() {													// Getter de olhar o lago
		return olhaLago;
	}

	public void setOlhaLago(boolean olhaLago) {										// Setter de olhar o lago
		this.olhaLago = olhaLago;
	}

	
	public boolean isOlhaVaca() {													// Getter de olhar a vaca
		return olhaVaca;
	}

	public void setOlhaVaca(boolean olhaVaca) {										// Setter de olhar a vaca
		this.olhaVaca = olhaVaca;
	}

	
	public boolean isEscutaZyath() {												// Getter de olhar o Zyath
		return escutaZyath;
	}

	public void setEscutaZyath(boolean escutaZyath) {								// Setter de olhar o Zyath
		this.escutaZyath = escutaZyath;
	}

	
	public boolean isAchaAlcapao() {												// Getter de Achar o al�apao
		return achaAlcapao;	
	}

	public void setAchaAlcapao(boolean achaAlcapao) {								// Setter de Achar o al�apao
		this.achaAlcapao = achaAlcapao;	
	}

	
	public boolean isAchaAsi() {													// Getter de Achar a si
		return achaAsi;
	}

	public void setAchaAsi(boolean achaAsi) {										// Setter de Achar a si
		this.achaAsi = achaAsi;
	}

	public boolean isOlhaNicolas() {
		return olhaNicolas;
	}

	public void setOlhaNicolas(boolean olhaNicolas) {
		this.olhaNicolas = olhaNicolas;
	}

}
