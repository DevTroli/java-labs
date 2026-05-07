package br.edu.fatec.funcionarios.model;

public class Vendedor implements Funcionario {

    private String nome;
    private String cargo;
    private double salarioBase;
    private double percentualComissao;
    private double totalVendido;

    public Vendedor(String nome, double salarioBase, double percentualComissao) {
        this.nome= nome;
        this.cargo= "Vendedor";
        this.salarioBase= salarioBase;
        this.percentualComissao= percentualComissao;
        this.totalVendido= 0;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salarioBase);
        System.out.println("Comissao: " + (percentualComissao * 100) + "%");
        System.out.println("Total vend.: R$ " + totalVendido);
        System.out.println("Salario c/ comissao: R$ " + calcularSalarioFinal());
    }

    @Override
    public void baterPonto() {
        System.out.println(nome + " (" + cargo + ") bateu o ponto.");
    }

    @Override
    public void solicitarMaterial() {
        System.out.println(nome + " solicitou materiais de escritório.");
    }

    public void realizarVenda(double valor) {
        totalVendido += valor;
        System.out.println(nome + " realizou uma venda de R$ " + valor
                         + ". Total vendido: R$ " + totalVendido);
    }

    public double calcularSalarioFinal() {
        return salarioBase + (totalVendido * percentualComissao);
    }
}
