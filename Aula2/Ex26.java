package Aula2;
import java.util.Scanner;
public class Ex26 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int s,m,h;
        System.out.printf("Digite um valor em segundos: ");
        s = ler.nextInt();
        h = s / 3600;
        m = (s % 3600) / 60;
        s = (s % 3600) % 60;
        System.out.printf("O valor digitado em segundos pode ser escrito como %02d:%02d:%02d ",h,m,s);
        ler.close();
    }
}
