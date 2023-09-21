package br.com.primeirovetor.teste;

import javax.swing.JOptionPane;

public class TesteDois {

	public static void main(String[] args) {
		
		
		int[] idadeVetor = new int[3];
		
		for(int i=0; i < 3; i++) {
			
			idadeVetor[i] = Integer.parseInt(JOptionPane.showInputDialog
					("Digite a " + (i+1) + " idade"));
		}
		
			for(int i=0; i < 3; i++) {
			
				System.out.println(idadeVetor[i]);
		}

	}

}
