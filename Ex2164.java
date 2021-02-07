import java.util.Scanner;

public class Ex2164 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Double n, f;

        System.out.print("Digite o valor de n: ");
        n = in.nextDouble();
        f = (Math.pow((1 + Math.sqrt(5))/2,n) - Math.pow((1 - Math.sqrt(5))/2,n))/Math.sqrt(5);
        System.out.printf("%.1f%n",f);
    }
}