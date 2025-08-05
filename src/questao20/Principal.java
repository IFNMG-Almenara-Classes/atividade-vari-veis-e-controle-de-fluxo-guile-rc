package questao20;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int entrada = s.nextInt();

        if (entrada % 3 == 0 || entrada % 5 == 0) {
            if (!(entrada % 3 == 0 && entrada % 5 == 0)) {
                System.out.println("É divisível por 3 ou 5, mas não por ambos");
            }
        }
        System.out.println("Não atende às especificações");
    }
}
