import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float total=0;
        int opcao, quantidade;

        System.out.print("Digite o código do produto: ");
        opcao = in.nextInt();
        System.out.print("Digite a quantidade: ");
        quantidade = in.nextInt();

        if (opcao == 1) {
            total = quantidade * 4f;
        } else if (opcao == 2) {
            total = quantidade * 4.50f;
        } else if (opcao == 3) {
            total = quantidade * 5f;
        } else if (opcao == 4) {
            total = quantidade * 2f;
        } else if (opcao == 5) {
            total = quantidade * 1.50f;
        }

        System.out.printf("Total: R$ %.2f%n" , total);
    }
}