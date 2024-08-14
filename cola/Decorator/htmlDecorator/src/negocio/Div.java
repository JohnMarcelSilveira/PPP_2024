package negocio;

public class Div extends TagDecorator {
    public Div(Html html, Html divHtml) {
        super(html);
        this.content = "<div>" + divHtml.getContent() + "\n</div>";
    }
}