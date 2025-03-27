package assessment.projeto3;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

// Calculadora de Impostos
public class CalculadoraDeImpostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        boolean nomeValido = false;
        do {
            System.out.println("Digite o nome do funcionário: ");
            nome = scanner.nextLine();

            if (nome.trim().isEmpty()) {
                System.out.println("Nome inválido. O nome não pode ser vazio.");
            } else {
                nomeValido = true;
            }
        } while(!nomeValido);

    // ------------------------------------------------
        // Salário Mensal
        double salarioMensal = -1;
        boolean salarioValido = false;
        do {
            System.out.println("Digite o salário mensal do funcionário: ");

            try {
                salarioMensal = scanner.nextDouble();

                if (salarioMensal <= 0) {
                    System.out.println("Salário inválido. O salário não pode ser zero ou negativo.");
                } else {
                    salarioValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Salário inválido. O salário deve ser um valor positivo.");
                scanner.nextLine();
            }
        }
        while(!salarioValido);

    // ------------------------------------------------
        // Cálculo do Imposto
        double salarioAnual = salarioMensal * 12;
        double imposto = 0;

        DecimalFormat df = new DecimalFormat("0.00");
        
        if (salarioAnual <= 22847.76) {
            System.out.println("Valor do imposto: Insento de imposto");
            System.out.println("Salário Líquido: " + salarioMensal);
        } else if (salarioAnual <= 33919.80 ) {
            imposto = salarioMensal * 0.075;

            System.out.println("Valor do imposto: " + df.format(imposto));
            System.out.println("Salário Líquido: " + df.format(salarioMensal - imposto));
        } else if (salarioAnual < 45012.60) {
            imposto = salarioMensal * 0.15;
            System.out.println("Valor do imposto: " + df.format(imposto));
            System.out.println("Salário Líquido: " + df.format(salarioMensal - imposto));
        } else {
            imposto = salarioMensal * 0.275;
            System.out.println("Valor do imposto: " + df.format(imposto));
            System.out.println("Salário Líquido: " + df.format(salarioMensal - imposto ));
        }
    }
}
