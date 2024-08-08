package negocio;

public class Footer extends HtmlDecorator {
    private String texto;
    
    public Footer(Html html, String texto) {
        super(html);
        this.texto = texto;
        this.conteudo = "<footer>" + this.texto + "</footer>";
    }

}
