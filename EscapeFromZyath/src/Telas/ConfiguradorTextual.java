package Telas;

import java.io.IOException;
import java.util.Scanner;

public class ConfiguradorTextual {
	
		public void AguardaTecla() throws IOException {     // Método que aguarda a tecla para prosseguir o programa
			
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();								// aguarda a tecla enter para prosseguir para a próxima linha
			
		}
		
		public void LimpaTela() {                           // Método que limpa o console
			
			for (int i = 0; i < 100; ++i)                   // Cria um for para imprimir espaços em branco
			       System.out.println(); 					// Pula uma linha em branco
			
		}
		
		public void PulaLinha() {							// Método para pular linha
			
			System.out.println("");							// Pula linha
			
		}
}


