package exercicios2;

import java.util.ArrayList;

public class Evento {
    // Atributos
    private String nome;
    private String data;
    private String local;
    private int capacidade;
    private ArrayList<String> inscritos;

    // Construtor
    public Evento(String nome, String data, String local, int capacidade) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
        this.inscritos = new ArrayList<>();
    }

    // Método para inscrever participante
    public void inscrever(String nomePessoa) {
        if (inscritos.size() < capacidade) {
            inscritos.add(nomePessoa);
            System.out.println(nomePessoa + " foi inscrito no evento " + nome);
        } else {
            System.out.println("Inscrições encerradas! Capacidade máxima atingida.");
        }
    }

    // Método para verificar disponibilidade de vagas
    public boolean verificarDisponibilidade() {
        return inscritos.size() < capacidade;
    }

    // Método para exibir detalhes do evento
    public void exibirDetalhes() {
        System.out.println("===== Evento =====");
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + data);
        System.out.println("Local: " + local);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Inscritos: " + inscritos.size());
        System.out.println("Vagas disponíveis: " + (capacidade - inscritos.size()));
        System.out.println("Lista de inscritos: " + inscritos);
        System.out.println("==================");
    }
}

