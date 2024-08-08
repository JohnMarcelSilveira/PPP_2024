package negocio;

public class Controle {
    
        private Command[] comandos = new Command[5];
        private int posicao = 0;
    
        public void setCommand(Command command) {
            comandos[posicao] = command;
            posicao++;
        }
    
        public void botaoA() {
            for (int i = 0; i < posicao; i++) {
                comandos[i].botaoA();;
            }
        }
    
        public void botaoB() {
            for (int i = posicao - 1; i >= 0; i--) {
                comandos[i].botaoB();
            }
        }
}
