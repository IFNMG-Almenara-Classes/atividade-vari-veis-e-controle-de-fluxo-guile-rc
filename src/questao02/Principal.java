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

        String estado;
        if (imc < 18.5) {
            estado = "Magreza";
        } else if (imc < 25) {
            estado = "Saudável";
        } else if (imc < 30) {
            estado = "Sobrepeso";
        } else if (imc < 35) {
            estado = "Obesidade Grau I";
        } else if (imc < 40) {
            estado = "Obesidade Grau II (Severa)";
        } else {
            estado = "Obesidade Grau III (Mórbida)";
        }

        System.out.printf("Seu IMC é %.1f e sua classificação: %s", imc, estado);
        s.close();
    }
}
