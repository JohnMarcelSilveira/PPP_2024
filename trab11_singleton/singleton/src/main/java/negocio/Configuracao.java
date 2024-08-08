package negocio;

import java.io.*;
import java.util.Properties;

public class Configuracao {
    private static Configuracao instanciaUnica;
    private static final String ARQUIVO_PROPRIEDADES = "configuracao.properties";

    // Preferências do usuário
    private String idioma;
    private String tema;
    private String versao;
    private String nomeUsuario;

    // Construtor privado para evitar instanciamento externo
    private Configuracao() {
        // Carregar configurações do arquivo de propriedades
        carregarConfiguracoes();
    }

    // Método para obter a instância única da classe
    public static Configuracao getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Configuracao();
        }
        return instanciaUnica;
    }

    // Getters e Setters
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
        salvarConfiguracoes();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
        salvarConfiguracoes();
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
        salvarConfiguracoes();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        salvarConfiguracoes();
    }

    // Método para carregar configurações do arquivo de propriedades
    private void carregarConfiguracoes() {
        Properties propriedades = new Properties();
        try (InputStream input = new FileInputStream(ARQUIVO_PROPRIEDADES)) {
            propriedades.load(input);
            idioma = propriedades.getProperty("idioma", "Português");
            tema = propriedades.getProperty("tema", "Claro");
            versao = propriedades.getProperty("versao", "1.0");
            nomeUsuario = propriedades.getProperty("nomeUsuario", "Usuário");
        } catch (IOException e) {
            System.out.println("Arquivo de configuração não encontrado. Criando arquivo padrão.");
            idioma = "Português";
            tema = "Claro";
            versao = "1.0";
            nomeUsuario = "Usuário";
            salvarConfiguracoes();
        }
    }

    // Método para salvar configurações no arquivo de propriedades
    public void salvarConfiguracoes() {
        Properties propriedades = new Properties();
        propriedades.setProperty("idioma", idioma);
        propriedades.setProperty("tema", tema);
        propriedades.setProperty("versao", versao);
        propriedades.setProperty("nomeUsuario", nomeUsuario);

        try (OutputStream output = new FileOutputStream(ARQUIVO_PROPRIEDADES)) {
            propriedades.store(output, "Configurações do Usuário");
        } catch (IOException e) {
            System.err.println("Não foi possível salvar as configurações: " + e.getMessage());
        }
    }
}
