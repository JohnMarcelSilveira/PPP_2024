package negocio;

public class Image extends HtmlDecorator {
    private String src;
    private String alt;

    public Image(HtmlComponent htmlComponent, String src, String alt) {
        super(htmlComponent);
        this.src = src;
        this.alt = alt;
    }

    @Override
    public String generate() {
        String html = htmlComponent.generate();
        html = html.replace("{CORPO}", "<img src=\"" + src + "\" alt=\"" + alt + "\">\n{CORPO}");
        return html;
    }
}
