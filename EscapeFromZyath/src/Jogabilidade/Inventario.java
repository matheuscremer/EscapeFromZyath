package Jogabilidade;

import java.util.ArrayList;

public class Inventario {

	ArrayList<String> listaItens = new ArrayList<String>();					// Cria uma nova lista de itens
	
	private boolean chaveCeleiro = false;									// Variavel que informa se tem a chave 
	private boolean papel = false;											// Variavel que informa se tem o papel 
	private boolean PeCabra = false;
	
	public boolean isChaveCeleiro() {										// Getter do ChaveCeleiro	
		return chaveCeleiro;
	}

	public void setChaveCeleiro(boolean chaveCeleiro) {						// Setter do ChaveCeleiro
		this.chaveCeleiro = chaveCeleiro;
	}
	
	public boolean isPapel() {												// Getter do papel	
		return papel;
	}

	public void setPapel(boolean papel) {									// Setter do papel
		this.papel = papel;
	}
	
	public boolean isPeCabra() {											// Getter do p� de cabra
		return PeCabra;
	}

	public void setPeCabra(boolean peCabra) {								// Setter do p� de cabra
		PeCabra = peCabra;
	}
	
	public void AddItem(String Item) {										// M�todo para adicionar um item ao inventario
		listaItens.add(Item);
	}
	
	public void MostraItens(Inventario inventario) {						// M�todo para mostrar os itens do inventario
		
		System.out.println("");
		
		for(int i = 0; i < listaItens.size(); i++) {						// For para imprimir at� o tamanho da lista
			System.out.println("|- " + listaItens.get(i));					// Imprime todas as strings da lista
		}
	}
}