import java.util.Scanner;

public class MaiorIdade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int idade, contador = 0;

    for (int i = 1; i <= 10; i++) {
      System.out.print("Digite a idade da pessoa " + i + ": ");
      idade = sc.nextInt();

      if (idade >= 18) contador++;
    }

    System.out.println("\nQuantidade de pessoas com 18 anos ou mais: " + contador);
    sc.close();
  }
}
