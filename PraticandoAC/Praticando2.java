package PraticandoAC;
import java.util.Scanner;

public class Praticando2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        float num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        float num2 = scanner.nextInt();

        float soma = num1 + num2;
        float subtracao = num1 - num2;
        float multiplicacao = num1 * num2;
        float divisao = num1 / num2;

        System.out.println("\nResultados:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scanner.close();
    }
}