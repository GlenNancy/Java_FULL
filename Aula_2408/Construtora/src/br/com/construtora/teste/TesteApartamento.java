package br.com.construtora.teste;

import javax.swing.JOptionPane;

import br.com.construtora.model.Apartamento;

public class TesteApartamento {

	public static void main(String[] args) {

		Apartamento apartamento = new Apartamento();

		apartamento.setNome(JOptionPane.showInputDialog("Digite o nome do apartamento: "));
		apartamento.setMetrosQuadradosConstruido(
				Double.parseDouble(JOptionPane.showInputDialog("Digite os metros quadrados construido: ")));
		apartamento.setMetrosQuadradosTerreno(
				Double.parseDouble(JOptionPane.showInputDialog("Digite os metros quadrados do terreno: ")));
		apartamento.setAndar(Integer.parseInt(JOptionPane.showInputDialog("Digite quantos andares tem o apartamento: ")));

		apartamento.mostrarAtributos();
	}

}
