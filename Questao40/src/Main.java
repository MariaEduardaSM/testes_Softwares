import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int somaImpares = 0;
        int somaTotal = 0;

        System.out.print("Digite a quantidade de números: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            somaTotal += numero;

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
                somaImpares += numero;
            }
        }

        double media = (double) somaTotal / n;

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
        System.out.println("Média entre todos os números: " + media);
        System.out.println("Soma dos números ímpares: " + somaImpares);
    }
}