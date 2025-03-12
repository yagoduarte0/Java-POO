package PraticandoAC;
import java.util.Scanner;

public class Praticando11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um caracter de operacao aritmetica ('+', '-', '*', '/'): ");
        char op = scanner.next().charAt(0);

        System.out.print("Digite um valor para A: ");
        double a = scanner.nextInt();

        System.out.print("Digite um valor para B: ");
        double b = scanner.nextDouble();

        double resultado;
        boolean operacaoValida = true;

        switch (op) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false;
                    resultado = 0;
                }
                break;
            default :
                System.out.println("Operação inválida!");
                operacaoValida = false;
                resultado = 0;
        }

         if (operacaoValida) {
            System.out.printf("%.2f %c %.2f = %.2f\n", a, op, b, resultado);
         }

        scanner.close();
    }
}   