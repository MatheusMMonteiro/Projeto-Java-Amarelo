package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Option3Prevencao {
	Scanner entrada = new Scanner(System.in);
	int opcao;

	// menuPrevencao
	public void menuPrevencao() {
		System.out.println("\n**************************** PREVEN��O *********************************");
		System.out.println("Seja bem vindo ao sistema de preven��o ao s�icidio " + "aqui voc� ter� "
				+ "\nalgumas decis�es" + "na serem tomadas!\n" 
				+ "\n|A preven��o|"
				+ "\nAs raz�es podem ser bem diferentes, por�m muito mais "
				+ "\ngente do que se imagina j� pensou em suic�dio.Segundo estudo realizado "
				+ "\npela Unicamp, 17% dos brasileiros,em algum momento, pensaram seriamente "
				+ "\nem dar um fim � pr�pria vida e,desses, 4,8% chegaram a elaborar um"
				+ "\nplano para isso. Em muitos casos, � poss�vel evitar que esses pensamentos"
				+ "\nsuicidas se tornem realidade.");
		System.out.println("\n|CVV|"
				+ "\nO CVV � uma das ONGs mais antigas do pa�s. Fundado em S�o Paulo em "
				+ "\n1962, atua no apoio emocional e "
				+ "na preven��o do " + "\nsuic�dio pelo telefone 188, " + "e tamb�m por chat, e-mail e pessoalmente.");
		System.out.println("\n[1] Encerrar o programa");
		System.out.println("[2] Menu Inicial");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			Encerramento encerramento = new Encerramento();
			encerramento.encerrar();
			break;
		case 2:
			Menu menu = new Menu();
			menu.menuInicio();
		}
		entrada.close();
	}
}