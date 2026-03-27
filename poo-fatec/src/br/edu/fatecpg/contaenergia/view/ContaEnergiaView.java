package br.edu.fatecpg.contaenergia.view;

import br.edu.fatecpg.contaenergia.model.ContaEnergia;
import java.util.Scanner;

public class ContaEnergiaView {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Consumo (kWh): ");
    double kwh = sc.nextDouble();
    System.out.print("Valor por kWh (R$): ");
    double valor = sc.nextDouble();
    System.out.print("Percentual de desconto (%): ");
    double desconto = sc.nextDouble();

    ContaEnergia conta = new ContaEnergia(kwh, valor);

    System.out.printf("Valor total  : R$ %.2f%n", conta.calcularValorTotal());
    System.out.printf("Com desconto : R$ %.2f%n", conta.aplicarDesconto(desconto));

    sc.close();
  }
}
