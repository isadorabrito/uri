import java.util.Scanner;

public class Ex1080 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, posicao = 0, maior = 0;

        for (int i = 1; i <= 100; i++) {
            n = in.nextInt();
            if (maior < n) {
                maior = n;
                posicao = i;
            }
        }
        System.out.println("O maior numero é " + maior + " e está na " + posicao + "° posicao.");
    }
}