package br.com.montadora.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.montadora.model.Carro;
import br.com.montadora.model.Moto;

public class TesteMoto {

	public static void main(String[] args) {
		
		Moto moto = new Moto();
		
		moto.setModelo("XJ6");
		moto.setPeso(220);
		moto.setQtdeadesivos(13);

		
		List<Moto> vetorListaMoto = new ArrayList<Moto>();
		
		vetorListaMoto.add(moto);
		
		for(Moto m : vetorListaMoto) {
			System.out.println(m.getModelo() + " " + 
					m.getPeso() + " " + 
					m.getQtdeadesivos() + " " + "\n"
					);
	}

	}
}
