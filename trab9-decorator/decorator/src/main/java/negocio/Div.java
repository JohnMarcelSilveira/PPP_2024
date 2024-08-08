package negocio;

public class Div extends HtmlDecorator {

    public Div(HtmlComponent htmlComponent) {
        super(htmlComponent);
    }

    @Override
    public String generate() {
        String html = htmlComponent.generate();
        html = html.replace("{CORPO}", "<div>\n{CORPO}\n</div>");
        return html;
    }
}