import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String filme = in.nextLine();
        System.out.print("Qual o ano de lançamento: ");
        int anoLancamento = in.nextInt();
        System.out.print("Diga sua avaliação para o filme: ");
        double avaliacao = in.nextDouble();

        System.out.printf("Nome do filme: %s \r\n Data de Lançamento: %d \r\n Nota de Avaliação: %.1f \r\n", filme, anoLancamento, avaliacao);

        in.close();
    }
}
