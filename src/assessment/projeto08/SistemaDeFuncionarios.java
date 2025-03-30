package assessment.projeto08;

public class SistemaDeFuncionarios {
    public static void main(String[] args) {
        // Criando instâncias Gerente e Estagiario
        Funcionario gerente = new Gerente("Carlos", 5000);
        Funcionario estagiario = new Estagiario("Ana", 1500);

        // Exibindo os salários
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
        System.out.println("Salário do Estagiário: " + estagiario.calcularSalario());
    }
}
