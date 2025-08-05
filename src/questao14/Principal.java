package questao14;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor da pizza: R$");
        double valor = s.nextDouble();

        s.nextLine(); // Consumir a nova linha

        System.out.print("Qual é o tipo de cliente? (1. Comum; 2. VIP; 3. Funcionário): ");
        String tipoCliente = s.nextLine();

        double total = 0;
        switch (tipoCliente) {
            case "1":
                total = valor;
                break;
            case "2":
                total = valor * .95;
                break;
            case "3":
                total = valor * .90;
                break;
            default:
                System.out.println("Inválido!");
                System.exit(1);
                break;
        }

        System.out.printf("O valor total é R$%.2f\n", total);
    }
}