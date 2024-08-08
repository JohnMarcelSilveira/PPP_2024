package negocio;

import jogos.Jogo3;

public class Jogo3Command implements Command {

    private Jogo3 jogo3;

    public Jogo3Command(Jogo3 jogo3) {
        this.jogo3 = jogo3;
    }

    public void botaoA() {
        jogo3.executar();
    }

    public void botaoB() {
        jogo3.desfazer();
    }
}
