package negocio;

public class Link extends TagDecorator {

    public Link(Html html, String url, String title) {
        super(html);
        this.content = "<a href=\"" + url + "\">" + title + "</a>";
    }

}
