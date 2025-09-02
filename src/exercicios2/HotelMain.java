package exercicios2;

public class HotelMain {
    public static void main(String[] args) {
        // Criando quartos
        Quarto q1 = new Quarto(101, "Simples", 150.0);
        Quarto q2 = new Quarto(202, "Duplo", 250.0);
        Quarto q3 = new Quarto(303, "Suíte", 400.0);

        // Exibindo informações iniciais
        q1.exibirInfo();
        q2.exibirInfo();
        q3.exibirInfo();

        // Reservando quarto 101 por 3 dias
        q1.reservar();
        System.out.println("Valor total da estadia: R$ " + q1.calcularValor(3));

        // Tentando reservar novamente o mesmo quarto
        q1.reservar();

        // Liberando o quarto 101
        q1.liberar();

        // Exibindo informações finais
        q1.exibirInfo();
    }
}
