package lab;

import java.util.Scanner;

public class GabrielAtv2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String usuario;
        String senha;

        while(true){
            System.out.println("Digite o nome do usuário:");
            usuario = scanner.nextLine();

            System.out.println("Digite a senha:");
            senha = scanner.nextLine();

            if (senha.equals(usuario)){
                System.out.println("Erro: A senha nao pode ser igual ao nome de usuario. Tente novamente");
            }else{
                System.out.println("Cadastro realizado com sucesso");
                break;
            }
        }

        scanner.close();;
    }
}
