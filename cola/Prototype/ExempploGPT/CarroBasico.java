public class CarroBasico implements Carro {
    private String modelo;
    private String cor;

    public CarroBasico(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public Carro clone() {
        try {
            return (Carro) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void exibir() {
        System.out.println("Modelo: " + modelo + ", Cor: " + cor);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    

}
