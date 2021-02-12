import java.util.Scanner;

public class Ex1060 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float valor;
        int cont = 0;
        int a = 0;

        while (cont < 6) {
            valor = in.nextFloat();
            if (valor > 0) {
                a++;
            }
            cont++;
        }
        System.out.println(+a+ " valores positivos");
    }
}