public class Estudos {

    public static void main(String[] args) {

        System.out.println("----------SOMA---------------");

        Soma soma1 = new Soma();

        soma1.setValue1(10);
        soma1.setValue2(5);

        soma1.retornoSoma();

        System.out.println("----------SUBTRAÇÃO-----------");

        Subtracao sub1 = new Subtracao();

        sub1.setValue1(10);
        sub1.setValue2(5);

        sub1.retornoSubtracao();

    }

}
