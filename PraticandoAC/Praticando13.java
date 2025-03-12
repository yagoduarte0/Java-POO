package PraticandoAC;
import java.util.Scanner;

public class Praticando13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int n = scanner.nextInt();

        double somaNotas = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / n;

        System.out.printf("\nMédia da turma: %.2f\n", media);

        scanner.close();
    }
}   