package exercicios2;

public class LocadoraMain {
    public static void main(String[] args) {
        // Criando veículos
        Veiculo v1 = new Veiculo("Toyota Corolla", "ABC-1234", 2020, 45000);
        Veiculo v2 = new Veiculo("Fiat Argo", "XYZ-5678", 2022, 12000);

        // Exibindo status inicial
        v1.exibirStatus();
        v2.exibirStatus();

        // Alugando veículos
        v1.alugar();
        v2.alugar();

        // Tentando alugar novamente um já alugado
        v1.alugar();

        // Devolvendo veículos
        v1.devolver(350); // rodou 350 km
        v2.devolver(120); // rodou 120 km

        // Exibindo status final
        v1.exibirStatus();
        v2.exibirStatus();
    }
}

