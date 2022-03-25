package Aula2;
import java.util.Scanner;
import java.lang.Math;

public class Ex27 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x1, y1, x2, y2, d;
        System.out.printf("x1: ");
        x1 = ler.nextDouble();
        System.out.printf("y1: ");
        y1 = ler.nextDouble();
        System.out.printf("x2: ");
        x2 = ler.nextDouble();
        System.out.printf("y2: ");
        y2 = ler.nextDouble();
        d = Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
        System.out.printf("A distancia entre os dois ponto é de %.2f",d);
        ler.close();
    }
}
