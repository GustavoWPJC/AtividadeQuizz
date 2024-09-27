public abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private boolean alugado;

    public Veiculo(String marca, String modelo, int ano, boolean alugado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.alugado = alugado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public void alugar(){
        if (isAlugado()){
            System.out.println( getModelo() + " Já alugado");
        }else {
            System.out.println( getModelo() + " alugado com sucesso");
            setAlugado(true);
        }
    }

    public void devolver(){
        if(isAlugado()) {
            System.out.println( getModelo() + " devolvido com sucesso");
            setAlugado(false);
        }else{
            System.out.println( getModelo() + " ja devolvido");
        }
    }

    public abstract double calcularValorAluguel(int dias);

    @Override
    public String toString() {
        return "\nInformações do veículo" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno:" + ano +
                "\nAlugado: " + alugado;
    }
}
