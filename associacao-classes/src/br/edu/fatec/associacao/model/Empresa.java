package br.edu.fatec.associacao.model;

public class Empresa {
    private String nome;
    private Funcionario[] funcionarios;
    private Cliente[] clientes;
    private int qtdFuncionarios;
    private int qtdClientes;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new Funcionario[5];
        this.clientes = new Cliente[10];
        this.qtdFuncionarios = 0;
        this.qtdClientes = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(String nome, String cargo, double salario) {
        if (qtdFuncionarios < funcionarios.length) {
            funcionarios[qtdFuncionarios] = new Funcionario(nome, cargo, salario);
            qtdFuncionarios++;
            System.out.println("Funcionário " + nome + " adicionado com sucesso!");
        } else {
            System.out.println("Limite de funcionários atingido (máximo 5).");
        }
    }

    public void adicionarCliente(String nome, String email) {
        if (qtdClientes < clientes.length) {
            clientes[qtdClientes] = new Cliente(nome, email);
            qtdClientes++;
            System.out.println("Cliente " + nome + " adicionado com sucesso!");
        } else {
            System.out.println("Limite de clientes atingido (máximo 10).");
        }
    }

    public void exibirFuncionarios() {
        if (qtdFuncionarios == 0) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("\n=== Funcionários da " + nome + " ===");
        for (int i = 0; i < qtdFuncionarios; i++) {
            Funcionario f = funcionarios[i];
            System.out.println("Nome: " + f.getNome()
                    + " | Cargo: " + f.getCargo()
                    + " | Salário: R$ " + String.format("%.2f", f.getSalario()));
        }
    }

    public void exibirClientes() {
        if (qtdClientes == 0) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("\n=== Clientes da " + nome + " ===");
        for (int i = 0; i < qtdClientes; i++) {
            Cliente c = clientes[i];
            System.out.println("Nome: " + c.getNome() + " | Email: " + c.getEmail());
        }
    }

    public void calcularFolhaSalarial() {
        double total = 0;
        for (int i = 0; i < qtdFuncionarios; i++) {
            total += funcionarios[i].getSalario();
        }
        System.out.println("\n=== Folha Salarial da " + nome + " ===");
        System.out.println("Total gasto com salários: R$ " + String.format("%.2f", total));
    }
}
