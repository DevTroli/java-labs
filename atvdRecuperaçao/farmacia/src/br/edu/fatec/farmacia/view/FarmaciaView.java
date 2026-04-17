package br.edu.fatec.farmacia.view;

import br.edu.fatec.farmacia.model.Farmacia;
import java.util.Scanner;

public class FarmaciaView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Farmacia farmacia = new Farmacia();
        int opcao;

        while (true) {
            System.out.println("\n=== FARMÁCIA VIDASAÚDE ===");
            System.out.println("1. Cadastrar medicamento");
            System.out.println("2. Mostrar todos os medicamentos");
            System.out.println("3. Média de dias para vencimento");
            System.out.println("4. Medicamentos próximos do vencimento");
            System.out.println("5. Aplicar desconto aos próximos do vencimento");
            System.out.println("6. Vender medicamento");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            if (opcao == 1) {
                System.out.print("Nome do medicamento: ");
                String nome = sc.nextLine();
                System.out.print("Dias para vencimento: ");
                int dias = sc.nextInt();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                sc.nextLine();

                if (farmacia.cadastrar(nome, dias, preco)) {
                    System.out.println("Medicamento cadastrado!");
                } else {
                    System.out.println("Erro: limite atingido.");
                }
            }

            else if (opcao == 2) {
                System.out.println("\n--- TODOS OS MEDICAMENTOS ---");
                for (int i = 0; i < farmacia.getQuantidade(); i++) {
                    System.out.println(farmacia.getNome(i) + " | " +
                        farmacia.getDiasVencimento(i) + " dias | R$ " +
                        farmacia.getPreco(i));
                }
            }

            else if (opcao == 3) {
                double media = farmacia.calcularMediaDiasVencimento();
                System.out.println("Média de dias: " + media);
            }

            else if (opcao == 4) {
                System.out.println("\n--- PRÓXIMOS DO VENCIMENTO ---");
                int[] indices = farmacia.indicesProximosVencimento();
                int total = farmacia.contarProximosVencimento();
                for (int i = 0; i < total; i++) {
                    int idx = indices[i];
                    System.out.println(farmacia.getNome(idx) + " | " +
                        farmacia.getDiasVencimento(idx) + " dias | R$ " +
                        farmacia.getPreco(idx));
                }
            }

            else if (opcao == 5) {
                farmacia.aplicarDescontoVencimento();
                System.out.println("Desconto de 50% aplicado!");
            }

            else if (opcao == 6) {
                System.out.print("Nome do medicamento: ");
                String nome = sc.nextLine();
                int indice = farmacia.buscarPorNome(nome);
                if (indice == -1) {
                    System.out.println("Não encontrado.");
                } else {
                    System.out.println("Vendido: " + farmacia.getNome(indice));
                    farmacia.vender(indice);
                }
            }

            else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}