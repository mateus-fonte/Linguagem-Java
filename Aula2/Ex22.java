package Aula2;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double c;
        System.out.printf("Informe uma temperatura em graus Celsius: ");
        c = ler.nextDouble();
        double f = (1.8*c) + 32;
        System.out.printf("%.1f graus Celsius correspondem a %.1f graus Fahrenheit",c,f);
        ler.close();
    }
}
