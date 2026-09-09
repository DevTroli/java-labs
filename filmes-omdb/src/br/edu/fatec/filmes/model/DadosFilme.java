package br.edu.fatec.filmes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DadosFilme {
  @JsonProperty("Title")
  public String titulo;

  @JsonProperty("Year")
  public String ano;

  @JsonProperty("Genre")
  public String genero;

  @JsonProperty("Director")
  public String diretor;

  @JsonProperty("Plot")
  public String sinopse;

  @JsonProperty("imdbRating")
  public String notaImdb;

  @JsonProperty("Response")
  public String resposta;

  public boolean encontrado() {
    return "True".equalsIgnoreCase(resposta);
  }

  @Override
  public String toString() {
    return "Titulo: "
        + titulo
        + "\nAno: "
        + ano
        + "\nGenero: "
        + genero
        + "\nDiretor: "
        + diretor
        + "\nNota IMDb: "
        + notaImdb
        + "\nSinopse: "
        + sinopse;
  }
}
