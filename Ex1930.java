import java.util.Scanner;
public class Ex1930 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int t1,t2,t3,t4,t;

        System.out.print("Digite o número de tomadas de cada uma das quatro réguas (entre 2 e 6): ");
        t1 = in.nextInt();
        t2 = in.nextInt();
        t3 = in.nextInt();
        t4 = in.nextInt();

        t = (t1 + t2 + t3 + t4) - 3; // (3) valor de tomadas usadas pela régua
        System.out.println(t);
    }
}