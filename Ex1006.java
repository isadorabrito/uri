import java.util.Scanner;
public class Ex1006 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner (System.in);
        double notaA, notaB, notaC, media;

        System.out.println("Qual a sua primeira nota?");
        notaA = in.nextDouble();
        System.out.println("Qual a sua segunda nota?");
        notaB = in.nextDouble();
        System.out.println("Qual a sua terceira nota?");
        notaC = in.nextDouble();

        media = (notaA*2) + (notaB * 3) + (notaC*5);
        System.out.printf("MEDIA = %.1f %n", media);
    }
}