package exercicios2;

public class RestauranteMain {
    public static void main(String[] args) {
        // Criando um pedido
        Pedido p1 = new Pedido(101);

        // Adicionando itens ao pedido
        p1.adicionarItem("Hambúrguer", 25.0);
        p1.adicionarItem("Batata frita", 12.0);
        p1.adicionarItem("Refrigerante", 8.0);

        // Exibindo resumo inicial
        p1.exibirResumo();

        // Alterando status para pronto
        p1.alterarStatus("Pronto");

        // Alterando status para entregue
        p1.alterarStatus("Entregue");

        // Exibindo resumo final
        p1.exibirResumo();
    }
}

