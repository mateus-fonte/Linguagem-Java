import java.util.Random;
//106082
public class NotasUpgrade {
    public static void main(String[] args) {
        Random random = new Random();
        double media = 0;
        double soma = 0;
        double[][] notas = new double[2][16];
        double[] pauta = new double[16];
        Boolean aproved = Boolean.TRUE;
        System.out.print("NotaT    ");
        System.out.print("NotaP    ");
        System.out.print("Pauta   ");
        System.out.println();
        for(int j = 0; j < 16; j++){
            for (int i = 0; i < 2; i++){
                notas[i][j] = random.nextDouble(20); //Gera números aleatórios com limite 20
                System.out.printf("%5.2f    ",notas[i][j]);
                soma += notas[i][j];
                if(notas[i][j] < 7){
                    aproved = false;
                } else {
                    aproved = true;
                }
            }
            if (aproved) {
                media = soma / 2;
            } else {
                media = 66;
            }
            pauta[j] = media;
            soma = 0;
            System.out.printf("%5.2f",pauta[j]);
            System.out.println();
        }
    }
}
