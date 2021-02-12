import java.util.Scanner;

public class Ex1066 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a=0;
        int pares=0;
        int impares=0;
        int positivos=0;
        int negativos=0;

        while (a < 5) {
            int valor = in.nextInt();
            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (valor > 0) {
                positivos++;
            } 
            if (valor < 0) {
                negativos++; 
            }
            a++;
        }
        System.out.println(+pares+" valor(es) par(es)");
        System.out.println(+impares+" valor(es) impar(es)");
        System.out.println(+positivos+" valor(es) positivo(s)");
        System.out.println(+negativos+" valor(es) negativo(s)");
    }
}