package negocio;

public class Link extends HtmlDecorator {
    private String text;
    private String url;

    public Link(HtmlComponent htmlComponent, String text, String url) {
        super(htmlComponent);
        this.text = text;
        this.url = url;
    }

    @Override
    public String generate() {
        String html = htmlComponent.generate();
        html = html.replace("{CORPO}", "<a href=\"" + url + "\">" + text + "</a>\n{CORPO}");
        return html;
    }
}
