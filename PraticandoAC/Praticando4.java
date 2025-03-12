package PraticandoAC;
import java.util.Scanner;

public class Praticando4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Raio do circulo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("\nResultados:");
        System.out.println("Area: " + area);

        scanner.close();
    }
}