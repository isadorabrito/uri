import java.util.Scanner;

public class Ex2061 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, m;
        int cont = 1;
        String acao = " ";

        System.out.print("Digite o numero inicial de abas: ");
        n = in.nextInt();
        System.out.print("Digite o numero de ações: ");
        m = in.nextInt();
        while (cont <= m) {
            System.out.print("Digite a ação: ");
            acao = in.next();
            
            if (acao.equals("fechou")) {
                n +=1;
            } else {
                n-=1;
            }
            cont++;
        }
        System.out.println(n);
    }
}