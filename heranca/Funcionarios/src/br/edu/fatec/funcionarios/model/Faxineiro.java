package br.edu.fatec.funcionarios.model;

public class Faxineiro implements Funcionario {

    private String nome;
    private String cargo;
    private double salario;
    private String turno;

    public Faxineiro(String nome, double salario, String turno) {
        this.nome= nome;
        this.cargo= "Faxineiro";
        this.salario= salario;
        this.turno= turno;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Turno: " + turno);
    }

    @Override
    public void baterPonto() {
        System.out.println(nome + " (" + cargo + " - turno " + turno + ") bateu o ponto.");
    }

    @Override
    public void solicitarMaterial() {
        System.out.println(nome + " solicitou vassoura, balde e produto de limpeza.");
    }
}
