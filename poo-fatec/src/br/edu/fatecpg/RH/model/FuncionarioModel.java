package br.edu.fatecpg.RH.model;

public class FuncionarioModel {
    public String nome;
    public double salario;

    public FuncionarioModel(String nome, double salarioInicial) {
        this.nome = nome;
        this.salario = salarioInicial;
    }

    public void aplicarAumento(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public double calcularSalarioAnual() {
        return this.salario * 12;
    }

    public String getNome() { return nome; }
    public double getSalario() { return salario; }
}