package br.edu.fatec.pokemon.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pokemon {

  public String nome;
  public int altura;
  public int peso;
  public String tipo;

  public Pokemon(String nome, int altura, int peso, String tipo) {
    this.nome = nome;
    this.altura = altura;
    this.peso = peso;
    this.tipo = tipo;
  }

  public static Pokemon fromJson(String json) {
    String nome = extrair(json, "\"name\":\"(.*?)\"");
    int altura = Integer.parseInt(extrair(json, "\"height\":(\\d+)"));
    int peso = Integer.parseInt(extrair(json, "\"weight\":(\\d+)"));
    String tipo = extrair(json, "\"type\":\\{\"name\":\"(.*?)\"");
    return new Pokemon(nome, altura, peso, tipo);
  }

  private static String extrair(String json, String regex) {
    Matcher m = Pattern.compile(regex).matcher(json);
    return m.find() ? m.group(1) : "?";
  }

  @Override
  public String toString() {
    return "Nome: " + nome + "\nAltura: " + altura + "\nPeso: " + peso + "\nTipo: " + tipo;
  }
}
