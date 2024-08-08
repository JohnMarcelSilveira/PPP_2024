package apresentacao;

import jogos.Jogo1;
import jogos.Jogo2;
import jogos.Jogo3;
import jogos.Jogo4;
import negocio.Controle;
import negocio.Jogo1Command;
import negocio.Jogo2Command;
import negocio.Jogo3Command;
import negocio.Jogo4Command;

public class App {
    public static void main(String[] args) throws Exception {
        Jogo1 jogo1 = new Jogo1();
        Jogo2 jogo2 = new Jogo2();
        Jogo3 jogo3 = new Jogo3();
        Jogo4 jogo4 = new Jogo4();
        Controle controle = new Controle();

        Jogo1Command jogo1Command = new Jogo1Command(jogo1);
        Jogo2Command jogo2Command = new Jogo2Command(jogo2);
        Jogo3Command jogo3Command = new Jogo3Command(jogo3);
        Jogo4Command jogo4Command = new Jogo4Command(jogo4);

        controle.setCommand(jogo1Command);

        controle.botaoA();
        controle.botaoB();

        controle.setCommand(jogo2Command);

        controle.botaoA();
        controle.botaoB();

        controle.setCommand(jogo3Command);

        controle.botaoA();
        controle.botaoB();

        controle.setCommand(jogo4Command);

        controle.botaoA();
        controle.botaoB();
        
    }
}
