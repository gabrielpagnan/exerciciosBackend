package exercicios2;

import java.time.LocalDate;

public class MensalidadeMain {
    public static void main(String[] args) {
        // Criando mensalidade
        Mensalidade m1 = new Mensalidade("Maria Souza", 750.0, LocalDate.of(2025, 9, 5));

        // Data atual simulada
        LocalDate hoje = LocalDate.of(2025, 9, 10);

        // Exibindo status antes do pagamento
        m1.exibirStatus(hoje);

        // Registrando pagamento
        m1.pagar();

        // Exibindo status após pagamento
        m1.exibirStatus(hoje);
    }
}

