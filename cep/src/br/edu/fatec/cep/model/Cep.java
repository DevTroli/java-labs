package br.edu.fatec.cep.model;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Cep {
  public static String buscar(String cep) throws Exception {
    HttpClient client = HttpClient.newHttpClient();

    URI uri = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

    HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    return response.body();
  }
}
