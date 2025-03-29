package assessment.projeto7;

public class GerenciadorDeAlunos {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Alef", "123", 8.0, 7.5, 9.0);

        // Calcular a média
        double media = aluno1.calcularMedia();
        String mediaFormatada = String.format("%.2f", media);
        System.out.println("A média do aluno " + aluno1.nome + " é: " + mediaFormatada);

        // Verificar a aprovação
        aluno1.verificarAprovacao();
    }
}
