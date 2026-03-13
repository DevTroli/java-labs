import java.util.Scanner;

public class meses {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Digite número do mes (0 para sair): ");
    numero = sc.nextInt();

    while (numero != 0) {
      switch (numero) {
        case 1:
          System.out.println("\nJaneiro");
          break;
        case 2:
          System.out.println("\nFevereiro");
          break;
        case 3:
          System.out.println("\nMarço");
          break;
        case 4:
          System.out.println("\nAbril");
          break;
        case 5:
          System.out.println("\nMaio");
          break;
        case 6:
          System.out.println("\nJunho");
          break;
        case 7:
          System.out.println("\nJulho");
          break;
        case 8:
          System.out.println("\nAgosto");
          break;
        case 9:
          System.out.println("\nSetembro");
          break;
        case 10:
          System.out.println("\nOutubro");
          break;
        case 11:
          System.out.println("\nNovembro");
          break;
        case 12:
          System.out.println("\nDezembro");
          break;

        default:
          System.out.println("\nMês inválido!");
          break;
      }
      System.out.print("\nDigite um número (0 para sair): ");
      numero = sc.nextInt();
    }

    sc.close();
  }
}
