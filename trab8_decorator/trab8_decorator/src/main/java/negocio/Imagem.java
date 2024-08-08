package negocio;

public class Imagem extends HtmlDecorator {
    private String url;
    private String titulo;
    
    public Imagem(Html html, String url, String titulo) {
        super(html);
        this.url = url;
        this.titulo = titulo;
        this.conteudo = "<img src=\"" + this.url + "\" alt=\"" + this.titulo + "\">";
    }

}
