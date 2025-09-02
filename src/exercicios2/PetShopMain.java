package exercicios2;

public class PetShopMain {
    public static void main(String[] args) {
        // Criando um animal
        Animal cachorro = new Animal("Rex", "Cachorro", 5, 12.5, "João Silva");

        // Exibindo a ficha inicial
        cachorro.exibirFicha();

        // Alimentando o animal
        cachorro.alimentar(200); // 200g de ração

        // Dando banho
        cachorro.darBanho();

        // Exibindo a ficha após os cuidados
        cachorro.exibirFicha();
    }
}
