public class PreferenciasUsuario {
    private static PreferenciasUsuario instancia;
    
    private String idioma;
    private String tema;
    private String versao;
    private String nomeUsuario;
    

    private PreferenciasUsuario() {
        this.idioma = "Português";
        this.tema = "Claro";
        this.versao = "1.0";
        this.nomeUsuario = "Convidado";
    }
    

    public static synchronized PreferenciasUsuario getInstance() {
        if (instancia == null) {
            instancia = new PreferenciasUsuario();
        }
        return instancia;
    }
    
  
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
