package br.edu.fatecpg.banco.view;
import br.edu.fatecpg.banco.model.ContaBancariaModel;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldoIni = sc.nextDouble();

        ContaBancariaModel conta = new ContaBancariaModel(nome, saldoIni);

        System.out.print("Valor para depósito: ");
        conta.depositar(sc.nextDouble());

        System.out.print("Valor para saque: ");
        conta.sacar(sc.nextDouble());

        System.out.println("\n--- Extrato ---");
        System.out.println("Titular: " + conta.getTitular());
        System.out.printf("Saldo Atual: %.2f%n", conta.getSaldo());
        sc.close();
    }
}