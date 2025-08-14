import java.util.Scanner;

public class GabrielAtv5 {


    private static double lerPositivo(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim().replace(',', '.');
            try {
                double v = Double.parseDouble(s);
                if (v > 0) return v;
                System.out.println("Valor inválido. Insira um número maior que zero.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
            }
        }
    }


    private static double lerTaxaPositiva(Scanner sc, String prompt) {
        double taxaPercentual = lerPositivo(sc, prompt);
        return taxaPercentual / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir;

        do {
            double popA  = lerPositivo(sc, "População inicial do país A: ");
            double taxaA = lerTaxaPositiva(sc, "Taxa anual do país A (%): ");
            double popB  = lerPositivo(sc, "População inicial do país B: ");
            double taxaB = lerTaxaPositiva(sc, "Taxa anual do país B (%): ");

            if (popA >= popB) {
                System.out.println("A população do país A já é maior ou igual à do país B. Nenhum cálculo necessário.");
            } else if (taxaA <= taxaB) {
                System.out.println("Com as taxas informadas, a população do país A não alcançará a do país B.");
            } else {
                int anos = 0;
                double a = popA, b = popB;
                while (a < b) {
                    a *= (1 + taxaA);
                    b *= (1 + taxaB);
                    anos++;
                }
                System.out.println("Com as populações e taxas informadas, serão necessários " + anos +
                        " anos para que a população do país A ultrapasse ou se iguale à do país B.");
            }

            System.out.print("Deseja realizar outra simulação? (s/n): ");
            String resp = sc.nextLine().trim().toLowerCase();
            repetir = resp.startsWith("s");

        } while (repetir);

        System.out.println("Encerrando. Até mais!");
        sc.close();
    }
}
