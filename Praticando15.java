import java.util.Scanner;

public class Praticando15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdVogais = 0;
        int qtdDigitos = 0;
        int qtdOutros = 0;

        char caractere;

        System.out.println("Digite os caracteres (digite '.' para encerrar):");

        while (true) {
            caractere = scanner.next().charAt(0);

            if (caractere == '.') {
                break;
            }

            // Verifica se é vogal
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') {
                qtdVogais++;
            }
            // Verifica se é dígito
            else if (caractere >= '0' && caractere <= '9') {
                qtdDigitos++;
            }
            // Caso contrário, é outro caractere
            else {
                qtdOutros++;
            }
        }

        // Exibe os resultados
        System.out.println("\nQuantidade de vogais: " + qtdVogais);
        System.out.println("Quantidade de dígitos: " + qtdDigitos);
        System.out.println("Quantidade de outros caracteres: " + qtdOutros);

        scanner.close();
    }
}   