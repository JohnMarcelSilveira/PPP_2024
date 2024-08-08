package negocio;

public class Form extends HtmlDecorator {
    private String action;
    private String method;

    public Form(HtmlComponent htmlComponent, String action, String method) {
        super(htmlComponent);
        this.action = action;
        this.method = method;
    }

    @Override
    public String generate() {
        String html = htmlComponent.generate();
        html = html.replace("<html>", "");
        html = html.replace("</html>", "");
        html = "<form action=\"" + action + "\" method=\"" + method + "\">" + html + "</form>";
        return html;
    }
}
