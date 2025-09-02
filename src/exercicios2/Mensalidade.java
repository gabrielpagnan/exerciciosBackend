package exercicios2;

import java.time.LocalDate;

public class Mensalidade {
    // Atributos
    private String aluno;
    private double valor;
    private LocalDate dataVencimento;
    private boolean estaPago;

    // Construtor
    public Mensalidade(String aluno, double valor, LocalDate dataVencimento) {
        this.aluno = aluno;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.estaPago = false; // começa como não pago
    }

    // Método para pagar a mensalidade
    public void pagar() {
        if (!estaPago) {
            estaPago = true;
            System.out.println("Mensalidade de " + aluno + " foi paga com sucesso!");
        } else {
            System.out.println("Mensalidade de " + aluno + " já está paga.");
        }
    }

    // Método para verificar atraso
    public boolean verificarAtraso(LocalDate dataAtual) {
        return !estaPago && dataAtual.isAfter(dataVencimento);
    }

    // Método para exibir status da mensalidade
    public void exibirStatus(LocalDate dataAtual) {
        System.out.println("===== Mensalidade =====");
        System.out.println("Aluno: " + aluno);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Data de vencimento: " + dataVencimento);
        System.out.println("Status: " + (estaPago ? "Pago" : "Em aberto"));
        if (verificarAtraso(dataAtual)) {
            System.out.println("⚠ Atenção: Pagamento em atraso!");
        }
        System.out.println("=======================");
    }
}

