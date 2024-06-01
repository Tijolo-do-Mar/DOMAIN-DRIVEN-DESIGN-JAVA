package br.com.fiap.bean;

public class Residuo {
	    private double quantidadePlastico;
	    private double quantidadeSargaco;

	    public Residuo(double quantidadePlastico, double quantidadeSargaco) {
	        this.quantidadePlastico = quantidadePlastico;
	        this.quantidadeSargaco = quantidadeSargaco;
	    }

	    // Método para calcular a quantidade de tijolos
	    public double calcularTijolos() {
	        double quantidadeTotal = this.quantidadePlastico + this.quantidadeSargaco;
	        return quantidadeTotal / 5;  // Supondo que 5kg de resíduo produzem um tijolo
	    }

	    // Método para exibir informações sobre os resíduos
	    public String exibirInformacoes() {
	        return "Quantidade de Plástico: " + this.quantidadePlastico + " kg\n" +
	               "Quantidade de Sargaço: " + this.quantidadeSargaco + " kg";
	    }
	}


