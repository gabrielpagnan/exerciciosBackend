package exercicios2;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String matricula;
    private String departamento;

    public Funcionario(String nome, String cargo, double salario, String matricula, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public void promover(String novoCargo, double aumento) {
        this.cargo = novoCargo;
        this.salario += aumento;
        System.out.println(nome + " foi promovido para " + cargo + " com aumento de R$ " + aumento);
    }

    public void transferir(String novoDepartamento) {
        this.departamento = novoDepartamento;
        System.out.println(nome + " foi transferido para o departamento " + departamento);
    }

    public void exibirDados() {
        System.out.println("==== Dados do Funcionário ====");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("==============================");
    }
}
