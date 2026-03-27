package br.edu.fatecpg.estoque.view;
import br.edu.fatecpg.estoque.model.ProdutoModel;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade inicial: ");
        int qtd = sc.nextInt();

        ProdutoModel prod = new ProdutoModel(nome, preco, qtd);

        System.out.print("Quantidade de entrada: ");
        prod.entrada(sc.nextInt());

        System.out.println("\n--- Status Estoque ---");
        System.out.println("Produto: " + prod.getNome());
        System.out.println("Quantidade: " + prod.getQuantidade());
        System.out.printf("Valor Total: %.2f%n", prod.calcularTotal());
        sc.close();
    }
}