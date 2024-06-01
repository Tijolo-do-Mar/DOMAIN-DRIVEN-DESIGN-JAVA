package br.com.fiap.bean;

public class Usuario {
    private String nome;
    private Residuo residuo;  // Alterado de protected para private

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public void informarResiduo(double plastico, double sargaco) {
        this.residuo = new Residuo(plastico, sargaco);
    }

    public void informarResiduo() {
        this.residuo = new Residuo(0, 0);
    }

    public String tomarDecisao() {
        double tijolos = residuo.calcularTijolos();
        return "Olá " + this.nome + ", você pode produzir aproximadamente " + tijolos + " tijolos sustentáveis.";
    }
}