package negocio;

public class Footer extends HtmlDecorator {
    public Footer(HtmlComponent htmlComponent) {
        super(htmlComponent);
    }

    @Override
    public String generate() {
        String html = htmlComponent.generate();
        html = html.replace("{CORPO}", "<footer>\n{CORPO}\n</footer>");
        return html;
    }
}
