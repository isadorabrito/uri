import java.util.Scanner;

public class Ex1014 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x;
        float y, consumo;

        x = in.nextInt();
        y = in.nextFloat();

        consumo = x/y;
        System.out.printf("%.3f km/l%n", consumo);
    }
}