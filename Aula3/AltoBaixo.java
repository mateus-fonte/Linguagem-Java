import java.util.Objects;
import java.util.Scanner;
//106082
public class AltoBaixo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ale = Math.random();
        int input;
        int atorio = (int) (1 + ale*(100-1));
        while (true) {
            System.out.println("Estou pensando em um número entre 1 e 100\n tente adivinhar e eu vou dando dicas. Boa sorte! :) ");
            input = teclado.nextInt();
            do {
                int dif = Math.abs(input - atorio);
                if (dif <= 10) {
                    System.out.println("TÁ PEGANDO FOGO BIXO!!! Nova tentativa: ");
                    input = teclado.nextInt();
                } else if (dif <= 25) {
                    System.out.println("Tá quente, você tá no caminho certo! Nova tentativa: ");
                    input = teclado.nextInt();
                } else if (dif <= 40) {
                    System.out.println("Tá morno, tenta um pouco maior ou um pouco menor. Nova tentativa: ");
                    input = teclado.nextInt();
                } else if (dif <= 60) {
                    System.out.println("Ta frio, mas não tanto! Nova tentativa: ");
                    input = teclado.nextInt();
                } else {
                    System.out.println("Passou longe... se eu fosse você, não gastaria dinheiro na EuroMilhões! Nova tentativa: ");
                    input = teclado.nextInt();
                }
            } while (input != atorio || (input < 1 || input > 100));
            System.out.println("PARABÉNSSS, VOCÊ ME VENCEU!!! Deseja continuar a jogar [Sim/S] [Não]:");
            String resp = teclado.next();
            if (resp.equals("Sim") || resp.equals("S")) {
                continue;
            } else if(resp.equals("Não")) {
                break;
            }
        }
    }
}
