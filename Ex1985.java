import java.util.Scanner;

public class Ex1985 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int p, q, produto;
        int cont = 1;
        float precofinal, preco1 = 0, preco2 = 0, preco3 = 0, preco4 = 0, preco5 = 0;

        System.out.print("Digite a quantidade de produtos(1<=p<=5): ");
        p = in.nextInt();

        while (cont <= p) {
            System.out.print("Digite o produto e a quantidade: ");
            produto = in.nextInt();
            q = in.nextInt();
            if (produto == 1001) {
                preco1 = q * 1.50f;
            }
            if (produto == 1002) {
                preco2 = q * 2.50f;
            }
            if (produto == 1003) {
                preco3 = q * 3.50f;
            }
            if (produto == 1004) {
                preco4 = q * 4.50f;
            }
            if (produto == 1005) {
                preco5 = q * 5.50f;
            }
            cont++;
        }
        precofinal = preco1 + preco2 + preco3 + preco4 + preco5;
        System.out.printf("%.2f%n", precofinal);
    }
}