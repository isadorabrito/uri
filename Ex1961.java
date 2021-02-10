import java.util.Scanner;

public class Ex1961 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int altPulo, qtdCanos, alturaAtual;
        int difAltura = 0;
        int proxCano = 0;

        System.out.println("Altura do pulo e qtd de canos:");
        altPulo = in.nextInt();
        qtdCanos = in.nextInt();
        int contador = 1;

        System.out.println("Informe a altura do cano 1:");
        alturaAtual = in.nextInt();

        boolean ganhou = true;

        while (contador < qtdCanos) {
            System.out.println("Cano " + (contador + 1) + ": ");
            proxCano = in.nextInt();

            difAltura = proxCano - alturaAtual;
            if (difAltura > altPulo || difAltura < -altPulo) {
                ganhou = false;
            }
            alturaAtual = proxCano;
            contador++;
        }
        if (ganhou) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
        }
    }
}