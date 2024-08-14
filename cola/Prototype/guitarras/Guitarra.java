
public class Guitarra {
    private String modelo;
    private String tipo;
    private String cor;
    private double preco;

    private Guitarra() {
    }

    public static Guitarra cloneDoModelo() {
        Guitarra novaGuitarra = new Guitarra();
        novaGuitarra.modelo = "Gibson Les Paul";
        novaGuitarra.tipo = "Semi-acústica";
        novaGuitarra.cor = "Preto";
        novaGuitarra.preco = 1500.00;
        return novaGuitarra;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nModelo: " + this.modelo + "\nTipo: " + this.tipo + "\nCor: " + this.cor + "\nPreço: R$" + this.preco + "\n";
    }
}
