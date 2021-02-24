import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Ex1038a {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float total = 0, item;
        int opcao = 1, quantidade;

        while (opcao > 0) {

            System.out.print("Digite o código do produto ou zero para sair: ");
            opcao = in.nextInt();

            if (opcao == 0) {
                break;
            }

            System.out.print("Digite a quantidade: ");
            quantidade = in.nextInt();

            if (opcao == 1) {
                item = quantidade * 4f;
                total += item;

            }
            if (opcao == 2) {
                item = quantidade * 4.50f;
                total += item;
            }
            if (opcao == 3) {
                item = quantidade * 5f;
                total += item;
            }
            if (opcao == 4) {
                item = quantidade * 2f;
                total += item;
            }
            if (opcao == 5) {
                item = quantidade * 1.50f;
                total += item;
            }
            System.out.printf("Total: R$ %.2f%n", total);
        }

    }
}