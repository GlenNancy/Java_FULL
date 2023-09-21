package br.com.construtora.teste;

import br.com.construtora.model.Casa;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Casa casa = new Casa();
		
		casa.setMetrosQuadrado(62.5);
		casa.setTamanhoPortaoMetrosQuadrados(5.2);
		
		/*System.out.println("Metros Quadrados da casa: " + casa.getMetrosQuadrado() + 
				"\nTamanho do portão da casa: " + casa.getTamanhoPortaoMetrosQuadrados());*/
		
		System.out.println(casa.MostrarAtributos());
	}

}
