import java.util.Scanner;

public class Ex1064 {
   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      float valor, media;
      int cont = 0;
      int a = 0;
      float soma = 0;

      while (cont < 6) {
         valor = in.nextFloat();
         if (valor > 0) {
            soma += valor;
            a++;
         }
         cont++;
      }
      media = soma / a;
      System.out.println(+a + " valores positivos");
      System.out.printf("%.1f%n", media);
   }
}