import java.util.Scanner;
import java.util.concurrent.TimeUnit;
// 106082
public class Contagem {
    public static void main(String[] args) throws InterruptedException {
        int tempo;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Informe um valor para servir de base para a contagem: ");
            tempo = teclado.nextInt();
        } while (tempo <= 0);
        for(int i = tempo; i > 0; i--) {
            System.out.println(i);
            TimeUnit.MILLISECONDS.sleep(500); // A importação do pacote TimeUnit torna possivel a adição de um delay na contagem
        }
        System.out.println("Fim da contagem!");
    }
}
