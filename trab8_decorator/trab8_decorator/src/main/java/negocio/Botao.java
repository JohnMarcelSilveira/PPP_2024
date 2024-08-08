package negocio;

public class Botao extends HtmlDecorator {
    private String texto;
    
    public Botao(Html html, String texto) {
        super(html);
        this.texto = texto;
        this.conteudo = "<button>" + this.texto + "</button>";
    }
}
