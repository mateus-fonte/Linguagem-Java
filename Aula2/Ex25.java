package Aula2;
import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double v1, d1, v2, d2, t1, t2, vm;
        System.out.printf("Informe a velocidade média durante a primeira etapa (em Km/h): ");
        v1 = ler.nextDouble();
        System.out.printf("Informe a distancia percorrida na primeira etapa (em Km): ");
        d1 = ler.nextDouble();
        System.out.printf("Informe a velocidade média durante a segunda etapa (em Km/h): ");
        v2 = ler.nextDouble();
        System.out.printf("Informe a distancia percorrida na segunda etapa (em Km): ");
        d2 = ler.nextDouble();
        t1 = d1 / v1;
        t2 = d2 / v2;
        vm = (d1+d2)/(t1+t2);
        System.out.printf("A velocidade média final do percurso foi de %.2f Km/h", vm);
        ler.close();
    }
}
