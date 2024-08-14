package apresentacao;

import negocio.*;

public class Main {
    public static void main(String[] args) {
        Html ex1 = new HTMLDocument("Melhor pagina do Github");
        ex1 = new H1(ex1, "Melhor pagina do Github");
        ex1 = new Link(ex1, "https://github.com/IgorAvilaPereira", "GitHub");
        
        Html div = new DivHTML();
        div = new H1(div, "Venha conhecer");
        div = new P(div, "Clique no link para ser redirecionado");
        ex1 = new Div(ex1, div);

        ex1 = new Image(ex1, "11465237.png",
                "Igor_anime");

        ex1.build();
    }
}