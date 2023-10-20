package br.com.array.teste;

import javax.swing.JOptionPane;

public class TesteNumero {

	public static void main(String[] args) {
		
		int[] numero = new int[3];
		
		numero[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		numero[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		numero[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));
		
		for(int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}
	}

}
