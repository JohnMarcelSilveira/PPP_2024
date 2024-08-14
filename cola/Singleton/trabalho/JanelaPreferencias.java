import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPreferencias extends JFrame {
    private JTextField campoNomeUsuario;
    private JComboBox<String> caixaIdioma;
    private JComboBox<String> caixaTema;
    private JComboBox<String> caixaVersao;

    public JanelaPreferencias() {
        setTitle("Preferências do Usuário");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(5, 2));

        add(new JLabel("Nome de Usuário:"));
        campoNomeUsuario = new JTextField(20);
        add(campoNomeUsuario);

        add(new JLabel("Idioma:"));
        String[] idiomas = {"Inglês", "Português", "Espanhol"};
        caixaIdioma = new JComboBox<>(idiomas);
        add(caixaIdioma);

        add(new JLabel("Tema:"));
        String[] temas = {"Claro", "Escuro"};
        caixaTema = new JComboBox<>(temas);
        add(caixaTema);
        
        add(new JLabel("Versão:"));
        String[] versoes = {"1.0", "1.5", "2.0"};
        caixaVersao = new JComboBox<>(versoes);
        add(caixaVersao);

        JButton botaoAplicar = new JButton("Aplicar");
        add(botaoAplicar);

        botaoAplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aplicarPreferencias();
            }
        });

        setVisible(true);
    }

    private void aplicarPreferencias() {
        PreferenciasUsuario prefs = PreferenciasUsuario.getInstance();

        prefs.setNomeUsuario(campoNomeUsuario.getText());
        prefs.setIdioma((String) caixaIdioma.getSelectedItem());
        prefs.setTema((String) caixaTema.getSelectedItem());
        prefs.setVersao((String) caixaVersao.getSelectedItem());

        aplicarTema(prefs.getTema());
        aplicarIdioma(prefs.getIdioma());

        JOptionPane.showMessageDialog(this, "Preferências Aplicadas!");
    }

    private void aplicarTema(String tema) {
        if (tema.equals("Escuro")) {
            getContentPane().setBackground(Color.DARK_GRAY);
            for (Component comp : getContentPane().getComponents()) {
                comp.setForeground(Color.LIGHT_GRAY);
            }
        } else {
            getContentPane().setBackground(Color.LIGHT_GRAY);
            for (Component comp : getContentPane().getComponents()) {
                comp.setForeground(Color.BLACK);
            }
        }
    }

    private void aplicarIdioma(String idioma) {
        if (idioma.equals("Português")) {
            ((JLabel) getContentPane().getComponent(0)).setText("Nome de Usuário:");
            ((JLabel) getContentPane().getComponent(2)).setText("Idioma:");
            ((JLabel) getContentPane().getComponent(4)).setText("Tema:");
            ((JLabel) getContentPane().getComponent(6)).setText("Versão:");
        } else if (idioma.equals("Espanhol")) {
            ((JLabel) getContentPane().getComponent(0)).setText("Nombre de Usuario:");
            ((JLabel) getContentPane().getComponent(2)).setText("Idioma:");
            ((JLabel) getContentPane().getComponent(4)).setText("Tema:");
            ((JLabel) getContentPane().getComponent(6)).setText("Versión:");
        } else {
            ((JLabel) getContentPane().getComponent(0)).setText("Username:");
            ((JLabel) getContentPane().getComponent(2)).setText("Language:");
            ((JLabel) getContentPane().getComponent(4)).setText("Theme:");
            ((JLabel) getContentPane().getComponent(6)).setText("Version:");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JanelaPreferencias();
            }
        });
    }
}
