import java.util.Scanner;

public class Praticando12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para A: ");
        int a = scanner.nextInt();

        System.out.print("Digite um valor para B: ");
        int b = scanner.nextInt();

        int inicio = Math.min(a, b);
        int fim = Math.max(a, b);

        int soma = 0;
        int quantidade = 0;

        System.out.println("\nNúmeros pares no intervalo " + inicio + " .. " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            soma += i;
            quantidade++;
        }

        double media = (double) soma / quantidade;

        System.out.println("\n\nSoma dos números no intervalo: " + soma);
        System.out.printf("Média dos números no intervalo: %.2f\n", media);

        scanner.close();
    }
}   