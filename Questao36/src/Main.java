import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int[] numeros = new int[15];
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite 15 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = imput.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é " + maior + ".");
    }
    
    public static int maiorNumero(int[] numeros) {
        int maior = Integer.MIN_VALUE;
        
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        
        return maior;
    }
}