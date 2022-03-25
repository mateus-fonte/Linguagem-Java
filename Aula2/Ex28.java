package Aula2;
import java.util.Scanner;
import java.lang.Math;
public class Ex28 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a,b,c, sin;
        System.out.printf("Digite o valor do cateto A: ");
        a = ler.nextDouble();
        System.out.printf("Digite o valor do cateto B: ");
        b = ler.nextDouble();
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        sin = b / c;
        System.out.printf("A hipotenusa tem valor %.2f e o angulo formado entre ela e o cateto A é igual a %.2f graus",c,Math.toDegrees(Math.asin(sin)));
        ler.close();
    }
}
