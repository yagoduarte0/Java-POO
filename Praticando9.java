import java.util.Scanner;

public class Praticando9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero Real: ");
        double x = scanner.nextDouble();

        int parteInteira = (int) x;
        double parteDecimal = x - parteInteira;

        int arredondado;

        if (x < 0) {
            if (parteDecimal <= -0.5) {
                arredondado = parteInteira - 1;
            } else {
                arredondado = parteInteira;
            }
        } else {
            if (parteDecimal >= 0.5) {
                arredondado = parteInteira + 1;
            } else {
                arredondado = parteInteira;
            }
        }

        System.out.println("Número arredondado: " + arredondado);

        scanner.close();
    }
}   