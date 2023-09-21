package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Carro;

public class testeCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro carro = new Carro();

		carro.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
		carro.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do carro: ")));
		carro.setQuantidadePortas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas do carro: ")));
		
		/*System.out.println("Modelo do Carro: " + carro.getModelo() + 
				"\nQuantidade de Portas: " + carro.getQuantidadePortas() + "\nPeso do carro: " + carro.getPeso());*/
		
		System.out.println(carro.MostrarAtributos());
		
	}
}
