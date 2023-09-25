import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        double[] numeros = new double[5];
        int negativos = 0;

        System.out.println("Digite cinco números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = imput.nextDouble();
            if (numeros[i] < 0) {
                negativos++;
            }
        }

        System.out.println("Dos números digitados " + negativos + " são números negativos.");
    }
}