import java.util.Scanner;

public class Ex1866 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int c;
        int n = 0;
        int cont = 1;

        System.out.print("Digite a quantidade de casos de teste(1<=N<=1000): ");
        c = in.nextInt();
        while (cont <= c) {
            System.out.print("Digite o número: ");
            n = in.nextInt();
            cont++;
            if (n % 2 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
}