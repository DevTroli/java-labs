package br.edu.fatecpg.vendedor.view;

import br.edu.fatecpg.vendedor.model.Vendedor;
import java.util.Scanner;

public class VendedorView {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nome do vendedor: ");
    String nome = sc.nextLine();
    System.out.print("Total de vendas (R$): ");
    double vendas = sc.nextDouble();
    System.out.print("Percentual de comissão (%): ");
    double comissao = sc.nextDouble();

    Vendedor vendedor = new Vendedor(nome, vendas, comissao);

    System.out.printf("Vendedor     : %s%n", vendedor.getNome());
    System.out.printf("Comissão     : R$ %.2f%n", vendedor.calcularComissao());
    System.out.printf("Salário final: R$ %.2f%n", vendedor.calcularSalarioFinal());

    sc.close();
  }
}
