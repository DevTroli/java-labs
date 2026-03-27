package br.edu.fatecpg.veiculos.view;
import br.edu.fatecpg.veiculos.model.CarroModel;
import java.util.Scanner;

public class Veiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marca do carro: ");
        String marca = sc.nextLine();
        System.out.print("Consumo (km/l): ");
        double cons = sc.nextDouble();
        System.out.print("Litros no tanque: ");
        double comb = sc.nextDouble();

        CarroModel carro = new CarroModel(marca, cons, comb);

        System.out.print("Distância da viagem (km): ");
        carro.viajar(sc.nextDouble());

        System.out.printf("Autonomia restante: %.2f km%n", carro.getAutonomia());
        sc.close();
    }
}