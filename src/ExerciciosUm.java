public class ExerciciosUm {

    public static void main(String[] args) {
        // 1º exercicio
        double nota1 = 8.5;
        double nota2 = 5.0;
        double media = (nota1 + nota2) / 2;

        System.out.println("A media do aluno é: " + media);

        // 2º exercicio
        int valorMediaInteira = (int) media;
        System.out.println("O valor da media inteira: " + valorMediaInteira);

        // 3º exercicio
        char letra = 'A';
        String palavra = " oferta foi feita por uma pessoas estudiosa";
        System.out.println(letra + palavra);

        // 4º exercicio
        double precoProduto = 7.55;
        int quantidade = 20;
        double resultadoCalculado = precoProduto * quantidade;
        System.out.println("O valor calculado da multiplicação do preço do produto pela quantidade é de: " + resultadoCalculado);

        // 5º exercicio
        double valorEmDolares = 6.21;
        double valorDolaParaReal = (valorEmDolares * 4.94);
        System.out.printf("O valor em Real convetendo o Dola é de R$%.2f \r\n", valorDolaParaReal);

        // 6º exercicio
        double precoOriginal = 9.99;
        double percentualDesconto = 5;
        double preçoOriginalComDesconto = (precoOriginal * percentualDesconto) / 100;
        System.out.printf("O preço original do produto é de R$%.2f, agora com o desconto de %.2f fica em R$%.2f", precoOriginal, percentualDesconto, preçoOriginalComDesconto);

    }
}
