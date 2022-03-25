import java.util.Scanner;
//106082
public class DiasDoMes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mes, ano, dias;
        boolean bi = true;
        do {
            System.out.println("Digite o ano desejado: ");
            ano = teclado.nextInt();
            System.out.println("Digite um mês: ");
            mes = teclado.nextInt();
        } while (ano < 0 && (mes > 12 || mes < 1));
        if (ano % 4 == 0) {
            if (ano % 100 == 0){
                if(!(ano % 400 == 0)){
                    bi = false;
                }
            }
        }else{
            bi = false;
        }
        switch (mes) {
            case 1:
                dias = 31;
                System.out.printf("O mês de Janeiro de %d tem %d dias",ano,dias);
                break;
            case 2:
                if(bi){
                    dias = 29;
                    System.out.printf("O mês de Fevereiro de %d tem %d dias pois o ano é bissexto!",ano,dias);
                }else {
                    dias = 28;
                    System.out.printf("O mês de Fevereiro de %d tem %d dias",ano,dias);
                }
                break;
            case 3:
                dias = 31;
                System.out.printf("O mês de Março de %d tem %d dias",ano,dias);
                break;
            case 4:
                dias = 30;
                System.out.printf("O mês de Abril de %d tem %d dias",ano,dias);
                break;
            case 5:
                dias = 31;
                System.out.printf("O mês de Maio de %d tem %d dias",ano,dias);
                break;
            case 6:
                dias = 30;
                System.out.printf("O mês de Junho de %d tem %d dias  ",ano,dias);
                break;
            case 7:
                dias = 31;
                System.out.printf("O mês de Julho de %d tem %d dias",ano,dias);
                break;
            case 8:
                dias = 31;
                System.out.printf("O mês de Agosto de %d tem %d dias",ano,dias);
            case 9:
                dias = 30;
                System.out.printf("O mês de Setembro de %d tem %d dias",ano,dias);
            case 10:
                dias = 31;
                System.out.printf("O mês de Outubro de %d tem %d dias",ano,dias);
            case 11:
                dias = 30;
                System.out.printf("O mês de Novembro de %d tem %d dias",ano,dias);
            case 12 :
                dias = 31;
                System.out.printf("O mês de Dezembro de %d tem %d dias",ano,dias);

        }
    }
}