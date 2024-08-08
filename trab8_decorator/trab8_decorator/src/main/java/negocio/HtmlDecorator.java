package negocio;

public class HtmlDecorator extends Html {
    protected Html html;
    
    public HtmlDecorator(Html html) {
        this.html = html;
    }
    
    @Override
    public String build() {
        return this.html.build() + this.conteudo;
    }
    
}
