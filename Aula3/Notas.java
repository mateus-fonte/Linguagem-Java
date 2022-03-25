import java.util.Scanner;
import java.text.DecimalFormat;
//106082
public class Notas {
    public static void main(String[] args) {
        double notap, notat, notaf;
        boolean reprovado = false;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite a nota da componente pratica: ");
            notap = teclado.nextDouble();
        } while (notap > 20 || notap < 0);
        DecimalFormat df = new DecimalFormat("#.0");
        df.format(notap);
        do {
            System.out.println("Digite a nota da componente teorica: ");
            notat = teclado.nextDouble();
        } while (notat > 20 || notat < 0);
        DecimalFormat dt = new DecimalFormat("#.0");
        dt.format(notat);
        if(notap < 7.0 || notat <7){
            System.out.println("Aluno reprovado por nota minima!");
            reprovado = true;
        }
        notaf = 0.4*notat +0.6*notap;
        if (!reprovado) {
            System.out.printf("A nota final do aluno foi %.1f", notaf);
        }
    }
}
