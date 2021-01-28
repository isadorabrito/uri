import java.util.Scanner;
public class Ex1847 {
    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        int a,b,c;

        System.out.println("Digite a temperatura do primeiro, segundo e terceiro dia: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if ((b<a && c>=b)) {
            System.out.println(":)");
        } else if ((b>a && c <=b)) {
            System.out.println(":(");
        }else if ((b>a && c>b) && (b-a > c-b)) {
            System.out.println(":(");
        }else if ((b>a && c>b) && (b-a <= c-b)) {
            System.out.println(":)");
        } else if ((b<a && c<b) && (b-c < a-b)) {
            System.out.println(":)");
        } else if ((b<a && c<b) && (b-c >= a-b)) {
            System.out.println(":(");
        } else {
            if ((a == b) && (c>b)) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        }
    }
}