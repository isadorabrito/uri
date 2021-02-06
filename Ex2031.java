import java.util.Scanner;

public class Ex2031 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        String j1, j2;
        int cont = 1;
        System.out.print("Digite o numero de casos: ");
        n = in.nextInt();

        while (cont <= n) {
            System.out.println("Jogador 1, digite sua escolha: ");
            j1 = in.next();
            System.out.println("Jogador 2, digite sua escolha: ");
            j2 = in.next();
            
            if (j1.equals("ataque")) {
                if (j2.equals("pedra")) {
                    System.out.println("Jogador 1 venceu");
                } else if (j2.equals("papel")) {
                    System.out.println("Jogador 1 venceu");
                } else {
                    System.out.println("Aniquilacao mutua");
                }
            }
            if (j1.equals("papel")) {
                if (j2.equals("pedra")) {
                    System.out.println("Jogador 2 venceu");
                } else if (j2.equals("papel")) {
                    System.out.println("Ambos venceram");
                } else {
                    System.out.println("Jogador 2 venceu");
                }
            }
            if (j1.equals("pedra")) {
                if (j2.equals("pedra")) {
                    System.out.println("Sem ganhador");
                } else if (j2.equals("papel")) {
                    System.out.println("Jogador 1 venceu");
                } else {
                    System.out.println("Jogador 2 venceu");
                }
            }
            cont++;
        }
    }
}