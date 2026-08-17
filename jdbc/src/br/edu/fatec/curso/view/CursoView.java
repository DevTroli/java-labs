package br.edu.fatec.curso.view;

import br.edu.fatec.curso.model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CursoView {

  public static void main(String[] args) throws SQLException {
    Scanner scanner = new Scanner(System.in);
    Connection conn = Curso.getConnection();
    int opcao;

    do {
      System.out.println("\n===== MENU CURSOS =====");
      System.out.println("1 - Inserir curso");
      System.out.println("2 - Listar cursos");
      System.out.println("3 - Atualizar curso");
      System.out.println("4 - Deletar curso");
      System.out.println("0 - Sair");
      System.out.print("Escolha uma opcao: ");
      opcao = Integer.parseInt(scanner.nextLine());

      try {
        switch (opcao) {
          case 1:
            System.out.print("Nome do curso: ");
            String nome = scanner.nextLine();
            System.out.print("Periodo: ");
            String periodo = scanner.nextLine();

            PreparedStatement inserir =
                conn.prepareStatement("INSERT INTO curso (nome, periodo) VALUES (?, ?)");
            inserir.setString(1, nome);
            inserir.setString(2, periodo);
            inserir.executeUpdate();
            System.out.println("Curso inserido com sucesso.");
            break;

          case 2:
            PreparedStatement listar = conn.prepareStatement("SELECT * FROM curso");
            ResultSet rs = listar.executeQuery();
            while (rs.next()) {
              System.out.println(
                  "ID: "
                      + rs.getInt("id")
                      + " | Nome: "
                      + rs.getString("nome")
                      + " | Periodo: "
                      + rs.getString("periodo")
                      + "h");
            }
            break;

          case 3:
            System.out.print("ID do curso a atualizar: ");
            int idAtualizar = Integer.parseInt(scanner.nextLine());
            System.out.print("Novo nome: ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo periodo: ");
            String novoPeriodo = scanner.nextLine();

            PreparedStatement atualizar =
                conn.prepareStatement("UPDATE curso SET nome = ?, periodo = ? WHERE id = ?");
            atualizar.setString(1, novoNome);
            atualizar.setString(2, novoPeriodo);
            atualizar.setInt(3, idAtualizar);
            atualizar.executeUpdate();
            System.out.println("Curso atualizado com sucesso.");
            break;

          case 4:
            System.out.print("ID do curso a deletar: ");
            int idDeletar = Integer.parseInt(scanner.nextLine());

            PreparedStatement deletar = conn.prepareStatement("DELETE FROM curso WHERE id = ?");
            deletar.setInt(1, idDeletar);
            deletar.executeUpdate();
            System.out.println("Curso deletado com sucesso.");
            break;

          case 0:
            System.out.println("Encerrando o programa...");
            break;

          default:
            System.out.println("Opcao invalida.");
        }
      } catch (SQLException e) {
        System.out.println("Erro no banco de dados: " + e.getMessage());
      }

    } while (opcao != 0);

    conn.close();
    scanner.close();
  }
}
