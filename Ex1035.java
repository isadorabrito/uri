import java.util.Scanner;
public class Ex1035 {
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);

        int a,b,c,d;
        System.out.print("Digite o valor de A,B,C,D respectivamente: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}