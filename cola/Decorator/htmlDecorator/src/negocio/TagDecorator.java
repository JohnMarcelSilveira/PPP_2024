package negocio;

public abstract class TagDecorator extends Html {
    private Html html;

    public TagDecorator(Html html) {
        this.html = html;
    }

    public String getTitle() {
        return this.html.getTitle();
    }

    public String getContent() {
        return this.html.getContent() + "\n" + this.content;
    }
}
