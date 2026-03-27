package br.edu.fatecpg.carro.view;

import br.edu.fatecpg.carro.model.Carro;
import java.util.Scanner;

public class CarroView {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Marca: ");
    String marca = sc.nextLine();
    System.out.print("Consumo (km/l): ");
    double consumo = sc.nextDouble();
    System.out.print("Combustível atual (L): ");
    double combustivel = sc.nextDouble();

    Carro carro = new Carro(marca, consumo, combustivel);

    System.out.printf("Autonomia atual: %.1f km%n", carro.calcularAutonomia());

    System.out.print("Simular viagem (km): ");
    double km = sc.nextDouble();

    if (carro.simularViagem(km)) {
      System.out.printf(
          "Viagem realizada! Combustível restante: %.2f L%n", carro.getCombustivelAtual());
    } else {
      System.out.println("Combustível insuficiente para essa viagem.");
    }

    System.out.print("Litros para abastecer: ");
    double litros = sc.nextDouble();
    carro.abastecer(litros);
    System.out.printf(
        "Após abastecimento: %.2f L — Autonomia: %.1f km%n",
        carro.getCombustivelAtual(), carro.calcularAutonomia());

    sc.close();
  }
}
