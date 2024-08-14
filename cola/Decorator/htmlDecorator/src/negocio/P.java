package negocio;

public class P extends TagDecorator {
    public P(Html html, String text) {
        super(html);
        this.content = "<p>" + text + "</p>";
    }
}