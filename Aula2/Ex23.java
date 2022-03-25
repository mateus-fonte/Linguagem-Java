package Aula2;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double m, t0, t1;
        System.out.printf("Informe a quantidade de agua em quilogramas: ");
        m = ler.nextDouble();
        System.out.printf("Informe a temperatura inicial da agua em ºC: ");
        t0 = ler.nextDouble();
        System.out.printf("Informe a temperatura final da agua em ºC: ");
        t1 = ler.nextDouble();
        double q = m * (t1-t0) * 4184;
        System.out.printf("A energia necessaria para aquecer a agua vale %.2f Joules",q);
        ler.close();
    }
}
