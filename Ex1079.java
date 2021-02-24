import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

            int n;
            float n1, n2, n3, media;
            n = in.nextInt();

            for(int i=0 ; i < n ; i++) {
                n1 = in.nextFloat();
                n2 = in.nextFloat();
                n3 = in.nextFloat();
                media = (n1*2 + n2*3 + n3*5)/10;
                System.out.printf("%.1f%n", media);
            }
    }
}