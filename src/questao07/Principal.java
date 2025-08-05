package questao07;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] lados = new double[3];
        boolean eTriangulo;
        do {
            // Entrada
            for (int i = 0; i < 3; i++) {
                System.out.printf("Insira o %dº lado do triângulo: ", i + 1);
                lados[i] = s.nextDouble();
            }

            // Verifica sé é um triângulo pelo comprimento dos lados
            eTriangulo = true;
            for (int i = 0; i < 3; i++) {
                if (lados[i] > lados[(i + 1) % 3] + lados[(i + 2) % 3]) {
                    eTriangulo = false;
                    System.out.println("Não é um triângulo!");
                    break;
                }
            }
        } while(!eTriangulo);

        // Verifica o tipo do triângulo
        if (lados[0] == lados[1] && lados[0] == lados[2])
            System.out.println("Equilátero");
        else if (lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2])
            System.out.println("Isóceles");
        else
            System.out.println("Escaleno");
    }
}