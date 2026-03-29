package br.edu.fatecpg.Produto.view;

import br.edu.fatecpg.Produto.model.Produto;
import java.util.Scanner;

public class ProdutoView {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Produto produtos = new Produto();
    System.out.println("\n===FATEC SHOPS===\n");

    System.out.print("Nome do produto: ");
    produtos.setNome(sc.nextLine());

    System.out.print("Preço do produto: ");
    boolean precoOk = produtos.setPreco(sc.nextDouble());
    sc.nextLine();
    if (!precoOk)
      System.out.println("Error! Nao é permitido números negativos");

    System.out.print("Quantidade de " + produtos.getNome() + " :");
    produtos.setQtdEstoque(sc.nextInt());
    sc.nextLine();

    System.out.print("\n===INFOS DO PRODUTO===\n");

    System.out.println(
        "Nome do produto: "
            + produtos.getNome()
            + " \n"
            + "Preço do prosuto: "
            + produtos.getPreco()
            + "\n"
            + "Quantidade de produto no estoque: "
            + produtos.getQtdEstoque()
            + "");

    sc.close();
  }
}
