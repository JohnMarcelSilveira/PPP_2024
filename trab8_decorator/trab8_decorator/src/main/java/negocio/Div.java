package negocio;

public class Div extends HtmlDecorator {
    private String classe;
    
    public Div(Html html, String classe) {
        super(html);
        this.classe = classe;
        this.conteudo = "<div class=\"" + this.classe + "\">";
    }

}
