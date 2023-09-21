package br.com.construtora.teste;

import javax.swing.JOptionPane;

import br.com.construtora.model.Casa;

public class TesteCasa {

	public static void main(String[] args) {

		Casa casa = new Casa();

		casa.setNome(JOptionPane.showInputDialog("Digite o nome da casa: "));
		casa.setMetrosQuadradosConstruido(
				Double.parseDouble(JOptionPane.showInputDialog("Digite os metros quadrados construido: ")));
		casa.setMetrosQuadradosTerreno(
				Double.parseDouble(JOptionPane.showInputDialog("Digite os metros quadrados do terreno: ")));
		casa.setTipoTelhado(JOptionPane.showInputDialog("Digite o tipo de telhado da casa: "));

		casa.mostrarAtributos();

		System.out.println("\nArea não construida: " + casa.areaNaoConstruida());
	}
}
