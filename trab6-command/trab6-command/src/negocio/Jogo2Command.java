package negocio;

import jogos.Jogo2;

public class Jogo2Command implements Command {

    private Jogo2 jogo2;

    public Jogo2Command(Jogo2 jogo2) {
        this.jogo2 = jogo2;
    }

    @Override
    public void botaoA() {
        jogo2.executar();
    }

    @Override
    public void botaoB() {
        jogo2.desfazer();
    }

}
