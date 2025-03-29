package assessment.projeto9;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João", 1000.0);

        // Testando o método exiibir Saldo
        System.out.println("Saldo inicial: " + conta1.exibirSaldo());
        conta1.exibirSaldo();

        // Testando o método depositar
        conta1.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta1.exibirSaldo());

        // Testando o método sacar
        conta1.sacar(200.0);

        // Exibiindo o saldo após as alterações
        System.out.println("Saldo após saque: " + conta1.exibirSaldo());
    }
}
