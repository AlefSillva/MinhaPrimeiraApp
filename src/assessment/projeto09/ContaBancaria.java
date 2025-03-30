package assessment.projeto09;

public class ContaBancaria {
    String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // ----------Métodos de Acesso----------
    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    double exibirSaldo() {
        return saldo;
    }
}
