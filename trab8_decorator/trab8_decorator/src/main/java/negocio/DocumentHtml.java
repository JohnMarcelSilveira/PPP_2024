package negocio;

public class DocumentHtml extends Html {
    //private String titulo;
    
    // public DocumentHtml(String conteudo, String titulo) {
    //     this.conteudo = conteudo;
    //     this.titulo = titulo;
    // }
    
    // @Override
    // public String build() {
    //     return "<html><head><title>" + this.titulo + "</title></head><body>" + this.conteudo + "</body></html>";
    // }

    public DocumentHtml(String string) {
        this.conteudo = "<html><head><title>" + string + "</title></head><body>";
    }
    
}
