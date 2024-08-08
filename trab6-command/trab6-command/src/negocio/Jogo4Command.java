package negocio;

import jogos.Jogo4;

public class Jogo4Command implements Command {

    private Jogo4 jogo4;

    public Jogo4Command(Jogo4 jogo4) {
        this.jogo4 = jogo4;
    }

    public void botaoA() {
        jogo4.executar();
    }

    public void botaoB() {
        jogo4.desfazer();
    }

}
