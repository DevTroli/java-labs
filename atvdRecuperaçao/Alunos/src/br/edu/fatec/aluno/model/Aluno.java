package br.edu.fatec.aluno.model;

public class Aluno {
  private String nome;
  private int matricula;
  private double notaFinal;

  public Aluno() {}

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getMatricula() {
    return this.matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public double getNotaFinal() {
    return this.notaFinal;
  }

  public void setNotaFinal(double notaFinal) {
    this.notaFinal = notaFinal;
  }
}
