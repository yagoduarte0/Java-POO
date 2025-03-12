package PraticandoAC;
import java.util.Scanner;

public class Praticando6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida por um carro: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo gasto: ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a quantidade de gasolina consumida: ");
        double gasolina = scanner.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double consumoMedioGasolina = gasolina / distancia;

        System.out.println("\nResultados:");
        System.out.println("Velocidade Media: " + velocidadeMedia);
        System.out.println("Consumo Medio de Gasolina: " + consumoMedioGasolina);

        scanner.close();
    }
}