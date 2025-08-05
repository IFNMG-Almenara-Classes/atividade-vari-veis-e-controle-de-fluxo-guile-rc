package questao16;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o número a ser multiplicado: ");
        int multiplicando = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d × %d = %d\n", i, multiplicando, multiplicando * i);
        }
    }
}
