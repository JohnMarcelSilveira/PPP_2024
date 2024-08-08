package apresentacao;

import negocio.RegistroPersonagem;
import negocio.Personagem;

public class Main {
    public static void main(String[] args) {
        RegistroPersonagem registro = RegistroPersonagem.getInstance();

        Personagem meuGuerreiro = registro.criaPersonagem("guerreiro");
        if (meuGuerreiro != null) {
            meuGuerreiro.setNome("Aragorn");
            meuGuerreiro.setNivel(5);
            System.out.println(meuGuerreiro);
        }

        Personagem meuMago = registro.criaPersonagem("mago");
        if (meuMago != null) {
            meuMago.setNome("Gandalf");
            meuMago.setNivel(10);
            System.out.println(meuMago);
        }

        // Verificando que os objetos são diferentes (clonagem)
        System.out.println(meuGuerreiro.hashCode());
        System.out.println(meuMago.hashCode());
    }
}
