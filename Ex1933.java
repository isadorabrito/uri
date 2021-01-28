import java.util.Scanner;
public class Ex1933 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int carta1,carta2;

        System.out.println("Digite o valor das duas cartas que você já possui: ");
        carta1 = in.nextInt();
        carta2 = in.nextInt();

        if (carta1 > carta2) {
            System.out.println(carta1);
        } else {
            System.out.println(carta2);
        }
    }
}