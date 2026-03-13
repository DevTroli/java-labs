import static java.lang.Math.sqrt;

import java.util.Scanner;

public class calculadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao;

    System.out.println("===Calculadora===");
    System.out.println("1 - Somar");
    System.out.println("2 - Substrair");
    System.out.println("3 - Multiplicar");
    System.out.println("4 - Dividir");
    System.out.println("5 - Raiz");
    System.err.print("\nEscolha 1-5: ");
    opcao = sc.nextInt();

    switch (opcao) {
      case 1:
        int soma1, soma2;
        System.out.print("\nDigite o primeiro numero: ");
        soma1 = sc.nextInt();
        System.out.print("\nDigite o segundo numero: ");
        soma2 = sc.nextInt();
        System.out.print("\nResultado da soma: " + somar(soma1, soma2));
        break;

      case 2:
        int num1, num2;
        System.out.print("\nDigite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.print("\nDigite o segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("\nResultado da soma: " + subtrair(num1, num2));
        break;

      case 3:
        int fator1, fator2;
        System.out.print("\nDigite o primeiro numero: ");
        fator1 = sc.nextInt();
        System.out.print("\nDigite o segundo numero: ");
        fator2 = sc.nextInt();
        System.out.print("\nResultado da soma: " + multiplicar(fator1, fator2));
        break;

      case 4:
        System.out.print("\nDigite o dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Digite o divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) System.out.println("Erro: Não existe divisão por zero!");
        else System.out.println("Resultado da divisão: " + dividir(dividendo, divisor));

        break;

      case 5:
        int raiz;
        System.out.print("\nDigite o primeiro numero: ");
        raiz = sc.nextInt();
        System.out.print("\nResultado da soma: " + raiz(raiz));
        break;

      default:
        System.out.println("Opçao Invalida! Tente novamente");
        break;
    }

    sc.close();
  }

  public static int somar(int n1, int n2) {
    int r = n1 + n2;
    return r;
  }

  public static int subtrair(int n1, int n2) {
    int r = n1 - n2;
    return r;
  }

  public static int multiplicar(int n1, int n2) {
    int r = n1 * n2;
    return r;
  }

  public static int dividir(int n1, int n2) {
    return (n2 == 0) ? 0 : n1 / n2;
  }

  public static double raiz(double n1) {
    double r = sqrt(n1);
    return r;
  }
}
