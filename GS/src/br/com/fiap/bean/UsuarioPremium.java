package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nome) {
        super(nome);
    }

    @Override
    public String tomarDecisao() {
        Residuo residuo = getResiduo();
        double tijolos = residuo.calcularTijolos();
        return "Olá " + getNome() + " (Usuário Premium), você pode produzir aproximadamente " + tijolos + " tijolos sustentáveis.";
    }

    public void exibirReceita() {
        String receita = "Receita para produzir tijolos sustentáveis:\n\n" +
                         "1. Separe os resíduos (plástico e sargaço) corretamente.\n" +
                         "2. Triture o plástico em pedaços pequenos.\n" +
                         "3. Misture o plástico triturado com o sargaço em uma proporção de 1:1.\n" +
                         "4. Adicione a mistura em moldes de tijolos.\n" +
                         "5. Comprimir a mistura nos moldes até ficar compacta.\n" +
                         "6. Deixe secar ao sol por 24 horas ou use um forno para acelerar o processo.\n" +
                         "7. Retire os tijolos dos moldes e armazene em local seco.\n\n" +
                         "Agora você tem tijolos sustentáveis prontos para uso!";
        JOptionPane.showMessageDialog(null, receita);
    }
}