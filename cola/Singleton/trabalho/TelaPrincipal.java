public class TelaPrincipal {
    public void exibir() {
        PreferenciasUsuario prefs = PreferenciasUsuario.getInstance();
        System.out.println("Tela Principal");
        System.out.println("Idioma: " + prefs.getIdioma());
        System.out.println("Tema: " + prefs.getTema());
        System.out.println("Versão: " + prefs.getVersao());
        System.out.println("Nome de Usuário: " + prefs.getNomeUsuario());
    }
}

public class TelaConfiguracoes {
    public void exibir() {
        PreferenciasUsuario prefs = PreferenciasUsuario.getInstance();
        System.out.println("Tela de Configurações");
        System.out.println("Idioma: " + prefs.getIdioma());
        System.out.println("Tema: " + prefs.getTema());
        System.out.println("Versão: " + prefs.getVersao());
        System.out.println("Nome de Usuário: " + prefs.getNomeUsuario());
    }
}

public class TelaPerfilUsuario {
    public void exibir() {
        PreferenciasUsuario prefs = PreferenciasUsuario.getInstance();
        System.out.println("Tela de Perfil do Usuário");
        System.out.println("Idioma: " + prefs.getIdioma());
        System.out.println("Tema: " + prefs.getTema());
        System.out.println("Versão: " + prefs.getVersao());
        System.out.println("Nome de Usuário: " + prefs.getNomeUsuario());
    }
}
