import java.util.Scanner;

public class Ex1866 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int c = 1; // quantidade de casos de teste
        int contador = 0;
        int s = 0; // resultado da soma dos termos


        System.out.print("Número de casos: ");
        c = in.nextInt();

        while (contador < c) {
            System.out.print("Digite o resultado do " + (contador + 1) + " caso: ");
            s = in.nextInt();
            if (s % 2 == 0) {
                System.out.println("Resultado da soma dos N termos: 0");
            } else {
                System.out.println("Resultado da soma dos N termos: 1");
            }
            contador++;
        }
    }
}