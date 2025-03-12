package PraticandoAC;
import java.util.Scanner;

public class Praticando10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor inferior do intervalo: ");
        int inferior = scanner.nextInt();

        System.out.print("Digite o valor superior do intervalo: ");
        int superior = scanner.nextInt();

        if (n > superior) {
            System.out.print("O valor esta DEPOIS do intervalo!");
        } else if (n < inferior) {
            System.out.print("O valor esta ANTES do intervalo!");
        } else {
            System.out.print("O valor esta DENTRO do intervalo!");
        }
        
        scanner.close();
    }
}   