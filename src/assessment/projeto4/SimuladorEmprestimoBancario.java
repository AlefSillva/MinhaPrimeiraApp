package assessment.projeto4;

import java.util.Scanner;

public class SimuladorEmprestimoBancario {
    public static void main(String[] args) {
        System.out.println("Simulador de Empréstimo Bancário");
        System.out.println("-------------------------------");

        Scanner scanner = new Scanner(System.in);
        String nomeCliente = "";
        double valorEmprestimo = 0;
        final double taxaJuros = 0.03;
        int numeroParcelas = 0;

        //-------------------Nome do Cliente----------------------
        while (true) {
            System.out.println("Digite o nome do cliente: ");
            nomeCliente = scanner.nextLine().trim();

            if (nomeCliente.isEmpty()) {
                System.out.println("O campo não pode estar vazio. Tente novamente.");
            } else if (nomeCliente.matches(".*\\d.*")) {
                System.out.println("O nome não pode conter números. Tente novamente.");
            } else {
                break;
            }
        }
        //---------------------------------------------------------

        //-------------------Valor do Empréstimo-------------------
        do {
            System.out.println("Digite o valor do empréstimo: ");
            valorEmprestimo = scanner.nextDouble();

            if (valorEmprestimo <= 0) {
                System.out.println("Valor do empréstimo inválido. Tente novamente.");
            }
        } while (valorEmprestimo <= 0);
        //---------------------------------------------------------

        //-------------------Número de Parcelas--------------------
        do {
            System.out.println("Digite o número de parcelas (mínimo 6, máximo 48): ");
            numeroParcelas = scanner.nextInt();

            if (numeroParcelas < 6 || numeroParcelas > 48) {
                System.out.println("Número de parcelas inválido. Tente novamente.");
            }
        } while (numeroParcelas < 6 || numeroParcelas > 48);
        //---------------------------------------------------------

        double valorParcela = (valorEmprestimo * (1 + taxaJuros * numeroParcelas)) / numeroParcelas;
        double valorTotal = valorParcela * numeroParcelas;

        System.out.println("Simulação de empréstimo para " + nomeCliente);

        System.out.println("Taxa de juros: " + (taxaJuros * 100) + "%");
        System.out.println("Valor da parcela: R$ " + String.format("%.2f", valorParcela));
        System.out.println("Valor total a pagar: R$ " + String.format("%.2f", valorTotal));

    }
}
