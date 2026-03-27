package br.edu.fatecpg.escola.view;
import br.edu.fatecpg.escola.model.AlunoModel;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        AlunoModel aluno = new AlunoModel(nome, n1, n2, n3);

        System.out.println("\n--- Boletim ---");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.printf("Média: %.2f%n", aluno.calcularMedia());
        System.out.println("Situação: " + aluno.getSituacao());
        sc.close();
    }
}