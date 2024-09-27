public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("Sedan", "Fusca", 2005,false, 4);

        System.out.println(c1);
        c1.alugar();
        c1.alugar();
        System.out.println(c1);
        c1.devolver();
        c1.devolver();
        System.out.println(c1);
        System.out.println("Valor do aluguel: R$ "+ c1.calcularValorAluguel(10));

        Moto m1 = new Moto("Honda", "CB500X", 2022, false, 154);

        System.out.println(m1);
        m1.alugar();
        m1.alugar();
        System.out.println(m1);
        m1.devolver();
        m1.devolver();
        System.out.println(m1);
        System.out.println("Valor do aluguel: R$ "+ m1.calcularValorAluguel(5));

        Caminhao h1 = new Caminhao("Volvo", "FH", 2001, false, 20);
        System.out.println(h1);
        h1.alugar();
        h1.alugar();
        System.out.println(h1);
        h1.devolver();
        h1.devolver();
        System.out.println(h1);
        System.out.println("Valor do aluguel: R$ "+ h1.calcularValorAluguel(2));


    }
}