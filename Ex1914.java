import java.util.Scanner;

public class Ex1914 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Long m, res;
        int qt, n;
        String opcao1, opcao2, nome1, nome2;
        int cont = 1;

        System.out.print("Digite a quantidade de casos: ");
        qt = in.nextInt();
        while (cont <= qt) {
            System.out.print("Digite o nome do primeiro jogador e sua escolha: ");
            nome1 = in.next();
            opcao1 = in.next();
            System.out.print("Digite o nome do segundo jogador e sua escolha: ");
            nome2 = in.next();
            opcao2 = in.next();
            System.out.print("Digite os números de escolha(1 a 10000000000): ");
            n = in.nextInt();
            m = in.nextLong();
            res = n + m;
            if (res % 2 == 0) {
                if (opcao1.equals("PAR")) {
                    System.out.println(nome1);
                } else {
                    System.out.println(nome2);
                }
            } else {
                if (opcao1.equals("IMPAR")) {
                    System.out.println(nome1);
                } else {
                    System.out.println(nome2);
                }
            }
            cont++;
        }
    }
}