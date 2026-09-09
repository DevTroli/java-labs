package br.edu.fatec.stream.view;

import br.edu.fatec.stream.model.Produto;
import br.edu.fatec.stream.model.Funcionario;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        tarefaProdutos();
        System.out.println();
        tarefaFuncionarios();
    }

    static void tarefaProdutos() {
        System.out.println("=== PRODUTOS ===");

        List<Produto> produtos = Arrays.asList(
                new Produto("Celular", "Eletronicos", 1500),
                new Produto("Notebook", "Eletronicos", 3500),
                new Produto("Camiseta", "Roupas", 60),
                new Produto("Calca", "Roupas", 120),
                new Produto("Livro Java", "Livros", 80),
                new Produto("Livro Historia", "Livros", 50)
        );

        List<Produto> eletronicos = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletronicos"))
                .collect(Collectors.toList());

        List<Produto> comDesconto = eletronicos.stream()
                .map(p -> new Produto(p.getNome(), p.getCategoria(), p.getPreco() * 0.9))
                .sorted((a, b) -> Double.compare(a.getPreco(), b.getPreco()))
                .collect(Collectors.toList());

        System.out.println("Eletronicos com 10% de desconto (ordenado por preco):");
        comDesconto.forEach(System.out::println);

        double totalRoupas = produtos.stream()
                .filter(p -> p.getCategoria().equals("Roupas"))
                .map(Produto::getPreco)
                .reduce(0.0, Double::sum);
        System.out.println("Total gasto em Roupas: R$" + String.format("%.2f", totalRoupas));

        Map<String, Double> mediaPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.averagingDouble(Produto::getPreco)));
        System.out.println("Preco medio por categoria: " + mediaPorCategoria);
    }

    static void tarefaFuncionarios() {
        System.out.println("=== FUNCIONARIOS ===");

        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Ana", "TI", 4500, 5),
                new Funcionario("Bruno", "TI", 2800, 12),
                new Funcionario("Carla", "RH", 3200, 3),
                new Funcionario("Diego", "Vendas", 2500, 11),
                new Funcionario("Elaine", "Vendas", 5200, 2),
                new Funcionario("Felipe", "RH", 3900, 10),
                new Funcionario("Giovana", "TI", 6000, 15),
                new Funcionario("Hugo", "Vendas", 2900, 1)
        );

        List<Funcionario> acimaDe3000 = funcionarios.stream()
                .filter(f -> f.getSalario() > 3000)
                .collect(Collectors.toList());

        List<Funcionario> comAumento = acimaDe3000.stream()
                .map(f -> f.getAnosDeServico() >= 10
                        ? new Funcionario(f.getNome(), f.getDepartamento(), f.getSalario() * 1.05, f.getAnosDeServico())
                        : f)
                .collect(Collectors.toList());

        List<Funcionario> ordenados = comAumento.stream()
                .sorted((a, b) -> a.getNome().compareTo(b.getNome()))
                .collect(Collectors.toList());

        System.out.println("Funcionarios (salario > 3000, com aumento e ordenados por nome):");
        ordenados.forEach(System.out::println);

        double totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(0.0, Double::sum);
        System.out.println("Total de salarios: R$" + String.format("%.2f", totalSalarios));

        Map<String, Double> mediaPorDepartamento = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento,
                        Collectors.averagingDouble(Funcionario::getSalario)));
        System.out.println("Media salarial por departamento: " + mediaPorDepartamento);
    }
}
