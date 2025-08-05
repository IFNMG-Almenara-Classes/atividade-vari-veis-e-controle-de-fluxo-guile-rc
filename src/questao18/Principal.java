package questao18;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o 1º número positivo: ");
        int num1 = s.nextInt();
        if (num1 < 1) {
            System.out.println("Inválido!");
            System.exit(1);
        }
        System.out.print("Insira o 2º número positivo: ");
        int num2 = s.nextInt();
        if (num2 < 1) {
            System.out.println("Inválido!");
            System.exit(1);
        }

        System.out.println("\nNúmeros primos: ");
        boolean ePrimo = false;
        for (int i = num1; i < num2; i++) {
            for (int j = 2; j <= i; j++) {
                ePrimo = true;
                if (i == j)
                    continue;
                if (i % j == 0) {
                    ePrimo = false;
                    break;
                }
            }
            if (ePrimo) {
                System.out.println(i);
            }
        }
    }
}
