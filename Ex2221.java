import java.util.Scanner;

public class Ex2221 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cont = 1;
        int t, b, ai1, li1, di1, ai2, di2, li2, valorgolpe1 = 0, valorgolpe2 = 0;
        ;
        System.out.print("Digite o numero de instancias: ");
        t = in.nextInt();
        while (cont <= t) {
            System.out.print("Digite o valor de bonus: ");
            b = in.nextInt();
            System.out.print("Digite os valores de ataque, defesa e level do treinador 1: ");
            ai1 = in.nextInt();
            di1 = in.nextInt();
            li1 = in.nextInt();
            System.out.print("Digite os valores de ataque, defesa e level do treinador 2: ");
            ai2 = in.nextInt();
            di2 = in.nextInt();
            li2 = in.nextInt();
            if (li1 % 2 == 0) {
                b = 5;
            } else {
                b = 0;
            }
            if (li2 % 2 == 0) {
                b = 5;
            } else {
                b = 0;
            }
            valorgolpe1 = ((ai1 + di1) / 2) + b;
            valorgolpe2 = ((ai2 + di2) / 2) + b;

            if (valorgolpe1 > valorgolpe2) {
                System.out.println("Dabriel");
            } else if (valorgolpe2 > valorgolpe1) {
                System.out.println("Guarte");
            } else {
                System.out.println("Empate");
            }
            cont++;
        }
    }
}