public class ProxyPadraoExemplo {
    public static void main(String[] args) {
        Imagem imagem = new ImagemProxy("foto.jpg");

        // Imagem será carregada do disco e exibida
        imagem.exibir();
        System.out.println("");

        // Imagem já está carregada, então apenas será exibida
        imagem.exibir();
    }
}


/*Explicação

Nesse exemplo, o padrão Proxy permite que a imagem só seja carregada do disco quando for realmente necessária, economizando recursos.

Interface Imagem: Define o método exibir(), que será implementado tanto pela classe real (ImagemReal) quanto pelo proxy (ImagemProxy).

Classe ImagemReal: Representa o objeto real, que é custoso para criar (simulado pelo método carregarDoDisco()).

Classe ImagemProxy: Controla o acesso ao objeto real. Somente cria o objeto real (ImagemReal) se e quando ele for necessário.

Classe ProxyPadraoExemplo: Demonstra o uso do Proxy. A primeira vez que a imagem é exibida, ela é carregada do disco. Da segunda vez em diante, a imagem já está carregada, então apenas é exibida. */