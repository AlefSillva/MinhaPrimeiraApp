package assessment.projeto12;
import java.util.Scanner;

public class ChatSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        String[] mensagens = new String[10];

        for (int i = 0; i < 10; i++) {
            String usuarioNoMomento = (i % 2 == 0) ? usuario1 : usuario2;
            System.out.print("\n" + usuarioNoMomento + ", digite sua mensagem: ");
            mensagens[i] = usuarioNoMomento + ": " + scanner.nextLine();
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }
        System.out.println("-----------------------------------");
        System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês!");
    }
}
