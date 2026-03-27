package br.edu.fatecpg.RH.view;
import br.edu.fatecpg.RH.model.FuncionarioModel;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.print("Salário inicial: ");
        double sal = sc.nextDouble();

        FuncionarioModel func = new FuncionarioModel(nome, sal);

        System.out.print("Digite o percentual de aumento: ");
        func.aplicarAumento(sc.nextDouble());

        System.out.println("\nFuncionário: " + func.getNome());
        System.out.printf("Novo Salário Mensal: %.2f%n", func.getSalario());
        System.out.printf("Salário Anual: %.2f%n", func.calcularSalarioAnual());
        sc.close();
    }
}