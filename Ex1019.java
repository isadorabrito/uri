import java.util.Scanner;
public class Ex1019 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       
        int notas, valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1;

        System.out.print("Digite um valor entre 0 e 1000000: ");
        notas = in.nextInt();

        valor = notas;

        nota100 = valor / 100;
        valor = valor % 100;
        nota50 = valor / 50;
        valor = valor % 50;
        nota20 = valor / 20;
        valor = valor % 20;
        nota10 = valor / 10;
        valor = valor % 10;
        nota5 = valor/ 5;
        valor = valor % 5;
        nota2 = valor / 2;
        valor = valor % 2;
        nota1 = valor / 1;

        System.out.println(notas);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
    } 
}