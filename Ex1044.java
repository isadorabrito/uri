import java.util.Scanner;

public class Ex1044 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n1,n2;

        n1 = in.nextInt();
        n2 = in.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}