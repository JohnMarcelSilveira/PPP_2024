package negocio;

public class Paragrafo extends HtmlDecorator {
    private String texto;
    
    public Paragrafo(Html html, String texto) {
        super(html);
        this.texto = texto;
        this.conteudo = "<p>" + this.texto + "</p>";
    }

}
