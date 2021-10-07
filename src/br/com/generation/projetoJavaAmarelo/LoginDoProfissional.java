package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class LoginDoProfissional extends Dados {

	public void login() { // s� pode ter um main por projeto. � a parte principal dele

		Dados dados1 = new Dados();
		Scanner entrada = new Scanner(System.in);

		int tentativas = 1;
		String senhaInformada;
		String emailInformado;
		System.out.println("\n************************ LOGIN DO PROFISSIONAL *************************\n");

		while (tentativas <= 3) {

			System.out.println("Insira seu e-mail:");
			emailInformado = entrada.next();
			dados1.setEmailInformado(emailInformado);

			System.out.println("Digite a senha:");
			senhaInformada = entrada.next();
			dados1.setSenhaInformada(senhaInformada);

			if (emailInformado.equals(dados1.getEmailMedicoLegal())
					&& senhaInformada.equals(dados1.getSenhaMedicoLegal())) {
				// Strings n�o s�o do tipo primitivo,
				// ent�o para compar�-las, se usa o
				// .equals()

				System.out.println("Bem vindo.");
				ListaPacientes imprimir = new ListaPacientes();
				imprimir.imprimir();

				break;

			} else {
				System.out.println("E-mail ou senha incorretos, tente novamente.");
			}

		}

		entrada.close();
	}
}
