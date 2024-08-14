public class ImagemProxy implements Imagem {
    private ImagemReal imagemReal;
    private String nomeArquivo;

    public ImagemProxy(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void exibir() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(nomeArquivo);
        }
        imagemReal.exibir();
    }
}
