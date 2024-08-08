package negocio;

import jogos.Jogo1;

public class Jogo1Command implements Command{
        
        private Jogo1 jogo1;
        
        public Jogo1Command(Jogo1 jogo1) {
            this.jogo1 = jogo1;
        }

        @Override
        public void botaoA() {
            jogo1.executar();
        }

        @Override
        public void botaoB() {
            jogo1.desfazer();
        }
        
    
}
