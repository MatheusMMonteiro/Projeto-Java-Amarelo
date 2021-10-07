package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class MenuUsuario implements Opcao {

	@Override
	public void menuUsuario() {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		System.out.println("\n*************************** MENU DO USU�RIO ****************************\n");

		System.out
				.println("Escolha a op��o que mais se enquadra:" + "\n[1]Procedimento de Agendamento de Consulta no SUS"
						+ "\n[2]Cadastrar seus dados na base" + "\n[3]Preven��o ao suic�dio");
		// System.out.println("\nOp��o: ");
		opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			Option1Sus option1 = new Option1Sus();
			option1.ApresentaOp();
			break;

		case 2:
			Cadastro option2 = new Cadastro();
			option2.cadastrando();
			break;

		case 3:
			Option3Prevencao prevencao = new Option3Prevencao();
			prevencao.menuPrevencao();
			break;
		default:
			// chamar M�todo de limpar console
			System.out.println("Op��o v�lida!");
			menuUsuario();

		}
		entrada.close();
	}

	@Override
	public void menuInicio() {
		// TODO Auto-generated method stub

	}

}
