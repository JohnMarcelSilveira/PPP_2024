package negocio;

public class ListaOrdenada extends HtmlDecorator {
    private String[] itens;
    
    public ListaOrdenada(Html html, String[] itens) {
        super(html);
        this.itens = itens;
        this.conteudo = "<ol>";
        for (String item : this.itens) {
            this.conteudo += "<li>" + item + "</li>";
        }
        this.conteudo += "</ol>";
    }
    
}
