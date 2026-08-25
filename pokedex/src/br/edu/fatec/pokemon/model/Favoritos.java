package br.edu.fatec.pokemon.model;

import java.sql.*;


public class Favoritos {

    private String URL = "jdbc:postgresql://localhost:5432/pokedex";
    private String USER = "postgres";
    private String PASSWORD = "postgres";

    public Favoritos() {
        try (Connection con = conectar(); Statement st = con.createStatement()) {
            st.execute("CREATE TABLE IF NOT EXISTS favoritos (nome VARCHAR(50) PRIMARY KEY)");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar/criar tabela: " + e.getMessage());
        }
    }

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void inserir(String nome) throws SQLException {
        String sql = "INSERT INTO favoritos (nome) VALUES (?) ON CONFLICT DO NOTHING";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nome);
            ps.executeUpdate();
        }
    }

    public boolean existe(String nome) throws SQLException {
        String sql = "SELECT 1 FROM favoritos WHERE nome = ?";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nome);
            return ps.executeQuery().next();
        }
    }

    public boolean excluir(String nome) throws SQLException {
        String sql = "DELETE FROM favoritos WHERE nome = ?";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nome);
            return ps.executeUpdate() > 0;
        }
    }
}
