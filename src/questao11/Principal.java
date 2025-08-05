package questao11;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int entrada;
        do {
            System.out.print("Insira um número positivo: ");
            entrada = s.nextInt();
        } while(entrada < 0);

        System.out.println();
        for (int i = 0; i <= entrada; i += 2)
            System.out.println(i);
    }
}
