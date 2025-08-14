import java.util.Scanner;

public class GabrielAtv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        // Nome
        while (true) {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();
            if (nome.length() > 3) break;
            System.out.println("Nome inválido. Insira um nome com mais de 3 caracteres.");
        }

        // Idade
        while (true) {
            System.out.print("Digite a idade: ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                scanner.nextLine();
                if (idade >= 0 && idade <= 150) break;
                System.out.println("Idade inválida. Insira uma idade entre 0 e 150.");
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.nextLine();
            }
        }

        // Salário
        while (true) {
            System.out.print("Digite o salário: ");
            if (scanner.hasNextDouble()) {
                salario = scanner.nextDouble();
                scanner.nextLine();
                if (salario > 0) break;
                System.out.println("Salário inválido. Insira um valor maior que zero.");
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.nextLine();
            }
        }

        // Sexo
        while (true) {
            System.out.print("Digite o sexo (f/m): ");
            String s = scanner.nextLine().trim().toLowerCase();
            if (s.equals("f") || s.equals("m")) { sexo = s.charAt(0); break; }
            System.out.println("Sexo inválido. Insira 'f' para feminino ou 'm' para masculino.");
        }

        // Estado civil
        while (true) {
            System.out.print("Digite o estado civil (s/c/v/d): ");
            String e = scanner.nextLine().trim().toLowerCase();
            if (e.equals("s") || e.equals("c") || e.equals("v") || e.equals("d")) { estadoCivil = e.charAt(0); break; }
            System.out.println("Estado civil inválido. Insira 's', 'c', 'v' ou 'd'.");
        }

        System.out.println("\n--- Cadastro ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        String ec = switch (estadoCivil) {
            case 's' -> "Solteiro(a)";
            case 'c' -> "Casado(a)";
            case 'v' -> "Viúvo(a)";
            case 'd' -> "Divorciado(a)";
            default -> "Desconhecido";
        };
        System.out.println("Estado Civil: " + ec);

        scanner.close();
    }
}
