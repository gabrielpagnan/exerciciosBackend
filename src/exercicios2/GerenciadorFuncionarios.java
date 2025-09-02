package exercicios2;

public class GerenciadorFuncionarios {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(
                "João Silva",
                "Assistente",
                2500.0,
                "12345",
                "Administrativo"
        );

        f1.exibirDados();
        f1.promover("Analista", 1500.0);
        f1.transferir("Financeiro");
        f1.exibirDados();
    }
}
