import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valorAlearotiro  = new Random().nextInt(100);
        int tentativas = 0;
        int valorDigitado = 0;

        System.out.println("----------------------- ADIVINHAÇÃO -----------------------");
        System.out.println("Escolha um valor entre 1 a 100 para adivinhar qual foi o número escolhido");
        System.out.println("Lembrando que são apenas 5 tentativas");

        do {
            System.out.print("Digite: ");
            valorDigitado = in.nextInt();

            if(valorDigitado == valorAlearotiro){
                System.out.println("-------->>>> VOCÊ ACERTOU !!!!!!");
                break;
            } else if (valorDigitado > valorAlearotiro) {
                System.out.println("O valor que foi digitado é maior do que o número Sorteado");
            } else {
                System.out.println("o valor que foi digitado é menor do que o número Sorteado");
            }

            tentativas++;


        } while (tentativas <= 5);
        System.out.println("GAME OVER");

        in.close();

    }
}
