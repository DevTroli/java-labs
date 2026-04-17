package br.edu.fatec.aluno.view;

import br.edu.fatec.aluno.model.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Matricula: ");
        aluno.setMatricula(scanner.nextInt());

        System.out.print("Nota final: ");
        aluno.setNotaFinal(scanner.nextDouble());

        System.out.println("\nAluno cadastrado:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Nota final: " + aluno.getNotaFinal());

        scanner.close();
    }
}
