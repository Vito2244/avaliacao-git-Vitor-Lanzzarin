import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("CALCULADORA LEGAL 2.0 \n ");

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Escolha entre adição (1) e multiplicação (2): ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            double adicao = numero1 + numero2;
            System.out.printf("O resultado da adição é: " + adicao);
        } else if (escolha == 2) {
            double multiplicacao = numero1 * numero2;
            System.out.printf("O resultado da multiplicação é: " + multiplicacao);
        }
    }
}
