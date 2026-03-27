package br.edu.fatecpg.banco.model;

public class ContaBancariaModel {
    private String titular;
    private double saldo;

    public ContaBancariaModel(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo() { return this.saldo; }
    public String getTitular() { return this.titular; }
}