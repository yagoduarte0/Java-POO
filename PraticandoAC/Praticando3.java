package PraticandoAC;
import java.util.Scanner;

public class Praticando3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        double percentualAumento = scanner.nextDouble();

        double aumento = salario * (percentualAumento / 100);
        double novoSalario = salario + aumento;

        System.out.println("\nResultados:");
        System.out.println("Aumento: " + aumento);
        System.out.println("Novo salario: " + novoSalario);

        scanner.close();

    }
}