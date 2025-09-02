package exercicios2;

public class Quarto {
    // Atributos
    private int numero;
    private String tipo; // simples, duplo, suíte
    private double precoPorNoite;
    private boolean estaOcupado;

    // Construtor
    public Quarto(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.estaOcupado = false; // por padrão, o quarto começa livre
    }

    // Método para reservar
    public void reservar() {
        if (!estaOcupado) {
            estaOcupado = true;
            System.out.println("Quarto " + numero + " (" + tipo + ") foi reservado com sucesso!");
        } else {
            System.out.println("Quarto " + numero + " já está ocupado.");
        }
    }

    // Método para liberar
    public void liberar() {
        if (estaOcupado) {
            estaOcupado = false;
            System.out.println("Quarto " + numero + " foi liberado.");
        } else {
            System.out.println("Quarto " + numero + " já está disponível.");
        }
    }

    // Método para calcular o valor total da estadia
    public double calcularValor(int dias) {
        return precoPorNoite * dias;
    }

    // Método para exibir informações do quarto
    public void exibirInfo() {
        System.out.println("===== Quarto " + numero + " =====");
        System.out.println("Tipo: " + tipo);
        System.out.println("Preço por noite: R$ " + precoPorNoite);
        System.out.println("Status: " + (estaOcupado ? "Ocupado" : "Disponível"));
        System.out.println("==========================");
    }
}
