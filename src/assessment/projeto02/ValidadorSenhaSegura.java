package assessment.projeto02;
import java.util.Scanner;

public class ValidadorSenhaSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de cadastro!");
        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        while (nome.trim().isEmpty()) {
            System.out.println("O campo nome não pode estar vazio. Tente novamente.");
            nome = scanner.nextLine();
        }

        boolean senhaValida = false;
        String senha = "";

        while (!senhaValida) {
            System.out.println("Digite a sua senha que contenha no mínimo 8 caracteres: ");
            senha = scanner.nextLine();

            if (senha.length() < 8) {
                System.out.println("\nA senha deve ter no mínimo 8 caracteres.");
            } else if (senha.equals(senha.toLowerCase())) {
                System.out.println("\nA senha deve conter pelo menos uma letra maiúscula.");
            } else if (!senha.matches(".*[0-9].*")) {
                System.out.println("\nA senha deve conter pelo menos um número.");
            } else if (!senha.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
                System.out.println("\nA senha deve conter pelo menos um caractere especial (@, #, $, etc.).");
            } else {
                senhaValida = true;
                System.out.println("\nCadastro realizado com sucesso!");
            }
        }
    }
}
