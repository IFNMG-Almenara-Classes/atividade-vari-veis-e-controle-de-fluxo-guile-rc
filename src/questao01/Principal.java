package questao01;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o 1º número: ");
        int num1 = s.nextInt();
        System.out.print("Insira o 2º número: ");
        int num2 = s.nextInt();

        int maiorNumero = Math.max(num1, num2);
        System.out.println("O maior número é " + maiorNumero);

        s.close();
    }
}