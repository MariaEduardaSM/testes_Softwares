import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = new int[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      vetor[i] = scanner.nextInt();
    }

    System.out.println("\n Os valores digitados são:");
    for (int i = 0; i < 5; i++) {
      System.out.println(vetor[i]);
    }
  }
}