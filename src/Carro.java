public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, boolean alugado, int quantidadePortas) {
        super(marca, modelo, ano, alugado);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return (100*dias)+(10*getQuantidadePortas());
    }
}
