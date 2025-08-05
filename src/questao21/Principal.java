package questao21;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira a idade: ");
        int idade = s.nextInt();
        System.out.print("Insira o tempo de serviço: ");
        int tempoDeServico = s.nextInt();

        if (idade >= 65 || tempoDeServico >= 30
                || (idade >= 60 &&  tempoDeServico >= 25)) {
            System.out.println("Apto a aposentar");
        } else {
            System.out.println("Não é apto a aposentar");
        }
    }
}
