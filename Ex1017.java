import java.util.Scanner;
public class Ex1017 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tempogasto, velocidadem;
        float distanciap, litros;

        System.out.print("Qual foi o tempo gasto de viagem (em horas)? ");
        tempogasto = in.nextInt();
        System.out.print("Qual foi a velocidade média da viagem (em KM/h)? ");
        velocidadem = in.nextInt();

        distanciap = (tempogasto * velocidadem);
        litros = (distanciap/12);
        System.out.printf("%.3f%n", litros);
    }    
}
