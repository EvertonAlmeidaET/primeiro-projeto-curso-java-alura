import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.print("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = in.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Media de Avaliações: " + mediaAvaliacao/totalDeNotas);
    }
}