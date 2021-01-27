import java.util.Scanner;

public class Ex1009 {
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);

        String nome;
        double salario, montantevendas, total;


        System.out.print("Qual seu primeiro nome? ");
        nome = in.next();
        System.out.print("Qual o valor do seu salário? R$ ");
        salario = in.nextDouble();
        System.out.print("Qual foi o valor do seu montante de vendas? R$ ");
        montantevendas = in.nextDouble();

        total = (0.15 * montantevendas) + salario;
        System.out.printf("TOTAL = R$ %.2f %n", total);
    }
}