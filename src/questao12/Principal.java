package questao12;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int entrada = 0;
        int media = 0;
        int contador = 0;
        do {
            System.out.print("Insira um número: ");
            entrada = s.nextInt();
            media += entrada;
            contador++;
        } while (entrada != 0);

        System.out.println("\nA média é: " + media / contador);
    }
}
