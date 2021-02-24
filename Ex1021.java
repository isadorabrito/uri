import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double valor;
        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, moeda1 = 0, moeda50 = 0, moeda25 = 0, moeda10 = 0, moeda5 = 0, moedaum = 0;

        System.out.print("Digite um valor: ");
        valor = in.nextDouble();

        if (valor >= 100) {
            nota100 = (int)valor / 100;
            valor = valor % 100;
        }
        if (valor >= 50) {
            nota50 = (int) valor / 50;
            valor = valor % 50;
        }
        if (valor >= 20) {
            nota20 = (int) valor / 20;
            valor = valor % 20;
        }
        if (valor >= 10) {
            nota10 = (int) valor / 10;
            valor = valor % 10;
        }
        if (valor >= 5) {
            nota5 = (int) valor / 5;
            valor = valor % 5;
        }
        if (valor >= 2) {
            nota2 = (int) valor / 2;
            valor = valor % 2;
        }
        if (valor >= 1) {
            moeda1 = (int) valor / 1;
            valor = valor % 1;
        }
        if (valor >= 0.50) {
            moeda50 = (int)(valor / 0.50);
            valor = valor % 0.50;
        }
        if (valor >= 0.25) {
            moeda25 = (int)(valor / 0.25);
            valor = valor % 0.25;
        }
        if (valor >= 0.10) {
            moeda10 = (int)(valor / 0.10);
            valor = valor % 0.10;
        }
        if (valor >= 0.05) {
            moeda5 = (int)(valor / 0.05);
            valor = valor % 0.05;
        }
        if (valor >= 0.01) {
            moedaum = (int)(valor / 0.01);
        }

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00\n" + nota50 + " nota(s) de R$ 50.00\n" + nota20 + " nota(s) de R$ 20.00\n" + nota10 + " nota(s) de R$ 10.00\n" + nota5 + " nota(s) de R$ 5.00\n" + nota2 + " nota(s) de R$ 2.00" );
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00\n" + moeda50 + " moeda(s) de R$ 0.50\n" + moeda25 + " moeda(s) de R$ 0.25\n" + moeda10 + " moeda(s) de R$ 0.10\n" + moeda5 + " moeda(s) de R$ 0.05\n" + moedaum + " moeda(s) de R$ 0.01" );

    }
}