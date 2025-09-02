package exercicios2;

import java.util.ArrayList;

public class Pedido {
    // Atributos
    private int numero;
    private ArrayList<String> itens;
    private double valorTotal;
    private String status; // em preparo, pronto, entregue

    // Construtor
    public Pedido(int numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0;
        this.status = "Em preparo"; // começa sempre em preparo
    }

    // Método para adicionar item ao pedido
    public void adicionarItem(String item, double valor) {
        itens.add(item);
        valorTotal += valor;
        System.out.println(item + " adicionado ao pedido " + numero + " (R$ " + valor + ")");
    }

    // Método para alterar o status do pedido
    public void alterarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do pedido " + numero + " alterado para: " + status);
    }

    // Método para exibir resumo do pedido
    public void exibirResumo() {
        System.out.println("===== Pedido " + numero + " =====");
        System.out.println("Itens: " + itens);
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("Status: " + status);
        System.out.println("===============================");
    }
}
