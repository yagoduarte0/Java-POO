package PraticandoAC;
import java.util.Scanner;

public class Praticando7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");

        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " eh par.");
        } else {
            System.out.println("O numero " + numero + " eh impar.");
        }

        scanner.close();
    }
}