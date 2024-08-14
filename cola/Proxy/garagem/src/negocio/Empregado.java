package negocio;

public class Empregado {

    private Garagem garagem = null;
    private String nome;
    private int idade;
    private int cnh;
    private boolean temCNH;

    public Empregado(String nome, int idade,int cnh, boolean temCNH) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
        this.temCNH = temCNH;
    }

    public String getNome() {
        return nome;
    }

    public Garagem getGaragem() {
        return garagem;
    }

    public void setGaragem(Garagem garagem) {
        this.garagem = garagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public boolean isTemCNH() {
        return temCNH;
    }

    public void setTemCNH(boolean temCNH) {
        this.temCNH = temCNH;
    }

  
}
