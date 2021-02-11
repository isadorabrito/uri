import java.util.Scanner;

public class Ex1020 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int dias, idadedias, idadeanos, idademeses;

        dias = in.nextInt();

        idadeanos = dias/365;
        idademeses = (dias - idadeanos*365)/30; 
        idadedias = dias - idadeanos*365 - idademeses*30;

        System.out.println(+idadeanos+ " ano(s)");
        System.out.println(+idademeses+ " mes(es)");
        System.out.println(+idadedias+ " dia(s)");
    }
}