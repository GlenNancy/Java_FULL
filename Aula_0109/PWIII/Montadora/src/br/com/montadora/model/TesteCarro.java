package br.com.montadora.model;

import javax.swing.JOptionPane;



public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setModelo("Porsche");
		carro.setPeso(1500);
		carro.setQtdeportas(4);
		
		 Carro[] carroVetor = new Carro[3];
		 
		 String modelo = "";
		 double peso  = 0;
		 int qtdeportas = 0;
		 
		 for(int i=0; i<3; i= i +1) {
			 modelo = JOptionPane.showInputDialog("Digite o modelo");
			 peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
			 qtdeportas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas"));
			 
			 carroVetor[i] = new Carro();
			 carroVetor[i].setModelo(modelo);
			 carroVetor[i].setPeso(peso);
			 carroVetor[i].setQtdeportas(qtdeportas);
		 }
		 
for(int i=0; i<3; i= i +1) {
			 
			 System.out.println(carroVetor[i].getModelo() + " "
					 + carroVetor[i].getPeso() + " " + carroVetor[i].getQtdeportas() + "\n" 
					 );
		
		

	}

}
}
