package negocio;

public abstract class Html {
    protected String conteudo;
    
    public String build() {
        return this.conteudo;
    }    
}
