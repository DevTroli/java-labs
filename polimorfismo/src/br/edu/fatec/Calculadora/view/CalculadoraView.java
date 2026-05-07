package br.edu.fatec.Calculadora.view;

import java.util.Scanner;
import br.edu.fatec.Calculadora.model.Calculadora;

public class CalculadoraView {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("=== Calculadora - Sobrecarga de somar() ===");

        System.out.print("Primeiro inteiro: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Segundo inteiro: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.print("Terceiro inteiro (ou vazio para pular): ");
        String terceiro = sc.nextLine().trim();

        if (terceiro.isEmpty()) {
            System.out.println("somar(" + a + ", " + b + ") = " + calc.somar(a, b));
        } else {
            int c = Integer.parseInt(terceiro);
            System.out.println("somar(" + a + ", " + b + ", " + c + ") = " + calc.somar(a, b, c));
        }

        System.out.print("Primeiro double: ");
        double d1 = Double.parseDouble(sc.nextLine());

        System.out.print("Segundo double: ");
        double d2 = Double.parseDouble(sc.nextLine());

        System.out.println("somar(" + d1 + ", " + d2 + ") = " + calc.somar(d1, d2));

        sc.close();
    }
}