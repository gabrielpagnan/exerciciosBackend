import java.util.Scanner;

public class GabrielAtv1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double nota;

        while(true){
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota=scanner.nextDouble();

            if (nota>=0 && nota<=10){
                System.out.println("Nota registrada com sucesso");
                break;
            } else {
                System.out.println("Nota invalida. Por favor, insira uma nota entre 0 e 10.");
            }
        }

        scanner.close();
    }
}
