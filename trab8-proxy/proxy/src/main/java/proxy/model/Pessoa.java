package proxy.model;

import java.util.Date;

public class Pessoa implements Model {
    private int idade;
    private boolean habilitado;
    private String nome;
    private Date dataNascimento;
    private String carteiraHabilitacao;

    public Pessoa(int idade, boolean habilitado) {
        this.idade = idade;
        this.habilitado = habilitado;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isHabilitado() {
        return habilitado;
    }
}
