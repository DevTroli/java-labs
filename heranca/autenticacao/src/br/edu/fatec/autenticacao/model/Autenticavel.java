package br.edu.fatec.autenticacao.model;

public interface Autenticavel {
	boolean login(String usuario, String senha);
	void logout();
}
