import java.util.Scanner;

public class Ex1960 {
    public static void main(String[] agrs) {

        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Digite um numero inteiro(0<N<1000): ");
        n=in.nextInt();

        if (n >= 500) {
            if (n >= 900) {
                System.out.print("CM");
                n -= 900;
            } else {
                System.out.print("D");
                n -= 500;
            }
        }
        if (n >= 100 && n < 500) {
            while (n >= 100) {
                if (n > 400) {
                    System.out.print("CD");
                    n -= 400;
                } else {
                    System.out.print("C");
                    n -= 100;
                }
            }
        }
        if (n >= 50 && n < 100) {
                if (n >= 90) {
                    System.out.print("XC");
                    n -= 90;
                } else {
                    System.out.print("L");
                    n -= 50;
                }
        }
        if (n >= 10 && n < 50) {
            while (n >= 10) {
                if (n >= 40) {
                    System.out.print("XL");
                    n -= 40;
                } else {
                    System.out.print("X");
                    n -= 10;
                }
            }
        }
        if (n >= 5 && n < 10) {
            while (n >= 5) {
                if (n >= 9) {
                    System.out.print("IX");
                    n -= 9;
                } else {
                    System.out.print("V");
                    n -= 5;
                }
            }
        }
        if (n < 5 && n >= 1) {
            while (n >= 1) {
                if (n >= 4) {
                    System.out.print("IV");
                    n -= 4;
                } else {
                    System.out.print("I");
                    n -= 1;
                }
            }
        }
        System.out.print("\n");
    }
}