package PreGame;

public class ThreadZyath extends Thread{
	
	public void run(){												// M�todo run para matar o jogador se demorar a jogar
		
		try {
			Thread.sleep(60000);									// Bota a thread para durmir a cada 1 minuto
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n| "+ "A lua come�a a se envermelhecer...");
	
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n| " + "O ceu come�a a sangrar...");

		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n| " + "As nuvens se fecharam...");

		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n| " + "Zhyath est� chegando...");
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n| " + "Zhyath chegou");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
																				// For para preencher a tela com interroga��es
		for(int i = 0; i < 100000; i++) {
			System.out.println("\n| " + "?????????????????????????????????????????????????????????????????????????????????????");
		}
		
		
		System.exit(0);															//Encerra o programa, matando o jogador
		
	}
}
