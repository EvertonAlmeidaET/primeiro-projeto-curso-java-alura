import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Diga sua avaliação para o filme: ");
            nota = in.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media de Avaliações: " + mediaAvaliacao/3);
    }
}
