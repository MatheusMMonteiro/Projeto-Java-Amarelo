package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Menu implements Opcao {
	Scanner entrada = new Scanner(System.in);
	int opcao;

	@Override
	public void menuInicio() {
		//72 CARACTERES
		System.out.println("\n********************************* MENU *********************************\n");
		System.out.println("Escolha a op��o que mais se enquadra:" + "\n[1]Usu�rio" + "\n[2]M�dico");
		//System.out.println("\nOp��o: ");
		opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			MenuUsuario menuUsuario = new MenuUsuario();
			menuUsuario.menuUsuario();
			break;

		case 2:
			LoginDoProfissional login = new LoginDoProfissional();
			login.login();
			break;

		default:
			// chamar M�todo de limpar console
			System.out.println("Op��o v�lida!");
			menuInicio();
		}

		entrada.close();
	}

	@Override
	public void menuUsuario() {
		// TODO Auto-generated method stub
		
	}

}
