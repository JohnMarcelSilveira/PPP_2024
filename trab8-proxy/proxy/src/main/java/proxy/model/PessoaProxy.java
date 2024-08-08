package proxy.model;

public class PessoaProxy implements Model {
    private Pessoa pessoa;

    public PessoaProxy(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public PessoaProxy(int idade, boolean habilitado) {
        this.pessoa = new Pessoa(idade, habilitado);
    }

    @Override
    public int getIdade() {
        return pessoa.getIdade();
    }

    @Override
    public boolean isHabilitado() {
        return pessoa.isHabilitado();
    }
    
}
