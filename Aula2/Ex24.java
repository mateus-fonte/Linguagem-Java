package Aula2;
import java.util.Scanner;
import java.lang.Math;

public class Ex24 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double c, m, i, s;
        System.out.printf("Informe o montante inicial investido em euros: ");
        c = ler.nextDouble();
        System.out.printf("Informe a taxa de juros mensal em porcentagem: ");
        i = ler.nextDouble();
        s = Math.pow((1+(i/100)), 3);
        m = c*s;
        System.out.printf("O montante total ao final de 3 meses é de %.2f euros", m);
        ler.close();
    }
}
