import java.util.Scanner;

public class Ex1113 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = 0, y = 1;

        while (x != y) {
            x = in.nextInt();
            y = in.nextInt();

            if (x == y) {
                break;
            } else if (x > y) {
                System.out.println("Descrescente");
            } else {
                System.out.println("Crescente");
            }
        }
    }
}