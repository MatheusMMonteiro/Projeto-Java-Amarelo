package br.com.generation.projetoJavaAmarelo;

import java.util.Scanner;

public class Option1Sus {

	public void ApresentaOp() { // vamos tentar colocar esse m�todo num m�todo "pai" (de uma superclasse) pra
								// sobrecarrega-lo dentro das Op1, 2 e 3;
		Menu menu = new Menu();
		Scanner entrada = new Scanner(System.in);
		int resp = 1;
		System.out.println("************************** CONSULTA NO SUS <3 **************************\n");

		while (resp == 1) {
			System.out.println("1 - TER O CART�O DO SUS: ");
			System.out.println("Sempre que voc� usa os servi�os do sistema �nico de sa�de, precisar� "
					+ "\napresentar seu cart�o/carteirinha. � gratuito e simples de conseguir:"
					+ "\nbasta ir at� uma unidade de sa�de com o seu RG ou outro documento de "
					+ "\nidentifica��o com foto."
					+ "Ap�s preencher um cadastro, sua carteirinha "
					+ "\nestar� impressa e voc� j� poder� ser atendido."
					+ "\n2 - IR AT� UMA UBS (Unidade b�sica de sa�de) OU CAPS(Centro de aten��o"
					+ "\npsicosocial): "
					+ "-Na UBS ou no CAPS voc� ser� direcionado para o acolhimento,"
					+ "\naonde um profissional far� uma triagem com diagn�stico inicial. -Ap�s "
					+ "\ntriagem voc� poder� ser encaminhado para um psic�logo que tratar� do seu "
					+ "\ncaso. Apenas casos grav�ssimos v�o pra hospitaliza��o. -Com a consulta "
					+ "\nmarcada, voc� receber� um papel com a data marcada de sua consulta. -Da� �"
					+ "\ns� aguardar o dia e comparecer no hor�rio correto da consulta.");
			System.out.println("\nDESEJA REPETIR A EXPLICA��O ? " + "\n[1]SIM " + "\n[2] N�O");
			resp = entrada.nextInt();
			if (resp == 2) {
				System.out.println("\nObrigado!" + "\nVoltando ao menu...");
				menu.menuInicio();
			}

		} // fechamento do while
		entrada.close();

	}// chave do ApresentaOp

}
