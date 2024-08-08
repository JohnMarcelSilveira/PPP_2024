package decorator;

import negocio.Button;
import negocio.Div;
import negocio.Footer;
import negocio.Form;
import negocio.Header;
import negocio.Html;
import negocio.HtmlComponent;
import negocio.Image;
import negocio.Link;
import negocio.Paragraph;
import util.HtmlFileWriter;

public class Main {
    public static void main(String[] args) {
        HtmlComponent html = new Html("Titulo");
        html = new Header(html);
        html = new Link(html, "Google", "http://www.google.com");
        html = new Div(html);
        html = new Paragraph(html, "Este é um parágrafo.");
        html = new Image(html, "https://pipz.com/static/images/blog/eddie.png", "Dog");
        html = new Button(html, "Clique aqui");
        //html = new Form(html, "action.php", "post");
        html = new Footer(html);


        String finalHtml = html.generate().replace("{CORPO}", ""); // Removendo o marcador final
        HtmlFileWriter.writeToFile("output.html", finalHtml);
    }
}