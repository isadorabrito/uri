import java.util.Scanner;
public class Ex1080 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, posicao=0, maior=0;

        for (int i=0; i < 100; i++) {
            n =  in.nextInt();
            if (maior < n) {
                maior = n;
                posicao = i+1;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}