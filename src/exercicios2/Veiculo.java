package exercicios2;

public class Veiculo {
    // Atributos
    private String modelo;
    private String placa;
    private int ano;
    private boolean estaAlugado;
    private double quilometragem;

    // Construtor
    public Veiculo(String modelo, String placa, int ano, double quilometragem) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.estaAlugado = false; // começa disponível
    }

    // Método para alugar veículo
    public void alugar() {
        if (!estaAlugado) {
            estaAlugado = true;
            System.out.println("Veículo " + modelo + " (" + placa + ") foi alugado com sucesso!");
        } else {
            System.out.println("Veículo " + modelo + " já está alugado.");
        }
    }

    // Método para devolver veículo
    public void devolver(double kmRodados) {
        if (estaAlugado) {
            estaAlugado = false;
            quilometragem += kmRodados;
            System.out.println("Veículo " + modelo + " devolvido. Km rodados: " + kmRodados +
                    ". Quilometragem atual: " + quilometragem + " km.");
        } else {
            System.out.println("Veículo " + modelo + " não estava alugado.");
        }
    }

    // Método para exibir status do veículo
    public void exibirStatus() {
        System.out.println("===== Veículo =====");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Status: " + (estaAlugado ? "Alugado" : "Disponível"));
        System.out.println("==================");
    }
}
