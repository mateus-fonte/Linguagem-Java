import java.util.Scanner;
//106082
public class Reais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double first = 0;
        double max = 0;
        double media;
        double sum = 0;
        int tot = 0;
        double min = 0;
        double input = 0;
        do {
            System.out.println("Digite um valor real: ");
            if (tot == 0) {
                min = teclado.nextDouble();
                max = min;
                first = min;
                sum = min;
            } else {
                input = teclado.nextDouble();
            sum += input;
            if (input < min) {
                min = input;
            }
            if (input > max) {
                max = input;
            }
            }
            tot++;
            media = sum / tot;
        } while (input != first && tot != 0);
        System.out.printf("O valor maximo digitado foi %.2f",max);
        System.out.println();
        System.out.printf("O valor minimo digitado foi %.2f",min);
        System.out.println();
        System.out.printf("A média total foi %.2f",media);
        System.out.println();
        System.out.printf("O total de numeros lidos foi %d",tot);
    }
}
