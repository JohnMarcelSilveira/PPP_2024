package negocio;

public class Button extends HtmlDecorator {
    private String text;

    public Button(HtmlComponent htmlComponent, String text) {
        super(htmlComponent);
        this.text = text;
    }

    @Override
    public String generate() {
        String html = htmlComponent.generate();
        html = html.replace("{CORPO}", "<button>" + text + "</button>\n{CORPO}");
        return html;
    }
}
