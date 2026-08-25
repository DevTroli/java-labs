package br.edu.fatec.pokemon.view;

import br.edu.fatec.pokemon.model.Favoritos;
import br.edu.fatec.pokemon.model.Pokemon;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  static final String API_URL = "https://pokeapi.co/api/v2/pokemon";
  static final HttpClient http = HttpClient.newHttpClient();

  public static void main(String[] args) throws Exception {
    Favoritos crud = new Favoritos();
    Scanner sc = new Scanner(System.in);
    int opcao;
    do {
      System.out.println(
          """
          \n=== POKEDEX ===
          1. Listar pokemons disponiveis
          2. Cadastrar favorito
          3. Exibir favorito (com informacoes complementares)
          4. Excluir favorito
          0. Sair\
          """);
      System.out.print("Opcao: ");
      opcao = Integer.parseInt(sc.nextLine());

      switch (opcao) {
        case 1 -> listarPokemons();
        case 2 -> {
          System.out.print("Nome do pokemon para favoritar: ");
          cadastrarFavorito(crud, sc.nextLine().trim().toLowerCase());
        }
        case 3 -> {
          System.out.print("Nome do favorito para exibir: ");
          exibirFavorito(crud, sc.nextLine().trim().toLowerCase());
        }
        case 4 -> {
          System.out.print("Nome do favorito para excluir: ");
          excluirFavorito(crud, sc.nextLine().trim().toLowerCase());
        }
      }
    } while (opcao != 0);
  }

  static String buscarJson(String url) throws Exception {
    HttpRequest req = HttpRequest.newBuilder(URI.create(url)).build();
    HttpResponse<String> res = http.send(req, HttpResponse.BodyHandlers.ofString());
    if (res.statusCode() != 200) throw new RuntimeException("Nao encontrado (" + url + ")");
    return res.body();
  }

  static void listarPokemons() throws Exception {
    String json = buscarJson(API_URL + "?limit=50");
    Matcher m = Pattern.compile("\"name\":\"(.*?)\"").matcher(json);
    while (m.find()) System.out.println("- " + m.group(1));
  }

  static void cadastrarFavorito(Favoritos crud, String nome) {
    try {
      buscarJson(API_URL + "/" + nome); // valida que o pokemon existe na API
      crud.inserir(nome);
      System.out.println("Favorito cadastrado!");
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  static void exibirFavorito(Favoritos crud, String nome) {
    try {
      if (!crud.existe(nome)) {
        System.out.println("Esse pokemon nao esta na lista de favoritos.");
        return;
      }
      Pokemon p = Pokemon.fromJson(buscarJson(API_URL + "/" + nome));
      System.out.println(p);
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  static void excluirFavorito(Favoritos crud, String nome) {
    try {
      boolean ok = crud.excluir(nome);
      System.out.println(ok ? "Favorito excluido!" : "Favorito nao encontrado.");
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
