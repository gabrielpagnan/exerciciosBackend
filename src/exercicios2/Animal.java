package exercicios2;

public class Animal {
    // Atributos
    private String nome;
    private String especie;
    private int idade;
    private double peso;
    private String dono;
    private boolean tomouBanho;

    // Construtor
    public Animal(String nome, String especie, int idade, double peso, String dono) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.dono = dono;
        this.tomouBanho = false; // por padrão, ainda não tomou banho
    }

    // Método para alimentar o animal (aumenta peso)
    public void alimentar(double quantidade) {
        this.peso += quantidade * 0.1; // regra simples: a cada 100g de comida, animal ganha 10g
        System.out.println(nome + " foi alimentado com " + quantidade + "g de ração. Peso atual: " + peso + " kg");
    }

    // Método para dar banho
    public void darBanho() {
        this.tomouBanho = true;
        System.out.println(nome + " tomou banho e está limpinho!");
    }

    // Método para exibir a ficha do animal
    public void exibirFicha() {
        System.out.println("===== Ficha do Animal =====");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Dono: " + dono);
        System.out.println("Último banho: " + (tomouBanho ? "Sim" : "Não"));
        System.out.println("===========================");
    }
}

