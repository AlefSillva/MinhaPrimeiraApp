package assessment.projeto11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimuladorLoteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------- SIMULADOR DE LOTERIA -------");
        int[] numerosEscolhidos = new int[6];

        for(int i = 0; i < numerosEscolhidos.length; i++){
            while (true) {
                try {
                    System.out.println("Digite o " + (i + 1) + "º número (entre 1 e 60): ");
                    int num = scanner.nextInt();

                    if(num < 1 || num > 60) {
                        System.out.println("Número inválido! Tente novamente.");
                    } else {
                        numerosEscolhidos[i] = num;
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite somente números inteiros.");
                    scanner.next();
                }
            }
        }

        int[] sorteados = new int[6];;
        for (int i = 0; i < sorteados.length; i++) {
            sorteados[i] = (int) (Math.random() * 60) + 1;
        }

        int acertos = 0;
        String numerosAcertados = "";

        System.out.println("\nNúmeros sorteados: ");
        for (int num : sorteados) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : numerosEscolhidos) {
            for (int numSort : sorteados) {
                if (num == numSort) {
                    acertos++;
                    numerosAcertados += num + " ";
                    break;
                }
            }
        }

        if (acertos > 0) {
            System.out.println("\nVocê acertou: " + acertos + " número(s): ");
            System.out.println("Número(s) acertado(s): " + numerosAcertados);
        } else {
            System.out.print("\nVocê não acertou nenhum número: ");
        }

    }
}
