package negocio;


public class CarroProxy implements CarroGaragem {
    private Carro carro;

    public CarroProxy(String cor, String placa, String modelo, String marca) {
        this.carro = new Carro();
        this.carro.setCor(cor);
        this.carro.setPlaca(placa);
        this.carro.setModelo(modelo);
        this.carro.setMarca(marca);
    }

    @Override
    public void manobrar(Empregado empregado) {
        if (empregado.getIdade() < 18 || !empregado.isTemCNH()) {
            System.out.println("O empregado " + empregado.getNome() + " não está habilitado a conduzir.");
        } else {
            System.out.println(empregado.getNome() + " está manobrando o " + carro.getMarca());
            carro.manobrar(empregado);
        }
    }

    @Override
    public String getCor() {
        return this.carro.getCor();
    }

    @Override
    public void setCor(String cor) {
        this.carro.setCor(cor);
    }

    @Override
    public String getPlaca() {
        return this.carro.getPlaca();
    }

    @Override
    public void setPlaca(String placa) {
        this.carro.setPlaca(placa);
    }

    @Override
    public String getModelo() {
        return this.carro.getModelo();
    }

    @Override
    public void setModelo(String modelo) {
        this.carro.setModelo(modelo);
    }

    @Override
    public String getMarca() {
        return this.carro.getMarca();
    }

    @Override
    public void setMarca(String marca) {
        this.carro.setMarca(marca);
    }
}
