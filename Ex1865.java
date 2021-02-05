import java.util.Scanner;

public class Ex1865 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int c, forca, n;
        String nome;
        int cont = 1;

        System.out.print("Digite a quantidade de casos de teste: ");
        c = in.nextInt();
        while (cont <= c) {
            System.out.print("Digite seu nome: ");
            nome = in.next();
            System.out.print("Digite a forca aplicada(1<=N<=25000): ");
            n = in.nextInt();
            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
            cont++;
        }
    }
}