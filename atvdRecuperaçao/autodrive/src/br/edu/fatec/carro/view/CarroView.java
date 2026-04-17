package br.edu.fatec.carro.view;

import br.edu.fatec.carro.model.Carro;

public class CarroView {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Toyota", "Corolla", 2021);
		Carro carro2 = new Carro("Ford", "Fiesta", 2024);

		carro1.ExibirInfos();
		carro2.ExibirInfos();
	}
}
