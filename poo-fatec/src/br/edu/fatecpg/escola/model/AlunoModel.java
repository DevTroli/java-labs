package br.edu.fatecpg.escola.model;

public class AlunoModel {
    private String nome;
    private double n1, n2, n3;

    public AlunoModel(String nome, double n1, double n2, double n3) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double calcularMedia() { return (n1 + n2 + n3) / 3; }

    public String getSituacao() {
        return calcularMedia() >= 7 ? "APROVADO" : "REPROVADO";
    }

    public String getNome() { return nome; }
}