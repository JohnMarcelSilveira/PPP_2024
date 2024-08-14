package negocio;

public class H1 extends TagDecorator {
    public H1(Html html, String text) {
        super(html);
        this.content = "<h1>" + text + "</h1>";
    }
}