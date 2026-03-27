package br.edu.fatecpg.viagem.view;

import br.edu.fatecpg.viagem.model.Viagem;
import java.util.Scanner;

public class ViagemView {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Distância (km): ");
    double distancia = sc.nextDouble();
    System.out.print("Consumo do carro (km/l): ");
    double consumo = sc.nextDouble();
    System.out.print("Preço do combustível (R$/L): ");
    double preco = sc.nextDouble();

    Viagem viagem = new Viagem(distancia, consumo, preco);

    System.out.printf("Litros necessários: %.2f L%n", viagem.calcularLitrosNecessarios());
    System.out.printf("Custo total        : R$ %.2f%n", viagem.calcularCustoTotal());

    sc.close();
  }
}
