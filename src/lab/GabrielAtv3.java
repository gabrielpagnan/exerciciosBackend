package lab;

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
            if (nome.length() > 3) {
                break;
            } else {
                System.out.println("Nome inválido. Insira um nome com mais de 3 caracteres.");
            }
        }

        // Idade
        while (true) {
            System.out.print("Digite a idade: ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                scanner.nextLine(); // consumir quebra de linha
                if (idade >= 0 && idade <= 150) {
                    break;
                } else {
                    System.out.println("Idade inválida. Insira uma idade entre 0 e 150.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.nextLine(); // limpar entrada inválida
            }
        }

        // Salário
        while (true) {
            System.out.print("Digite o salário: ");
            if (scanner.hasNextDouble()) {
                salario = scanner.nextDouble();
                scanner.nextLine(); // consumir quebra de linha
                if (salario > 0) {
                    break;
                } else {
                    System.out.println("Salário inválido. Insira um valor maior que zero.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um valor numérico.");
                scanner.nextLine(); // limpar entrada inválida
            }
        }

        // Sexo
        while (true) {
            System.out.print("Digite o sexo (f/m): ");
            String entrada = scanner.nextLine().toLowerCase();
            if (entrada.equals("f") || entrada.equals("m")) {
                sexo = entrada.charAt(0);
                break;
            } else {
                System.out.println("Sexo inválido. Insira ‘f’ para feminino ou ‘m’ para masculino.");
            }
        }

        // Estado Civil
        while (true) {
            System.out.print("Digite o estado civil (s/c/v/d): ");
            String entrada = scanner.nextLine().toLowerCase();
            if (entrada.equals("s") || entrada.equals("c") || entrada.equals("v") || entrada.equals("d")) {
                estadoCivil = entrada.charAt(0);
                break;
            } else {
                System.out.println("Estado civil inválido. Insira ‘s’, ‘c’, ‘v’ ou ‘d’.");
            }
        }

        // Exibição final
        System.out.println("\n===== INFORMAÇÕES COLETADAS =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));

        String estadoCivilTexto = switch (estadoCivil) {
            case 's' -> "Solteiro(a)";
            case 'c' -> "Casado(a)";
            case 'v' -> "Viúvo(a)";
            case 'd' -> "Divorciado(a)";
            default -> "Não informado";
        };
        System.out.println("Estado Civil: " + estadoCivilTexto);

        scanner.close();
    }
}