package PraticandoAC;
import java.util.Scanner;

public class Praticando5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em segundos: ");
        int t = scanner.nextInt();

        int horas = t / 3600;
        int minutos = t / 60;
        int segundos = t;

        System.out.println("\nResultados:");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        scanner.close();
    }
}    