package negocio;

public class Html extends HtmlComponent {
    private String title;
    
    public Html(String title) {
        this.title = title;
    }
    
    @Override
    public String generate() {
        return "<html>\n  <title>" + title + "</title>\n<body>\n{CORPO}\n</body>\n</html>";
    }
}