package questao05;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o número de laranjas: ");
        int laranjas = s.nextInt();

        double preco;
        if (laranjas < 12)
            preco = laranjas * 0.50;
        else
            preco = laranjas * 0.30;

        System.out.printf("Valor total: R$%.2f", preco);
    }
}
