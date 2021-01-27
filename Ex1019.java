import java.util.Scanner;
public class Ex1019 {
   public static void main(String [] args) {

       Scanner in = new Scanner(System.in);

       int s, hora,min,seg;

       System.out.println("Digite o tempo em segundos: ");
       s = in.nextInt();

       hora = s / 3600;
       s = s % 3600;
       min = s / 60;
       seg = s % 60;

       System.out.printf("%d:%d:%d%n", hora, min, seg);
    } 
}