import java.util.Scanner;

public class GabrielAtv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String senha;

        while(true){
            System.out.println("Digite o nome do usuario: ");
            usuario = scanner.nextLine();

            System.out.println("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("Erro:A senha não pode ser igual ao nome de usuário. Tente novamente.\n");
            } else{
                System.out.println("Cadastro realizado com sucesso");
                break;
            }
        }

        scanner .close();
    }
}
