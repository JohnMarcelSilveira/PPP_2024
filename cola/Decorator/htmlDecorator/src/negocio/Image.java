package negocio;

public class Image extends TagDecorator {
    public Image(Html html, String url, String alt) {
        super(html);
        this.content = "<img src=\"" + url + "\" alt=\"" + alt + "\">";
    }
}