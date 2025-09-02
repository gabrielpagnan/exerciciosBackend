package exercicios2;

public class AlunoMain {
    public static void main(String[] args) {
        // Criando aluno
        Aluno a1 = new Aluno("Maria Souza", 20, "20231001", "Engenharia de Software");

        // Adicionando notas
        a1.adicionarNota(8.0);
        a1.adicionarNota(6.5);
        a1.adicionarNota(7.5);

        // Exibindo ficha do aluno
        a1.exibirFicha();

        // Verificando aprovação
        if (a1.verificarAprovacao()) {
            System.out.println(a1.calcularMedia() + " → Aluno aprovado!");
        } else {
            System.out.println(a1.calcularMedia() + " → Aluno reprovado!");
        }
    }
}

