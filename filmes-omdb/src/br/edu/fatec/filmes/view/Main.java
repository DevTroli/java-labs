package br.edu.fatec.filmes.view;

import br.edu.fatec.filmes.model.ConverteDados;
import br.edu.fatec.filmes.model.DadosFilme;
import br.edu.fatec.filmes.model.LogService;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

  static final String API_KEY = "8b59b184";
  static final String API_URL = "https://www.omdbapi.com/";
  static final HttpClient http = HttpClient.newHttpClient();
  static final ConverteDados conversor = new ConverteDados();
  static final LogService log = new LogService();

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int opcao = 0;
    do {
      System.out.println(
          """
              \n=== CONSULTA DE FILMES (OMDb) ===
              1. Consultar
              2. Listar
              3. Sair\
              """);
      System.out.print("Opcao: ");
      String input = sc.nextLine().trim();
      try {
        opcao = Integer.parseInt(input);
      } catch (NumberFormatException e) {
        System.out.println("Opção inválida. Digite um número (1, 2 ou 3).");
        continue;
      }

      switch (opcao) {
        case 1 -> {
          System.out.print("Titulo do filme: ");
          consultar(sc.nextLine().trim());
        }
        case 2 -> log.listar();
        case 3 -> System.out.println("Saindo...");
        default -> System.out.println("Opção inválida. Digite 1, 2 ou 3.");
      }
    } while (opcao != 3);
  }

  static void consultar(String titulo) {
    try {
      String url = API_URL + "?t=" + titulo.replace(" ", "+") + "&apikey=" + API_KEY;
      HttpRequest req = HttpRequest.newBuilder(URI.create(url)).build();
      HttpResponse<String> res = http.send(req, HttpResponse.BodyHandlers.ofString());

      DadosFilme filme = conversor.obterDados(res.body(), DadosFilme.class);
      if (!filme.encontrado()) {
        System.out.println("Filme nao encontrado.");
        return;
      }
      System.out.println(filme);
      log.registrar(filme.titulo + " (" + filme.ano + ")");
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
