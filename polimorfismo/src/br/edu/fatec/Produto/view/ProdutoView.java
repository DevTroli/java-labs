package br.edu.fatec.Produto.view;

import java.util.Scanner;
import br.edu.fatec.Produto.model.Produto;

public class ProdutoView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Produto - Sobrecarga de construtores ===");

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço (ou vazio para pular): ");
        String precoStr = sc.nextLine().trim();

        Produto p;
        if (precoStr.isEmpty()) {
            p = new Produto(nome);
        } else {
            double preco = Double.parseDouble(precoStr);

            System.out.print("Quantidade em estoque (ou vazio para pular): ");
            String qtdStr = sc.nextLine().trim();

            if (qtdStr.isEmpty()) {
                p = new Produto(nome, preco);
            } else {
                int qtd = Integer.parseInt(qtdStr);
                p = new Produto(nome, preco, qtd);
            }
        }

        System.out.println("\n--- Dados do produto ---");
        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço: R$ " + String.format("%.2f", p.getPreco()));
        System.out.println("Estoque: " + p.getQuantidadeEstoque() + " unidades");

        sc.close();
    }
}