package negocio;

import java.util.ArrayList;
import java.util.List;

public class Leiloeiro implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private boolean lanceValido;
    private Float lanceVencedorAtual;
    private String nomeParticipante;
    private String statusLeilao;
    private boolean iniciado;
    private Participante participanteVencedorAtual;
    private Participante participanteVencedorAnterior;

    public Leiloeiro() {
        this.lanceVencedorAtual = 0f;
        this.nomeParticipante = "";
        this.statusLeilao = "";
        this.lanceValido = false;
        this.iniciado = false;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String mensagem) {
        for (Observer observer : observers) {
            observer.update(mensagem);
        }
    }

    public void iniciarLeilao() {
        if (observers.size() > 1 && !this.iniciado) {
            System.out.println("Leilão iniciado com sucesso!");
            iniciado = true;
        } else if (this.iniciado) {
            System.out.println("O leilão já foi iniciado.");
        } else {
            System.out.println("Não é possível iniciar o leilão com menos de dois participantes.");
        }
    }

    @Override
    public void changedState(Observer participante) {
        Participante participante1 = (Participante) participante;
        this.nomeParticipante = participante1.getNome();
        if (participante1.getLance() > this.lanceVencedorAtual) {
            this.lanceValido = true;
            if (this.participanteVencedorAnterior != null) {
                if (!this.participanteVencedorAnterior.equals(participante1)) {
                    this.participanteVencedorAnterior = this.participanteVencedorAtual;
                }
            }
            this.lanceVencedorAtual = participante1.getLance();
            this.participanteVencedorAtual = participante1;
            this.statusLeilao = "Lance de " + this.nomeParticipante + " no valor de " + participante1.getLance()
                    + " foi aceito!";
            notify(this.statusLeilao);
        } else {
            this.lanceValido = false;
            this.statusLeilao = "Lance de " + this.nomeParticipante + " no valor de " + participante1.getLance()
                    + " foi recusado!";
            notify(this.statusLeilao);
        }
    }

    public void encerrarLeilao() {
        if (this.iniciado && this.participanteVencedorAtual != null) {
            System.out.println("Leilão encerrado com sucesso!");
            this.iniciado = false;
            this.statusLeilao = "Leilão encerrado! O participante " + this.participanteVencedorAtual.getNome()
                    + " venceu o leilão com um lance de " + this.participanteVencedorAtual.getLance() + "!";
            
        } else if (this.iniciado && this.participanteVencedorAtual == null) {
            System.out.println("Leilão encerrado com sucesso!");
            this.iniciado = false;
            this.statusLeilao = "Leilão encerrado! Nenhum participante deu lance!";
        } else {
            System.out.println("O leilão ainda não foi iniciado.");
        }
        notify(this.statusLeilao);
    }

    public void setLanceVencedorAtual(Float lanceVencedorAtual) {
        this.lanceVencedorAtual = lanceVencedorAtual;
    }

    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

    public void setStatusLeilao(String statusLeilao) {
        this.statusLeilao = statusLeilao;
    }

    public boolean isLanceValido() {
        return this.lanceValido;
    }

    public Float getLanceVencedorAtual() {
        return this.lanceVencedorAtual;
    }

    public String getNomeParticipante() {
        return this.nomeParticipante;
    }

    public String getStatusLeilao() {
        return this.statusLeilao;
    }

    public List<Observer> getObservers() {
        return this.observers;
    }

    public void setLanceValido(boolean lanceValido) {
        this.lanceValido = lanceValido;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}