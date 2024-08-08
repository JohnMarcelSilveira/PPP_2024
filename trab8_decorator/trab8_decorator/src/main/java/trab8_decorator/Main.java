package trab8_decorator;

import negocio.Botao;
import negocio.Div;
import negocio.DocumentHtml;
import negocio.Footer;
import negocio.Html;
import negocio.Imagem;
import negocio.Link;
import negocio.ListaOrdenada;
import negocio.Paragrafo;
import util.HtmlFileWriter;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto de Html
        Html html = new DocumentHtml("Titulo");
        html = new Link(html, "https://www.google.com", "Google");
        html = new Imagem(html, "https://www.google.com/favicon.ico", "Google");
        html = new Div(html, "container");
        html = new Paragrafo(html, "Paragrafo 1");
        html = new Botao(html, "Clique aqui");
        html = new ListaOrdenada(html, new String[] {"Item 1", "Item 2", "Item 3"});
        html = new Footer(html, "Rodapé");
        
        
        String finalHtml = html.build();
        HtmlFileWriter.writeToFile("output.html", finalHtml);
    }
}

