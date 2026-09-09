package br.edu.fatec.filmes.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogService {

  private static final String ARQUIVO = "consultas.log";

  public void registrar(String entidade) {
    String timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    try (FileWriter fw = new FileWriter(ARQUIVO, true)) {
      fw.write("[" + timestamp + "] " + entidade + System.lineSeparator());
    } catch (IOException e) {
      System.out.println("Erro ao gravar log: " + e.getMessage());
    }
  }

  public void listar() {
    try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
      String linha;
      boolean vazio = true;
      while ((linha = reader.readLine()) != null) {
        System.out.println(linha);
        vazio = false;
      }
      if (vazio)
        System.out.println("Nenhuma consulta registrada ainda.");
    } catch (IOException e) {
      System.out.println("Nenhuma consulta registrada ainda.");
    }
  }
}
