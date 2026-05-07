package br.edu.fatec.funcionarios.view;

import br.edu.fatec.funcionarios.model.Gerente;
import br.edu.fatec.funcionarios.model.Vendedor;
import br.edu.fatec.funcionarios.model.Faxineiro;

public class FuncionarioView {

	public void executar() {
		Gerente g = new Gerente("Carlos", 8000.00, "Financeiro");
		g.exibirDados();
		System.out.println();
		g.baterPonto();
		g.fecharCaixa();
		g.solicitarMaterial();

		System.out.println();

		Vendedor v = new Vendedor("Ana", 2500.00, 0.05);
		v.exibirDados();
		System.out.println();
		v.baterPonto();
		v.realizarVenda(350.00);
		v.realizarVenda(1200.00);
		v.solicitarMaterial();

		System.out.println();

		Faxineiro f = new Faxineiro("João", 1800.00, "Noturno");
		f.exibirDados();
		System.out.println();
		f.baterPonto();
		f.solicitarMaterial();
	}
}
