import java.io.FileOutputStream;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = 0;
        double saldo = 2500.00;

        System.out.printf("Digite seu nome: ");
        String nome = in.nextLine();

        System.out.println("**********************************************************************");
        System.out.println("DADOS INICIAIS DO CLIENTE: ");

        System.out.printf("Nome: %9s %s \n\r", "", nome);
        System.out.printf("Tipo conta: %3s Corrente \n\r", "");
        System.out.printf("Saldo em Conta: R$%.2f \n\r", saldo);
        System.out.println("**********************************************************************");

        while (opcao != 4) {


            System.out.println("Operações \r\n");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair \n\r");

            System.out.print("Digite a opção desejada: ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("------------");
                    System.out.printf("O saldo atual é de R$%.2f \n\r\n\r", saldo);
                    System.out.println("------------");
                break;

                case 2:
                    System.out.print("Informe o valor a receber: ");
                    saldo += in.nextDouble();
                    System.out.printf("Saldo atualizado R$%.2f \n\r\n\r", saldo);
                break;

                case 3:
                    System.out.print("Informe o valor que deseja transferir: ");
                    double saque = in.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência \n\r\n\r");
                    } else {
                        saldo -= saque;
                        System.out.printf("Saldo atualizado R$%.2f \n\r\n\r", saldo);
                    }
                break;

                case 4:
                    System.out.println("FIM DO PROGRAMA");
                break;

                default:
                    System.out.println("OPÇÃO INFORMADA INVALIDA");
                break;

            }
        }
        in.close();

    }
}
