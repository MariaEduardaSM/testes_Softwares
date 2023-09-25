import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);
    System.out.print("Digite a idade: ");
    int idade = imput.nextInt();
    System.out.println(verificarIdade(idade));
  }

  public static String verificarIdade(int idade) {
    if (idade < 16) {
      return "Você não pode votar nem dirigir.";
    } else if (idade >= 16 && idade <= 17) {
      return "Você pode votar, mas não pode dirigir.";
    } else {
      return "Você pode votar e dirigir.";
    }
  }
}