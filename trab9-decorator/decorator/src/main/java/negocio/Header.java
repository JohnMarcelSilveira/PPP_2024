package negocio;

public class Header extends HtmlDecorator {
    public Header(HtmlComponent htmlComponent) {
        super(htmlComponent);
    }

    @Override
    public String generate() {
        String html = htmlComponent.generate();
        html = html.replace("{CORPO}", "<header>\n{CORPO}\n</header>");
        return html;
    }
}