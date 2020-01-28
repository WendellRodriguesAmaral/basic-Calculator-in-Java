
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        float v1, v2, r;
        int calculo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o 1 valor");
        v1 = ler.nextFloat();
        System.out.println("Digite o 2 valor");
        v2 = ler.nextFloat();
        do {
            System.out.println("Opções de calculo");
            System.out.println(" |==========[1] Adição | [2] Subtração | [3] Multiplicação | [4] Divisão ==========| ");
            calculo = ler.nextInt();
            if (calculo !=1 && calculo !=2 && calculo !=3 && calculo !=4) {
                calculo = 5;
            }
            System.out.println("Opção digitada inválida, tente novamente !");
            
            switch (calculo) {
                case 1:
                    r = v1 + v2;
                    System.out.println(v1 + "+" + v2 + "=" + r);
                    break;
                case 2:
                    r = v1 - v2;
                    System.out.println(v1 + "-" + v2 + "=" + r);
                    break;
                case 3:
                    r = v1 * v2;
                    System.out.println(v1 + "x" + v2 + "=" + r);
                    break;
                case 4:
                    r = v1 / v2;
                    System.out.println(v1 + "/" + v2 + "=" + r);
                    break;
            }
        } while (calculo ==5);

    }
}
