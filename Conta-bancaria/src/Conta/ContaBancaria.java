package Conta;

public class ContaBancaria {
    private double saldo;
    private static final double TAXA_SAQUE = 1.50;

    public ContaBancaria(double SaldoInicial) {
        this.saldo = SaldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso");
        } else {
            System.out.println("Erro: o valor depositado deve ser positivo!");
        }
    }
    public void sacar(double valor) {
        double totalSaque = valor + TAXA_SAQUE;
        if (valor > 0 && saldo >= totalSaque) {
            saldo -= totalSaque;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            System.out.println("taxa de operacao de R$ " + TAXA_SAQUE + " aplicada!");
        } else {
            System.out.println("Erro: saldo insuficiente ou valor invalido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
