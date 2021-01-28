import java.util.Scanner;
public class Ex1045 {
    public static void main (String[] args ) {

        Scanner in = new Scanner(System.in);

        double a,b,c, aux,a2,bc;

        System.out.println("Digite os valores dos três lados: ");

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
    
        if (b > a && b > c) {
            aux = a;
            a = b;
            b = aux;
        } else if (c > a) {
            aux = a;
            a = c;
            c = aux;
        }
        if (a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");

        } else {
            a2 = (Math.pow(a, 2));
            bc = (Math.pow(b,2) + Math.pow(c,2));
            
                if (a2 > bc) {
                System.out.println("TRIANGULO OBTUSANGULO");
                } else if (a2 < bc) {
                System.out.println("TRIANGULO ACUTANGULO");
                } else {
                System.out.println("TRIANGULO RETANGULO");
                }
            if (a == b && b == c){
                System.out.println("TRIANGULO EQUILATERO");
            } else {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}