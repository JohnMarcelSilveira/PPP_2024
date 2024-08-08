package negocio;

public class Cliente extends Pessoa {
    
    private String nomeMae;
    private String cpf;
    private Endereco endereco;

    public Cliente(int id, String nome, String nomeMae, String cpf, Endereco endereco) {
        super(id, nome);
        this.nomeMae = nomeMae;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", endereco=" + endereco + ", nome=" + nome + ", nomeMae=" + nomeMae + "]";
    }
}
