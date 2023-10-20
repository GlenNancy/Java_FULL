package br.com.arraylist.teste;

import javax.swing.JOptionPane;

import br.com.arraylist.model.Brigadeiro;

public class Teste {

	public static void main(String[] args) {
		
		//Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: ")
		
		Brigadeiro[] brigadeiro = new Brigadeiro[3];
		
		double pesoChocolate = 0.0;
		String apelidoBrigadeiro = "";
		
		for(int i = 0; i < brigadeiro.length; i++) {
			pesoChocolate = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do chocolate: "));
			apelidoBrigadeiro = JOptionPane.showInputDialog("Digite o apelido do brigadeiro: ");
			
			brigadeiro[i] = new Brigadeiro();
			brigadeiro[i].setPesoChocolate(pesoChocolate);
			brigadeiro[i].setApelidoBrigadeiro(apelidoBrigadeiro);
		}
		
		for(int i = 0; i < brigadeiro.length; i++) {
			System.out.println("\nPeso do brigadeiro: " + brigadeiro[i].getPesoChocolate());
			System.out.println("Apelido do brigadeiro: " + brigadeiro[i].getApelidoBrigadeiro());
		}
	}

}
