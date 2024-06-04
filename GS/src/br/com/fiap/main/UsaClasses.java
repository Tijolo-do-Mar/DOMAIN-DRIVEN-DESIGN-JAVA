package br.com.fiap.main;

import br.com.fiap.bean.Usuario;
import br.com.fiap.bean.UsuarioPremium;
import javax.swing.JOptionPane;

public class UsaClasses {
    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog("Digite seu nome:");
            Usuario usuario;

            String tipoUsuario;
            while (true) {
                tipoUsuario = JOptionPane.showInputDialog("Você é um usuário premium? (sim/não):");
                if (tipoUsuario != null && (tipoUsuario.equalsIgnoreCase("sim") || tipoUsuario.equalsIgnoreCase("não") || tipoUsuario.equalsIgnoreCase("nao"))) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, responda 'sim' ou 'não'.");
                }
            }

            if (tipoUsuario.equalsIgnoreCase("sim")) {
                usuario = new UsuarioPremium(nome);
            } else {
                usuario = new Usuario(nome);
            }

            double plastico = solicitarQuantidade("Digite a quantidade de plástico (em kg):");
            double sargaco = solicitarQuantidade("Digite a quantidade de sargaço (em kg):");

            usuario.informarResiduo(plastico, sargaco);

            String informacoes = usuario.tomarDecisao();
            JOptionPane.showMessageDialog(null, informacoes);

            if (usuario instanceof UsuarioPremium) {
                ((UsuarioPremium) usuario).exibirReceita();
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static double solicitarQuantidade(String mensagem) {
        while (true) {
            try {
                String quantidadeStr = JOptionPane.showInputDialog(mensagem);
                return Double.parseDouble(quantidadeStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
            }
        }
    }
}

