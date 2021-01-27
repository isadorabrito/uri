// ([0,25], (25,50], (50,75], (75,100])

import java.util.Scanner;
public class Ex1037 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        float n;

        System.out.println("Digite um número: ");
        n = in.nextFloat();

        if (0 <= n && n <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (25 < n && n <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (50 < n && n <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (75 < n && n <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}