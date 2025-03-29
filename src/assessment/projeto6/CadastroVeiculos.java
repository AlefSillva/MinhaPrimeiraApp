package assessment.projeto6;

class Veiculo {
    String placa;
    String modelo;
    int anoDeFabricacao;
    double quilometragem;

    Veiculo(String placa, String modelo, int anoDeFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.quilometragem = quilometragem;
    }

    //-------------------Métodos-------------------
    void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoDeFabricacao);
        System.out.println("Quilometragem: " + quilometragem);
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.println("Viagem registrada! Quilometragem atual: " + quilometragem + " km.");
        } else {
            System.out.println("A quilometragem da viagem deve ser positiva.");
        }
    }
}

public class CadastroVeiculos {
    public static void main(String[] args) {
        // ------- Criando instâncias de Veiculos ---------
        Veiculo veiculo1 = new Veiculo("ABC1234", "HB20", 2017, 38000);
        Veiculo veiculo2 = new Veiculo("XYZ5678", "Civic", 2019, 25000);

        // ---------- Exibindo detalhes dos veículos ----------
        System.out.println("Detalhes do Veículo 1:");
        veiculo1.exibirDetalhes();

        System.out.println("\nDetalhes do Veículo 2:");
        veiculo2.exibirDetalhes();

        // ---------- Registrando viagens ----------
        System.out.println("\nRegistrando viagem no Veículo 1:");
        veiculo1.registrarViagem(150);

        System.out.println("\nRegistrando viagem no Veículo 2:");
        veiculo2.registrarViagem(200);

        // ---------- Exibindo detalhes após registrar viagens ----------
        System.out.println("\nDetalhes do Veículo 1 após viagem:");
        veiculo1.exibirDetalhes();

        System.out.println("\nDetalhes do Veículo 2 após viagem:");
        veiculo2.exibirDetalhes();

    }
}
