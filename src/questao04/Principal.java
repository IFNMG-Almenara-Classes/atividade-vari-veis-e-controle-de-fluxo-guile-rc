package questao04;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int senha = 1234;
        int entrada;
        do {
            System.out.print("Digite a senha: ");
            entrada = s.nextInt();

            if (entrada != senha)
                System.out.println("ACESSO NEGADO");
        } while (entrada != senha);

        System.out.println("ACESSO PERMITIDO");
    }
}
