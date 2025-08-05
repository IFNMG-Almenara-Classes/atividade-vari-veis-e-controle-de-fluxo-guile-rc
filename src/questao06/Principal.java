package questao06;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int menor = 0;
        int entrada;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira o %dº número: ", i + 1);

            entrada = s.nextInt();

            if (i == 0)
                menor = entrada;

            if (entrada < menor)
                menor = entrada;
        }

        System.out.println("Menor: " + menor);
    }
}
