import java.util.Scanner;
public class Ex1013 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a,b,c,MaiorAB, maior;

        System.out.print("Digite o valor de a: ");
        a = in.nextInt();
        System.out.print("Digite o valor de b: ");
        b = in.nextInt();
        System.out.print("Digite o valor de c: ");
        c = in.nextInt();

        MaiorAB = ((a+b) + Math.abs(a-b))/2;
        maior = ((MaiorAB +c) + Math.abs(MaiorAB - c))/2;


        System.out.printf("%d eh o maior %n", maior);
    }
}