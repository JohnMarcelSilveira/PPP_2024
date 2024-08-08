package apresentacao;

import javax.swing.*;

import negocio.Configuracao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicativoConfiguracao {

    public static void main(String[] args) {        
        SwingUtilities.invokeLater(() -> {
            criarInterface();
        });
    }

    private static void criarInterface() {        
        Configuracao config = Configuracao.getInstancia();
        
        JFrame frame = new JFrame("Configurações do Usuário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2));

        
        JLabel labelNomeUsuario = new JLabel("Nome de Usuário:");
        JTextField textNomeUsuario = new JTextField(config.getNomeUsuario());

        JLabel labelIdioma = new JLabel("Idioma:");
        JTextField textIdioma = new JTextField(config.getIdioma());

        JLabel labelTema = new JLabel("Tema:");
        JTextField textTema = new JTextField(config.getTema());

        JLabel labelVersao = new JLabel("Versão:");
        JTextField textVersao = new JTextField(config.getVersao());

      
        JButton botaoSalvar = new JButton("Salvar Configurações");

       
        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                config.setNomeUsuario(textNomeUsuario.getText());
                config.setIdioma(textIdioma.getText());
                config.setTema(textTema.getText());
                config.setVersao(textVersao.getText());
                config.salvarConfiguracoes();

              
                JOptionPane.showMessageDialog(frame, "Configurações Salvas!");
            }
        });

        
        frame.add(labelNomeUsuario);
        frame.add(textNomeUsuario);
        frame.add(labelIdioma);
        frame.add(textIdioma);
        frame.add(labelTema);
        frame.add(textTema);
        frame.add(labelVersao);
        frame.add(textVersao);
        frame.add(new JLabel()); 
        frame.add(botaoSalvar);

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
