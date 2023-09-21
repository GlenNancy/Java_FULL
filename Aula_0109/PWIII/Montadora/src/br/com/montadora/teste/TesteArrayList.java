package br.com.montadora.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.montadora.model.Carro;

public class TesteArrayList {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setModelo("Civic");
		carro.setPeso(1253.7);
		carro.setQtdeportas(4);
		
		
		Carro carroDois = new Carro();
		
		carroDois.setModelo("Corsa");
		carroDois.setPeso(12541.7);
		carroDois.setQtdeportas(4);
		
		List<Carro> vetorListaCarro = new ArrayList<Carro>();
		
		vetorListaCarro.add(carro);
		vetorListaCarro.add(carroDois);
		
		for(Carro c : vetorListaCarro) {
			System.out.println(c.getModelo() + " " + 
					c.getPeso() + " " + 
					c.getQtdeportas() + " " + "\n"
					);
		}

	}

}
