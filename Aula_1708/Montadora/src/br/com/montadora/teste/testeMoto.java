package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Moto;

public class testeMoto{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Moto moto = new Moto();

		moto.setModelo(JOptionPane.showInputDialog("Digite o modelo da moto: "));
		moto.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da moto: ")));
		moto.setQuantidadeAdesivos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de adesivos da moto: ")));
		
		/*System.out.println("Modelo da moto: " + moto.getModelo() + 
				"\nQuantidade de Adesivos: " + moto.getQuantidadeAdesivos() + "\nPeso da moto: " + moto.getPeso());*/
		
		System.out.println(moto.MostrarAtributos());
		}
}
