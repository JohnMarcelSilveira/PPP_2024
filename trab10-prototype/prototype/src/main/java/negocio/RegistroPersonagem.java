package negocio;

import java.util.HashMap;
import java.util.Map;

public class RegistroPersonagem {
    private static RegistroPersonagem INSTANCE = new RegistroPersonagem();
    private Map<String, Personagem> tiposPersonagem;

    private RegistroPersonagem() {
        this.tiposPersonagem = new HashMap<>();

        Personagem guerreiroBase = new Personagem();
        guerreiroBase.setNome("Guerreiro Base");
        guerreiroBase.setClasse("Guerreiro");
        guerreiroBase.setNivel(1);
        guerreiroBase.setForca(10);
        guerreiroBase.setInteligencia(2);
        this.tiposPersonagem.put("guerreiro", guerreiroBase);

        Personagem magoBase = new Personagem();
        magoBase.setNome("Mago Base");
        magoBase.setClasse("Mago");
        magoBase.setNivel(1);
        magoBase.setForca(2);
        magoBase.setInteligencia(10);
        this.tiposPersonagem.put("mago", magoBase);
    }

    public Personagem criaPersonagem(String tipo) {
        try {
            // Método usando a interface Cloneable
            return this.tiposPersonagem.get(tipo).clone();
            
        } catch (Exception e) {
            System.out.println("Tipo de personagem inexistente!");
        }
        return null;
    }

    public void adicionaModeloPersonagem(Personagem personagem) {
        this.tiposPersonagem.put(personagem.getClasse(), personagem);
    }

    public static synchronized RegistroPersonagem getInstance() {
        return RegistroPersonagem.INSTANCE;
    }
}
