package br.edu.fatec.associacao.view;

import br.edu.fatec.associacao.model.Empresa;
import java.util.Locale;
import java.util.Scanner;

public class AssociacaoView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o nome da empresa: ");
        String nomeEmpresa = sc.nextLine();

        Empresa empresa = new Empresa(nomeEmpresa);

        int opcao;
        do {
            System.out.println("\n===== " + empresa.getNome() + " =====");
            System.out.println("1 - Adicionar funcionário");
            System.out.println("2 - Adicionar cliente");
            System.out.println("3 - Exibir funcionários");
            System.out.println("4 - Exibir clientes");
            System.out.println("5 - Calcular folha salarial");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do funcionário: ");
                    String nomeFunc = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    System.out.print("Salário: R$ ");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    empresa.adicionarFuncionario(nomeFunc, cargo, salario);
                    break;

                case 2:
                    System.out.print("Nome do cliente: ");
                    String nomeCli = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    empresa.adicionarCliente(nomeCli, email);
                    break;

                case 3:
                    empresa.exibirFuncionarios();
                    break;

                case 4:
                    empresa.exibirClientes();
                    break;

                case 5:
                    empresa.calcularFolhaSalarial();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
