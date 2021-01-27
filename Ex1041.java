import java.util.Scanner;
public class Ex1041 {
    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);

        float  x,y;

        System.out.println("Digite os valores de x e y: ");
        x = in.nextFloat();
        y = in.nextFloat();

        if (x > 0 && y > 0 ) {
            System.out.println("Q1");
        } else if ( x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0 && y!=0) {
            System.out.println("Eixo X");
        } else if (y == 0 && x !=0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Origem");
        }
    }
}