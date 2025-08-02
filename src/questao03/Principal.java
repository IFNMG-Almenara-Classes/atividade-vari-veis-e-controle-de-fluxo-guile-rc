package questao03;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = s.nextInt();

        System.out.println("O número " + numero + " é " + ((numero % 2 == 0) ? "par" : "ímpar"));
        s.close();
    }
}
