package br.edu.fatecpg.Carro.view;

import br.edu.fatecpg.Carro.model.Carro;
import java.util.Scanner;

public class CarroView {
  public static void cadastrarCarro(Carro carro, Scanner sc) {
    System.out.print("Marca: ");
    carro.setMarca(sc.nextLine());

    System.out.print("Modelo: ");
    carro.setModelo(sc.nextLine());

    System.out.print("Placa: ");
    carro.setPlaca(sc.nextLine());

    System.out.print("Ano: ");
    carro.setAno(sc.nextInt());

    System.out.print("Cilindradas: ");
    carro.setCc(sc.nextDouble());

    System.out.print("Capacidade do Tanque: ");
    carro.setCapacidadeTanque(sc.nextDouble());

    System.out.print("Tem ar-condicionado (true/false): ");
    carro.setAc(sc.nextBoolean());
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("\n===CADASTRE SEU CARRO===");

    // 1° Instancia
    Carro meuCarro = new Carro();
    cadastrarCarro(meuCarro, sc);

    System.out.println("\n===INFOS DO CARRO===\n");

    meuCarro.infos();

    System.out.println("\n===Funçoes do carro===");

    meuCarro.ignicao();
    meuCarro.buzinar();
    meuCarro.desligar();

    System.out.println("\n===ABASTECIMENTO===");
    System.out.print("\nPreço da gasolina: ");
    double preco = sc.nextDouble();
    double custo = meuCarro.CalculoEncherTanque(preco);

    System.out.println("Custo para encher o tanque: R$ " + custo);
    sc.close();
  }
}
