package PraticandoAC;
import java.util.Scanner;

public class Praticando14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeAlunos = 0;
        double somaNotas = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;

        while (true) {
            System.out.print("Digite a nota do aluno (ou -1 para encerrar): ");
            double nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            // Atualiza estatísticas
            somaNotas += nota;
            quantidadeAlunos++;

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        if (quantidadeAlunos == 0) {
            System.out.println("\nNenhuma nota foi registrada.");
        } else {
            double media = somaNotas / quantidadeAlunos;

            // Resultados finais
            System.out.println("\nQuantidade de alunos: " + quantidadeAlunos);
            System.out.printf("Média da turma: %.2f\n", media);
            System.out.printf("Maior nota: %.2f\n", maiorNota);
            System.out.printf("Menor nota: %.2f\n", menorNota);
        }

        scanner.close();
    }
}   