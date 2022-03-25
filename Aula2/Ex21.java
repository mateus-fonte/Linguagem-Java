package Aula2;
import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double q;
        double m = 1.609;
        System.out.printf("Informe uma distancia em quilometros: ");
        q = ler.nextDouble();
        System.out.printf("O valor %.2f em quilometros corresponde a %.2f em milhas\n ", q, (q/m));
        ler.close();
    }
}
