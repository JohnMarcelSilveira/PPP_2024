package negocio;

public abstract class HtmlDecorator extends HtmlComponent {
    protected HtmlComponent htmlComponent;

    public HtmlDecorator(HtmlComponent htmlComponent) {
        this.htmlComponent = htmlComponent;
    }

    public String generate() {
        return htmlComponent.generate();
    }
}
