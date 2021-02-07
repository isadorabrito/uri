import java.util.Scanner;
public class Ex2057 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int s,t,f,horadestino;

        System.out.print("Digite a hora de saida: ");
        s = in.nextInt();
        System.out.print("Digite o tempo de viagem: ");
        t = in.nextInt();
        System.out.print("Digite o fuso horario: ");
        f = in.nextInt();
        if (s == 0) {
            s = 24;
        }
        horadestino = s + t + f;
        if (horadestino >= 24) {
            horadestino -= 24;
        }
        System.out.println(horadestino);
    }
}