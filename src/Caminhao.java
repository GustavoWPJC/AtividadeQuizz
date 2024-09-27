public class Caminhao extends Veiculo{

    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, boolean alugado, double capacidadeCarga) {
        super(marca, modelo, ano, alugado);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return (200*dias)+(50*getCapacidadeCarga());
    }
}
