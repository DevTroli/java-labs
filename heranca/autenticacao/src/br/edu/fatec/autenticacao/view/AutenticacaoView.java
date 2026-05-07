package br.edu.fatec.autenticacao.view;

import java.util.Scanner;
import br.edu.fatec.autenticacao.model.SistemaDeSeguranca;

public class AutenticacaoView {

	private Scanner sc = new Scanner(System.in);
	private SistemaDeSeguranca sistema = new SistemaDeSeguranca();

	public void executar() {
		fazerLogin();
		oferecerLogout();
		sc.close();
	}

	private void fazerLogin() {
		while (!sistema.isAutenticado()) {
			System.out.print("Usuario: ");
			String usuario = sc.nextLine();

			System.out.print("Senha: ");
			String senha = sc.nextLine();

			if (sistema.login(usuario, senha)) {
				System.out.println("Bem-vindo, " + usuario + "!");
			} else {
				System.out.println("Usuario ou senha incorretos. Tente novamente.\n");
			}
		}
	}

	private void oferecerLogout() {
		System.out.print("\nDeseja fazer logout? (s/n): ");
		String resposta = sc.nextLine();

		if (resposta.equals("s")) {
			sistema.logout();
		}
	}
}