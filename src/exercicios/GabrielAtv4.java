public class GabrielAtv4 {
    public static void main(String[] args) {
        double populacaoA = 80_000;
        double populacaoB = 200_000;
        double taxaA = 0.03;   // 3% ao ano
        double taxaB = 0.015;  // 1,5% ao ano

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA *= (1 + taxaA);
            populacaoB *= (1 + taxaB);
            anos++;
        }

        System.out.println("Serão necessários " + anos +
                " anos para que a população do país A ultrapasse ou se iguale à população do país B.");
    }
}
