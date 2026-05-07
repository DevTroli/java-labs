package br.edu.fatec.funcionarios.model;

public class Gerente implements Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        this.nome= nome;
        this.cargo= "Gerente";
        this.salario= salario;
        this.departamento=departamento;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Departamento: " + departamento);
    }

    @Override
    public void baterPonto() {
        System.out.println(nome + " (" + cargo + ") bateu o ponto.");
    }

    @Override
    public void solicitarMaterial() {
        System.out.println(nome + " solicitou material para o departamento de " + departamento + ".");
    }

    public void fecharCaixa() {
        System.out.println(nome + " fechou o caixa do departamento de " + departamento + ".");
    }
}
