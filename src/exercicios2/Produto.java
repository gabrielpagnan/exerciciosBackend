package exercicios2;

public class Produto {
    // Atributos
    private String nome;
    private String codigo;
    private double preco;
    private int estoque;

    // Construtor
    public Produto(String nome, String codigo, double preco, int estoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Método para vender produto
    public void vender(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            double valorTotal = preco * quantidade;
            System.out.println("Venda realizada! " + quantidade + "x " + nome +
                    " vendidos. Valor total: R$ " + valorTotal);
        } else {
            System.out.println("Estoque insuficiente! Disponível: " + estoque + " unidades.");
        }
    }

    // Método para repor estoque
    public void repor(int quantidade) {
        estoque += quantidade;
        System.out.println("Foram adicionadas " + quantidade + " unidades ao estoque de " + nome);
    }

    // Método para exibir informações do produto
    public void exibirProduto() {
        System.out.println("===== Produto =====");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque);
        System.out.println("===================");
    }
}

