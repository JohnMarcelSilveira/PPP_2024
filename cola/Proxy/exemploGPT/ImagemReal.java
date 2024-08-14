public class ImagemReal implements Imagem {
    private String nomeArquivo;

    public ImagemReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarDoDisco();
    }

    private void carregarDoDisco() {
        System.out.println("Carregando " + nomeArquivo);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo " + nomeArquivo);
    }
}
