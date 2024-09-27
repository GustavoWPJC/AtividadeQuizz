public class Moto extends Veiculo{

    private int cilindradas;

    public Moto(String marca, String modelo, int ano, boolean alugado, int cilindradas) {
        super(marca, modelo, ano, alugado);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return (50*dias)+(0.10*getCilindradas());
    }
}
