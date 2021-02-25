import java.util.Scanner;

public class Ex1114 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor = 0;

        for (int i = 0; valor != 2002; i++) {
            valor = in.nextInt();
            if (valor == 2002) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}