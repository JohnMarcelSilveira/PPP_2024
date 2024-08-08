package negocio;

public class Personagem implements Cloneable {
    private String nome;
    private String classe;
    private int nivel;
    private int forca;
    private int inteligencia;

    public Personagem() {
    }

    // Método clone usando a interface Cloneable
    public Personagem clone() {
        try {
            return (Personagem) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Personagem(Personagem p) {
        this.nome = p.nome;
        this.classe = p.classe;
        this.nivel = p.nivel;
        this.forca = p.forca;
        this.inteligencia = p.inteligencia;
    }

    // Método clone usando um método estático
    public static Personagem cloneByMethod(Personagem p) {
        return new Personagem(p.nome, p.classe, p.nivel, p.forca, p.inteligencia);
    }

    private Personagem(String nome, String classe, int nivel, int forca, int inteligencia) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.forca = forca;
        this.inteligencia = inteligencia;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public String toString() {
        return "Personagem [nome=" + nome + ", classe=" + classe + ", nivel=" + nivel + ", forca=" + forca
                + ", inteligencia=" + inteligencia + "]";
    }
}
