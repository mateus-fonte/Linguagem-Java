import java.awt.*;
import java.util.Scanner;
// 106082
public class NumeroPrimo {
    public static void main(String[] args) {
        int num, divisores = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um valor inteiro positivo e eu direi se é primo: ");
            num = teclado.nextInt();
        } while (num <=0 );
        for(int i = num; i > 0; i--) {
             if (num % i == 0) {
                 divisores++;
             }
            System.out.print(i+" ");
        }
        System.out.println();
        if(divisores == 2) {
            System.out.println("O número digitado é primo pois apenas é divisivel por 1 e por ele mesmo.");
        } else {
            System.out.printf("O número digitado não é primo pois possue %d divisores.",divisores);
        }
    }
}
