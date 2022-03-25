import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
//106082
public class Investimentos {
    public static void main(String[] args) throws InterruptedException {
        int capital;
        double juros, montante;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite o capital inicial investido (multiplo de 1000): ");
            capital = teclado.nextInt();
            System.out.println("Digite a taxa de juros mensal (em porcentagem): ");
            juros = teclado.nextDouble()/100;


        }while (capital < 0 && capital%1000 != 0 && (juros > 5 || juros < 0));
        for(int i = 1; i < 13; i++){
            montante = capital*(Math.pow((1+juros),i));
            System.out.printf("O valor total no mês %d foi %.2f \n",i, montante);
            TimeUnit.MILLISECONDS.sleep(500);


        }
    }
}
