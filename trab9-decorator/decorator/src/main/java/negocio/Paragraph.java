package negocio;

public class Paragraph extends HtmlDecorator {
    private String text;

    public Paragraph(HtmlComponent htmlComponent, String text) {
        super(htmlComponent);
        this.text = text;
    }

    @Override
    public String generate() {
        String html = htmlComponent.generate();
        html = html.replace("{CORPO}", "<p>" + text + "</p>\n{CORPO}");
        return html;
    }
}
