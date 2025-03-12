package PraticandoAC;
import java.util.Scanner;

public class Praticando8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de kilowatts consumidos em uma casa: ");
        double consumoKilowatt = scanner.nextDouble();

        System.out.print("Digite o valor do KiloWatt: ");
        double valorKilowatt = scanner.nextDouble();

        double consumo = consumoKilowatt * valorKilowatt;

        if (consumoKilowatt < 150) {
            double desconto = consumo * 0.10;
            consumo -= desconto;
            System.out.println("\nDesconto de 10% aplicado (R$ " + desconto + ")");
        }

        System.out.printf("Valor a ser pago: R$ %.2f\n", consumo);

        scanner.close();
    }
}   