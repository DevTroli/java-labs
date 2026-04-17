package br.edu.fatec.farmacia.model;

public class Farmacia {
    private int maxMedicamentos = 100;
    private int diasProximoVencimento = 5;
    private double descontoVencimento = 0.50;

    private String[] nomesMedicamentos;
    private int[] diasParaVencimento;
    private double[] precos;
    private int quantidade;

    public Farmacia() {
        this.nomesMedicamentos = new String[maxMedicamentos];
        this.diasParaVencimento = new int[maxMedicamentos];
        this.precos = new double[maxMedicamentos];
        this.quantidade = 0;
    }

    public boolean cadastrar(String nome, int dias, double preco) {
        if (quantidade >= maxMedicamentos) {
            return false;
        }
        nomesMedicamentos[quantidade] = nome;
        diasParaVencimento[quantidade] = dias;
        precos[quantidade] = preco;
        quantidade++;
        return true;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome(int i) {
        return nomesMedicamentos[i];
    }

    public int getDiasVencimento(int i) {
        return diasParaVencimento[i];
    }

    public double getPreco(int i) {
        return precos[i];
    }

    public double calcularMediaDiasVencimento() {
        int soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma = soma + diasParaVencimento[i];
        }
        return (double) soma / quantidade;
    }

    public int contarProximosVencimento() {
        int contador = 0;
        for (int i = 0; i < quantidade; i++) {
            if (diasParaVencimento[i] < diasProximoVencimento) {
                contador++;
            }
        }
        return contador;
    }

    public int[] indicesProximosVencimento() {
        int[] indices = new int[quantidade];
        int j = 0;
        for (int i = 0; i < quantidade; i++) {
            if (diasParaVencimento[i] < diasProximoVencimento) {
                indices[j] = i;
                j++;
            }
        }
        return indices;
    }

    public void aplicarDescontoVencimento() {
        for (int i = 0; i < quantidade; i++) {
            if (diasParaVencimento[i] < diasProximoVencimento) {
                precos[i] = precos[i] * (1 - descontoVencimento);
            }
        }
    }

    public boolean vender(int indice) {
        if (indice < 0 || indice >= quantidade) {
            return false;
        }
        for (int i = indice; i < quantidade - 1; i++) {
            nomesMedicamentos[i] = nomesMedicamentos[i + 1];
            diasParaVencimento[i] = diasParaVencimento[i + 1];
            precos[i] = precos[i + 1];
        }
        quantidade--;
        return true;
    }

    public int buscarPorNome(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (nomesMedicamentos[i].equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }
}