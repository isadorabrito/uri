import java.util.Scanner;

public class Ex1983 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, m;
        int mat = 0;
        float maior = 0;
        int cont = 1;
        float nota;

        System.out.print("Digite a quantidade de alunos: ");
        n = in.nextInt();
        while (cont <= n) {
            System.out.print("Digite o número de matrícula e sua nota: ");
            m = in.nextInt();
            nota = in.nextFloat();
            if (nota > maior) {
                maior = nota;
                mat = m;
            }
            cont++;
        }
        if (maior <= 8) {
            System.out.print("Minimum note not reached\n");
        } else {
            System.out.println(mat);
        }
    }
}