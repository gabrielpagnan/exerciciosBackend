package exercicios2;

public class EventoMain {
    public static void main(String[] args) {
        // Criando evento
        Evento show = new Evento("Show de Rock", "20/09/2025", "Ginásio Municipal", 3);

        // Exibindo detalhes iniciais
        show.exibirDetalhes();

        // Inscrevendo pessoas
        show.inscrever("Ana");
        show.inscrever("Carlos");
        show.inscrever("Mariana");

        // Tentando inscrever além da capacidade
        show.inscrever("Pedro");

        // Exibindo detalhes finais
        show.exibirDetalhes();
    }
}

