package exercicios2;

public class VendaMain {
    public static void main(String[] args) {
        // Criando produtos
        Produto p1 = new Produto("Notebook", "N123", 3500.0, 10);
        Produto p2 = new Produto("Mouse", "M456", 80.0, 50);

        // Exibindo produtos
        p1.exibirProduto();
        p2.exibirProduto();

        // Realizando vendas
        p1.vender(2);  // vende 2 notebooks
        p2.vender(60); // tentativa de vender mais do que o estoque

        // Repondo estoque
        p2.repor(20);

        // Vendendo novamente
        p2.vender(10);

        // Exibindo informações finais
        p1.exibirProduto();
        p2.exibirProduto();
    }
}

