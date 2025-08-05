package questao17;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int entrada = s.nextInt();
        System.out.println("O fatorial de " + entrada + " é " + fatorial(entrada));
    }

    public static int fatorial(int entrada) {
        return (entrada <= 1) ? 1 : entrada * fatorial(entrada - 1);
    }
}
