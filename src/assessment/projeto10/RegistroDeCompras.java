package assessment.projeto10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroDeCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o arquivo de compras
        criarArquivo();

        // Cadastrando compras
        for (int i = 0; i < 3; i++) {
            Compra compra = cadastrarCompras(scanner, i + 1);
            escreverArquivo(compra);
        }

        // Lendo o arquivo de compras
        System.out.println("Conteúdo do arquivo de compras:");
        lerArquivo();

    }

    public static void criarArquivo() {
        String nomeArquivo = "src/assessment/projeto10/compras.txt";
        try {
            File file = new File(nomeArquivo);
            if (file.createNewFile()) {
                System.out.println("Arquivo criado: " + nomeArquivo);
            } else {
                System.out.println("Arquivo já existe: " + nomeArquivo);
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

    public static Compra cadastrarCompras(Scanner scanner, int numeroCompra) {
        System.out.println("Digite o nome do produto: " + numeroCompra + ":");
        String produto = scanner.nextLine();

        int quantidade = 0;
        boolean inputValido = false;


        while (!inputValido) {
            try {
                System.out.println("Digite a quantidade:");
                quantidade = scanner.nextInt();
                inputValido = true; // Se a quantidade for válida, sai do loop
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Por favor, insira um número inteiro para a quantidade.");
                scanner.nextLine(); // Limpa o buffer
            }
        }

        double precoUnitario = 0.0;
        inputValido = false;

        // Valida o preço unitário
        while (!inputValido) {
            try {
                System.out.println("Digite o preço unitário:");
                precoUnitario = scanner.nextDouble();  // Usa o ponto como separador decimal
                inputValido = true; // Se o preço for válido, sai do loop
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Por favor, insira um número válido para o preço.");
                scanner.nextLine(); // Limpa o buffer
            }
        }
        scanner.nextLine();

        return new Compra(produto, quantidade, precoUnitario);
    }

    public static void escreverArquivo(Compra compra) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("src/assessment/projeto10/compras.txt", true);  // Append mode

            // Escrevendo os dados no arquivo
            writer.write("Produto: " + compra.produto + "\n");
            writer.write("Quantidade: " + compra.quantidade + "\n");
            writer.write("Preço Unitário: " + compra.precoUnitario + "\n");
            writer.write("------------------------------------------\n");
            System.out.println("Compra registrada com sucesso: " + compra.produto + "\n");  // Mensagem de depuração

        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                    System.out.println("Arquivo fechado com sucesso.");  // Mensagem de depuração
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }


    public static void lerArquivo() {
        String nomeArquivo = "src/assessment/projeto10/compras.txt"; // Caminho absoluto do arquivo
        try {
            File file = new File(nomeArquivo);
            if (!file.exists()) {
                System.out.println("O arquivo não existe.");
                return;
            }

            Scanner scanner = new Scanner(file);
            System.out.println("\nCompras registradas no arquivo:");
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
