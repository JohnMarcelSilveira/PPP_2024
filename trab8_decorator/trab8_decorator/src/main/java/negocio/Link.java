package negocio;

public class Link extends HtmlDecorator {
    private String url;
    private String texto;
    
    public Link(Html html, String url, String texto) {
        super(html);
        this.url = url;
        this.texto = texto;
        this.conteudo = "<a href=\"" + this.url + "\">" + this.texto + "</a>";
    }

}
