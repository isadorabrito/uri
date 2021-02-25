import java.util.Scanner;

public class Ex1099 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, x, y,soma;
        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            soma = 0;
            x = in.nextInt();
            y = in.nextInt();
            if (y > x) {
                for (int j = x + 1; j < y; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    }
                }
            } else {
                for (int j = y + 1; j < x; j++) {
                    if (j % 2 != 0) {
                        soma += j;
                    } 
                }
            }
            System.out.println(soma);
        }
    }
}