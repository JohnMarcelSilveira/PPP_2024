package apresentacao;
import negocio.Configuracao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OutraTelaConfiguracao {

    public static void main(String[] args) {
        // Executar a interface gráfica no Event Dispatch Thread
        SwingUtilities.invokeLater(() -> criarInterfaceOutraTela());
    }

    private static void criarInterfaceOutraTela() {
        Configuracao config = Configuracao.getInstancia();

        // Criar a janela
        JFrame frame = new JFrame("Outra Tela de Configurações");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;

        
        JLabel labelNomeUsuario = new JLabel("Nome de Usuário:");
        JTextField textNomeUsuario = new JTextField(15);
        textNomeUsuario.setText(config.getNomeUsuario());

        
        JLabel labelIdioma = new JLabel("Idioma:");
        String[] idiomas = { "Português", "Inglês", "Espanhol", "Francês" };
        JComboBox<String> comboIdioma = new JComboBox<>(idiomas);
        comboIdioma.setSelectedItem(config.getIdioma());

        
        JLabel labelTema = new JLabel("Tema:");
        JRadioButton radioClaro = new JRadioButton("Claro");
        JRadioButton radioEscuro = new JRadioButton("Escuro");
        ButtonGroup groupTema = new ButtonGroup();
        groupTema.add(radioClaro);
        groupTema.add(radioEscuro);

        if (config.getTema().equals("Claro")) {
            radioClaro.setSelected(true);
        } else {
            radioEscuro.setSelected(true);
        }

        
        JLabel labelVersao = new JLabel("Versão:");
        JSlider sliderVersao = new JSlider(1, 10, Integer.parseInt(config.getVersao().split("\\.")[0]));
        sliderVersao.setMajorTickSpacing(1);
        sliderVersao.setPaintTicks(true);
        sliderVersao.setPaintLabels(true);

       
        JTextArea textAreaConfigAtual = new JTextArea(15, 30);
        textAreaConfigAtual.setEditable(false);
        textAreaConfigAtual.setText(exibirConfiguracoes(config));
        JScrollPane scrollPane = new JScrollPane(textAreaConfigAtual);

        
        JButton botaoSalvar = new JButton("Salvar Configurações");

        // Listener para o botão salvar
        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Atualiza as configurações
                config.setNomeUsuario(textNomeUsuario.getText());
                config.setIdioma(comboIdioma.getSelectedItem().toString());
                config.setTema(radioClaro.isSelected() ? "Claro" : "Escuro");
                config.setVersao(sliderVersao.getValue() + ".0");

                
                textAreaConfigAtual.setText(exibirConfiguracoes(config));
                
                JOptionPane.showMessageDialog(frame, "Configurações Atualizadas!");
            }
        });

        
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(labelNomeUsuario, gbc);

        gbc.gridx = 1;
        frame.add(textNomeUsuario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(labelIdioma, gbc);

        gbc.gridx = 1;
        frame.add(comboIdioma, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(labelTema, gbc);

        gbc.gridx = 1;
        frame.add(radioClaro, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        frame.add(radioEscuro, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        frame.add(labelVersao, gbc);

        gbc.gridx = 1;
        frame.add(sliderVersao, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        frame.add(new JLabel("Configurações Atuais:"), gbc);

        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 1;
        frame.add(scrollPane, gbc);

        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weighty = 0;
        frame.add(botaoSalvar, gbc);

        // Tornar a janela visível
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Método para exibir as configurações atuais em uma String formatada
    private static String exibirConfiguracoes(Configuracao config) {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome de Usuário: ").append(config.getNomeUsuario()).append("\n");
        sb.append("Idioma: ").append(config.getIdioma()).append("\n");
        sb.append("Tema: ").append(config.getTema()).append("\n");
        sb.append("Versão: ").append(config.getVersao()).append("\n");
        return sb.toString();
    }
}
