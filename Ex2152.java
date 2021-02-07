import java.util.Scanner;

public class Ex2152 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int q, h, m, o;
        int cont = 1;

        System.out.print("Digite a quantidade de casos: ");
        q = in.nextInt();
        while (cont <= q) {
            System.out.print("Digite o caso: ");
            h = in.nextInt();
            m = in.nextInt();
            o = in.nextInt();
            if (o == 0) {
                System.out.printf("%d:%d - A porta fechou!%n", h, m);
            } else {
                System.out.printf("%d:%d - A porta abriu!%n", h, m);
            }
            cont++;
        }
    }
}