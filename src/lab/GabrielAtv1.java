package lab;

import java.util.Scanner;
public class GabrielAtv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        while (true) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota registrada com sucesso");
                break; // Sai do loop quando a nota for válida
            } else {
                System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10");
            }
        }

        scanner.close();
    }
}

