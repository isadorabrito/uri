import java.util.Scanner;

public class Ex1067 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int a = 1;

        while (a <= x) {
            System.out.println(a);
            a += 2;
        }
    }
}