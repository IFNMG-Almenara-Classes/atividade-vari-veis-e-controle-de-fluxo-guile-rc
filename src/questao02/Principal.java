package questao02;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o seu peso (kg): ");
        int peso = s.nextInt();
        System.out.print("Insira a sua altura (m): ");
        float altura = s.nextFloat();

        float imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc < 25) {
            System.out.println("Saudável");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        s.close();
    }
}
