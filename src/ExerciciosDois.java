import java.util.Scanner;

public class ExerciciosDois {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // 1º Exercicio
//        System.out.print("Digite um valor: ");
//        int valorDigitado = in.nextInt();
//
//        if (valorDigitado < 0) {
//            System.out.println("O valor digitado é negativo");
//        } else {
//            System.out.println("O valor digitado é positivo");
//        }
//        System.out.println("-----------------");

        // 2º Exercicio
//        System.out.print("Digite o 1º valor: ");
//        int valor1 = in.nextInt();
//        System.out.print("Digite o 2º valor: ");
//        int valor2 = in.nextInt();
//
//        if (valor1 == valor2) {
//            System.out.println("Os valores digitados são iguais");
//        } else {
//            System.out.println("Os valores digitados são diferentes");
//        }
//
//        if(valor1 > valor2){
//            System.out.println("O 1º valor é maior que o 2º Valor");
//        } else {
//            System.out.println("O 2º valor é maior que o 1º Valor");
//        }
//        System.out.println("-----------------");

       // 3º Exercicio
//        System.out.println("- 1 para calcular a área do quadrado \n - 2 para calcular a área do circulo");
//        System.out.print("Digite: ");
//        int opcao = in.nextInt();
//
//        switch (opcao){
//            case 1:
//                System.out.println("------------------ CALCULO ÁREA DO QUADRADO ------------------");
//                System.out.print("Digite a altura do quadrado: ");
//                double altura = in.nextDouble();
//                System.out.print("Digite o comprimento do quadrado: ");
//                double comprimento = in.nextDouble();
//
//                double areaQuadrado = altura * comprimento;
//
//                System.out.println("A área total do quadrado é de " + areaQuadrado + "²");
//            break;
//
//            case 2:
//                System.out.println("------------------ CALCULO ÁREA DO CÍRCULO ------------------");
//                System.out.print("Digite a o raio do circulo: ");
//                double raio = in.nextDouble();
//
//
//                double areaCiculo =  3.14 * (raio * raio);
//
//                System.out.printf("A área total do circulo é de %.2f²", areaCiculo);
//            break;
//
//            default:
//                System.out.println("Valor do digitado para o menu Invalido!!!!");
//            break;
//        }
//
//        System.out.println("-----------------");

        // 4º Exercicio
//        System.out.println("------------------------ TABUADA ------------------------");
//        System.out.println("Digite um valor para cria a tabuada de 1 a 10");
//        System.out.print("Digite: ");
//        int valorDigitado = in.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            int resultado = (valorDigitado * i);
//            System.out.printf("%d X %d = %d \n\r", i, valorDigitado, resultado);
//        }
//        System.out.println("-----------------");

        // 5º Exercicio
//        System.out.println("---------------- PAR OU IMPAR ----------------");
//        System.out.println("Digite um numero para descobrir se é par ou impar");
//        System.out.print("Digite: ");
//        int valorDigitado = in.nextInt();
//
//        int result = valorDigitado % 2;
//        if (result == 0) {
//            System.out.println("O valor digitado é par");
//        } else {
//            System.out.println("O valor digitado é impar");
//        }
//        System.out.println("-----------------");

        // 6º Exercicio
        System.out.println("-------------------- FATORIAL --------------------");
        System.out.println("Digite um valor para descobrir o fatorial");
        System.out.printf("Digite: ");
        int c = in.nextInt();
        int vlDigitado = c;
        int f = 1;
        String s = "";


        do {
           f *= c;
           if(c == 1){
               s += c;
           } else if (c > 1){
               s += c + " . ";
           }
           c--;
        } while(c >= 1);

        System.out.printf("O fatorial de %d! -> %s = %d", vlDigitado, s, f);

        in.close();

    }
}
