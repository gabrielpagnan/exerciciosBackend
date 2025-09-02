package exercicios2;

import java.util.ArrayList;

public class Aluno {
    // Atributos
    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private ArrayList<Double> notas; // lista de notas

    // Construtor
    public Aluno(String nome, int idade, String matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>(); // inicia vazio
    }

    // Método para adicionar nota
    public void adicionarNota(double nota) {
        notas.add(nota);
        System.out.println("Nota " + nota + " adicionada para " + nome);
    }

    // Método para calcular a média
    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.size();
    }

    // Método para verificar aprovação
    public boolean verificarAprovacao() {
        double media = calcularMedia();
        return media >= 7.0;
    }

    // Método para exibir os dados do aluno
    public void exibirFicha() {
        System.out.println("===== Ficha do Aluno =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Notas: " + notas);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Status: " + (verificarAprovacao() ? "Aprovado" : "Reprovado"));
        System.out.println("==========================");
    }
}
