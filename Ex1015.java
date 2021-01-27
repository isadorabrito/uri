import java.util.Scanner;
public class Ex1015 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float x1,x2,y1,y2;
        double distancia;

        System.out.print("Digite os valores de x1 e y1: ");
        x1 = in.nextFloat();
        y1 = in.nextFloat();
        System.out.print("Digite os valores de x2 e y2: ");
        x2 = in.nextFloat();
        y2 = in.nextFloat();

        distancia = Math.sqrt((Math.pow(x2-x1, 2) + (Math.pow(y2 -y1, 2))));

        System.out.printf("%.4f %n",distancia);

    }    
}