import java.util.Scanner;

public class Ex1065 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int pares=0;
        int a=0;

        while (a < 5) {
            int valor = in.nextInt();
            if (valor % 2 == 0) {
                pares++;
            }
            a++;
        }
        System.out.println(+pares+" valores pares");
    }    
}