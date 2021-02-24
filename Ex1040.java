import java.util.Scanner;

public class Ex1040 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        float n1, n2, n3, n4, media, nexame, mediafinal;

        n1 = in.nextFloat();
        n2 = in.nextFloat();
        n3 = in.nextFloat();
        n4 = in.nextFloat();

        media = (n1*2 + n2*3 + n3*4 + n4*1)/10;
        System.out.printf("Media: %.1f%n", media);

        if (media >=7) {
            System.out.println("Aluno aprovado.");
        } else if (media >=5 && media < 6.9) {
            System.out.println("Aluno em exame.");
            System.out.print("Nota do exame: ");
            nexame = in.nextFloat();
            mediafinal = (media + nexame) / 2;
            if (mediafinal >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", mediafinal);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", mediafinal);
            }
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}