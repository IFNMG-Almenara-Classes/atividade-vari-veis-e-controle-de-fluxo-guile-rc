package questao13;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int opcao;
        while (true) {
            imprimirMenu();
            opcao = s.nextInt();

            if (opcao == 5)
                break;

            System.out.print("\nDigite o 1º número: ");
            int num1 = s.nextInt();
            System.out.print("Digite o 2º número: ");
            int num2 = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                default:
                    break;
            }

            System.out.println();
        }


    }

    public static void imprimirMenu() {
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.println();
    }
}
