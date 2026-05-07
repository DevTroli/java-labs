package br.edu.fatec.Veiculos.view;

import java.util.Scanner;
import br.edu.fatec.Veiculos.model.Veiculo;
import br.edu.fatec.Veiculos.model.Carro;
import br.edu.fatec.Veiculos.model.Bicicleta;

public class VeiculosView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos veículos deseja criar? ");
        int qtd = Integer.parseInt(sc.nextLine());

        Veiculo[] veiculos = new Veiculo[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.print("Veículo " + (i + 1) + " - tipo (carro/bicicleta): ");
            String tipo = sc.nextLine().trim().toLowerCase();

            if (tipo.equals("carro")) {
                veiculos[i] = new Carro();
            } else {
                veiculos[i] = new Bicicleta();
            }
        }

        System.out.println("\n--- Movendo veículos ---");
        for (Veiculo v : veiculos) {
            v.mover();
        }

        sc.close();
    }
}